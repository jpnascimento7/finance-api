package api_financas.controller;

import api_financas.model.Transacao;
import api_financas.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {

    @Autowired
    private TransacaoRepository repository;

    // 1. Rota para CRIAR uma nova transacao (POST)
    @PostMapping
    public Transacao criarTransacao(@RequestBody Transacao transacao) {
        return repository.save(transacao);
    }

    // 2. Rota para BUSCAR TODAS as transacoes (GET)
    @GetMapping
    public List<Transacao> listarTodas() {
        return repository.findAll();
    }

    // 3.Rota para Deletar uma transação pelo id
    @DeleteMapping("/{id}")
    public void deletarTransacao(@PathVariable long id){
        repository.deleteById(id);
    }

    // 4.Rota para pegar o resumo financeiro (GET/transações/RESUMO)
    @GetMapping("/resumo")
    public api_financas.dto.ResumoDTO obterResumo() {
        List<Transacao> todas = repository.findAll();

        BigDecimal totalReceitas = BigDecimal.ZERO;
        BigDecimal totalDespesas = BigDecimal.ZERO;

        for (Transacao t : todas) {
            if ("Receita".equalsIgnoreCase(t.getTipo())){
                totalReceitas = totalReceitas.add(t.getValor());
            } else if ("DESPESA".equalsIgnoreCase(t.getTipo())) {
                totalDespesas = totalDespesas.add((t.getValor()));
            }
        }
        BigDecimal saldo = totalReceitas.subtract(totalDespesas);

        return new api_financas.dto.ResumoDTO(totalReceitas, totalDespesas, saldo);
    }
    // 5. Rota para Atualizar uma transação já existente (PUT/transações/{id})
    @PutMapping("/{id}")
    public Transacao atualizarTransacao(@PathVariable Long id, @RequestBody Transacao transacaoAtualizada) {
        return repository.findById(id).map(transacaoExistente -> {
            transacaoExistente.setDescricao(transacaoAtualizada.getDescricao());
            transacaoExistente.setValor(transacaoAtualizada.getValor());
            transacaoExistente.setTipo(transacaoAtualizada.getTipo());
            transacaoExistente.setData(transacaoAtualizada.getData());
            return repository.save(transacaoExistente);
        }).orElse(null);
    }
}