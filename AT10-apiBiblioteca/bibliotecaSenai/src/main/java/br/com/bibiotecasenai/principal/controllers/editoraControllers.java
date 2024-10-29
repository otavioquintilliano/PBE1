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

import br.com.bibiotecasenai.principal.entites.Editora;

public class editoraControllers {

	@RestController
	@RequestMapping("/livros")
	public class EditoraController {

		@Autowired
		private editoraService editoraService;
		
		@PostMapping
		public editora creatLivro(@RequestBody Editora editora) {
			return EditoraService.saveEditora(Editora);
		}
		
		@GetMapping
		public List<editora> getAllLivro(){
			return editoraService.getAllLivro();
		}
		
		@GetMapping("/{id}")
		public Editora getEditora(@PathVariable Long id) {
		return editoraService.getEditoraById(id);
		}
		
		@DeleteMapping("/{id}")
		public void deleteEditora(@PathVariable Long id) {
			editoraService.deleteEditora(id);
		}
	}

}
