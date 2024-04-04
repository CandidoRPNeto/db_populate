package repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import domain.Usuario;

public interface UsuarioRepository  extends JpaRepository<Usuario, UUID> {

}
