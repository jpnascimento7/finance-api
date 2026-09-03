package api_financas.model;

import jakarta.persistence.*; // IMPORTA JPA QUE CONECTA O SPRING COM O DATABASE
import io.swagger.v3.oas.annotations.media.Schema; // IMPORTA O SWAGGER
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity // AVISA O SPRING QUE VAI VIRAR UMA TABELA NO MYSQL
@Table(name = "tb_transacoes") // NOME DA TABELA

public class Transacao {
    @Id // DEFINE COMO PRIMARY KEY
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT NO MYSQL
    // DEFINIR AS VARIÁVEIS
    @Schema(accessMode = Schema.AccessMode.READ_ONLY, description = "ID gerado automaticamente pelo banco")
    private Long id;
    private String descricao;
    private BigDecimal valor;
    private String tipo;
    private LocalDate data;

    public Transacao(){
                                    // OS DOIS CONSTRUTORES UM VAZIO E OUTRO COM OS ATRIBUTOS NECESSÁRIOS PARA O JPA
    }
    public Transacao(String descricao, BigDecimal valor, String tipo, LocalDate data){
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo;
        this.data = data;
    }
    //GETTERS E SETTERS
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

}
