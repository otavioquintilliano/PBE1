package br.com.senaidev.mercado.controllers;

import java.security.Provider.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senaidev.mercado.entities.Categoria;
import br.com.senaidev.mercado.entities.Produto;
import br.com.senaidev.mercado.servicies.ProdutoService;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

	
	@Autowired
	private Service  CategoriaService;

	@PostMapping
	public  Categoria createCategoria(@RequestBody Categoria categoria) {
		return CategoriaService.saveCategoria(categoria);
	}
	
	@PutMapping
	public Categoria editCategoria(@RequestBody Categoria categoria) {
		return CategoriaService.saveCategoria(Categoria);
	}

	@GetMapping
	public List<Categoria> getAlCategoria() {
		return CategoriaService.getAllCategoria();
	}

	@GetMapping("/{id}")
	public Produto getProduto(@PathVariable Long id) {
		return ProdutoService.getProdutoById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteProduto(@PathVariable Long id) {
		ProdutoService.deleteProduto(id);
	}

}

}
