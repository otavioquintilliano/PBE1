package br.com.senaidev.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.senaidev.loja.entities.Pedido;



@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long>{

}
