package repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.Notificacao;

public interface NotificacaoRepository  extends JpaRepository<Notificacao, UUID> {

}
