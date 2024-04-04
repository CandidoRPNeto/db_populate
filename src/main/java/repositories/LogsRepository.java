package repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.Logs;

public interface LogsRepository  extends JpaRepository<Logs, UUID> {

}
