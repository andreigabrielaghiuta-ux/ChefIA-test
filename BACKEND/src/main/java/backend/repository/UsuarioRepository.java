package backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import backend.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {


    //Para buscar un usuario por su email
    Optional<Usuario> findByEmail(String email);

    boolean existsByEmail(String email);
}
