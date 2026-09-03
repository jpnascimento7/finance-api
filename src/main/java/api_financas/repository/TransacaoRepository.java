package api_financas.repository;

import api_financas.model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// INTERFACE DE TRANSACAO QUE VAI USAR OS METODOS DE JPAREPOSITORY

@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, Long>{

}
