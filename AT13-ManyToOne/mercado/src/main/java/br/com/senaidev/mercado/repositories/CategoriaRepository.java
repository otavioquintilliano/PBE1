package br.com.senaidev.mercado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senaidev.mercado.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
