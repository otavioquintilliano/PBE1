package com.senaidev.cadastroproduto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.cadastroproduto.entites.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>  {

}
