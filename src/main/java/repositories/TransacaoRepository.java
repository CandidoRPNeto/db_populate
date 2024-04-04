package repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.Transacao;

public interface TransacaoRepository  extends JpaRepository<Transacao, UUID> {

}
