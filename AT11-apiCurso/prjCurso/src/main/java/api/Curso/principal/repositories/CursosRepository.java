package api.Curso.principal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import api.Curso.principal.entities.Cursos;

public interface CursosRepository extends JpaRepository<Cursos, Long> {

	}

