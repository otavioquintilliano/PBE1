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

import br.com.senaidev.mercado.entities.Produto;


@RestController
@RequestMapping("/produto")
public class ProdutoController {

	
		@Autowired
		private Service  ProdutoService;

		@PostMapping
		public  Produto createProduto(@RequestBody Produto produto) {
			return ProdutoService.saveProduto(produto);
		}
		
		@PutMapping
		public Produto editProduto(@RequestBody Produto Produto) {
			return produtoService.saveProduto(produto);
		}

		@GetMapping
		public List<Produto> getAllProduto() {
			return produtoService.getAllProduto();
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


