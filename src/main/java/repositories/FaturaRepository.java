package repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.Fatura;

public interface FaturaRepository  extends JpaRepository<Fatura, UUID> {

}
