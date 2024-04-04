package repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.Solicitacao;

public interface SolicitacaoRepository  extends JpaRepository<Solicitacao, UUID> {

}
