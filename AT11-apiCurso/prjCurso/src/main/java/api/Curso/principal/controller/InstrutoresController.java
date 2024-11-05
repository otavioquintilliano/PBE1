package api.Curso.principal.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.Curso.principal.entities.Instrutores;
import api.Curso.principal.service.InstrutoresService;

@RestController
@RequestMapping ("/Instrutores")
public class InstrutoresController {

	@Autowired
	private InstrutoresService instrutoresService;

	@PostMapping
	public Instrutores createInstrutores(@RequestBody Instrutores instrutores) {
		return instrutoresService.saveInstrutores(instrutores);
	}

	@GetMapping
	public List<Instrutores> getAllInstrutores(){
	return instrutoresService.getAllInstrutores();	   
	}
	
	@GetMapping("/{id}")
	public Instrutores getInstrutores(@PathVariable Long id) {
		return instrutoresService.getInstrutoresById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteInstrutores (@PathVariable Long id) {
		instrutoresService.deleteInstrutores(id);
	}
}

