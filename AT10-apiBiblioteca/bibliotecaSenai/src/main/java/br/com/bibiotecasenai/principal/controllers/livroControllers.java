package br.com.bibiotecasenai.principal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bibiotecasenai.principal.entites.Livro;

public class livroControllers {

	
	@RestController
	@RequestMapping("/livros")
	public class LivroController {

		@Autowired
		private livroService livroService;
		
		@PostMapping
		public livro creatLivro(@RequestBody Livro livro) {
			return LivroService.saveLivro(Livro);
		}
		
		@GetMapping
		public List<livro> getAllLivro(){
			return livroService.getAllLivro();
		}
		
		@GetMapping("/{id}")
		public Livro getLivro(@PathVariable Long id) {
		return livroService.getLivroById(id);
		}
		
		@DeleteMapping("/{id}")
		public void deleteLivro(@PathVariable Long id) {
			livroService.deleteLivro(id);
		}
	}
