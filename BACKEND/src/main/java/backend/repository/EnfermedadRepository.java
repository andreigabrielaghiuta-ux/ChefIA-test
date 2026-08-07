package backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import backend.entity.Enfermedad;

public interface EnfermedadRepository extends JpaRepository<Enfermedad, Long> {

}
