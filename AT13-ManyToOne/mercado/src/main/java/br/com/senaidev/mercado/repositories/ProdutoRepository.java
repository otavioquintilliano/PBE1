package br.com.senaidev.mercado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senaidev.mercado.entities.Produto;
	
public interface ProdutoRepository  extends JpaRepository<Produto, Long> {

}
