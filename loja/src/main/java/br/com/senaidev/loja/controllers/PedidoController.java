package br.com.senaidev.loja.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senaidev.bancoLivraria.entities.Pedido;
import br.com.senaidev.bancoLivraria.services.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

	
	@Autowired
    private PedidoService pedidoService;

    @GetMapping
    public List<Pedido> buscarPedido() {
        return pedidoService.buscar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedido> buscarPorId(@PathVariable Long id) {
    	Pedido pedido = pedidoService.buscarPorId(id);
		
		if (pedido != null) {
			return ResponseEntity.ok(pedido);
		} else {
			return ResponseEntity.notFound().build();
		}	
    }
    
    @PostMapping
    public Pedido criarPedido(@RequestBody Pedido pedido) {
        return pedidoService.criarPedido(pedido);
    }

    @DeleteMapping("/{id}")
    public void excluirPedido(@PathVariable Long id) {
    	pedidoService.excluirPedido(id);
    }
}
