package repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.Cartao;

public interface CartaoRepository  extends JpaRepository<Cartao, UUID> {

}
