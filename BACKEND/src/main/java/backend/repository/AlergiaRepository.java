package backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import backend.entity.Alergia;

public interface AlergiaRepository extends JpaRepository<Alergia, Long> {

}
