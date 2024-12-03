package br.com.senaidev.loja.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.senaidev.loja.entities.Pedido;
import br.com.senaidev.loja.repositories.PedidoRepository;

public class PedidoService {

	
    @Autowired
    private PedidoRepository pedidoRepository;

    // Listar todos os endereços
    public List<Pedido> buscar() {
        return pedidoRepository.findAll();
    }

    // Buscar endereço por ID
    public Pedido buscarEnderecosPorId(Long id) {
        return pedidoRepository.findById(id).orElse(null);
    }

    // Salvar endereço
    public Pedido criar(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    // Deletar endereço
    public void excluirPedido(Long id) {
    	pedidoRepository.deleteById(id);
    }
}


