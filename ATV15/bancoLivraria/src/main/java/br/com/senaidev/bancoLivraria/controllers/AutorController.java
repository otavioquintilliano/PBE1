package br.com.senaidev.bancoLivraria.controllers;

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

import br.com.senaidev.bancoLivraria.entities.Autor;
import br.com.senaidev.bancoLivraria.services.AutorService;

@RestController
@RequestMapping("/autores")
public class AutorController {

	
	@Autowired
    private AutorService autorService;

    @GetMapping
    public List<Autor> buscarAutor() {
        return AutorService.buscarAutor();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> buscarAutoresPorId(@PathVariable Long id){
    	Autor autor = autorService.buscarAutoresPorId(id);
    	
    	
    	if (autor != null) {
    		return ResponseEntity.ok(autor);
    	}else {
    		return ResponseEntity.status(404).body("Cliente com ID " + id + "não foi encontrado.");
    	}
    }
    
    @GetMapping("/nome/{nome}")
    public Autor buscarAutorPorNome(@PathVariable String nome) {
    	return autorService.buscarAutorPorNome(nome);
    }
    @PostMapping
    public Autor criarAutor(@RequestBody Autor autor) {
        return autorService.criarAutor(autor);
    }

    @DeleteMapping("/{id}")
    public void excluirAutor(@PathVariable Long id) {
        autorService.excluirAutor(id);
    }
}

