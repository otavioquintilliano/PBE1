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

import api.Curso.principal.entities.Turmas;
import api.Curso.principal.service.TurmasService;

@RestController
@RequestMapping ("/Turmas")
public class TurmasController {

	@Autowired
	private TurmasService turmasService;

	@PostMapping
	public Turmas createTurmas(@RequestBody Turmas turmas) {
		return turmasService.saveTurmas(turmas);
	}

	@GetMapping
	public List<Turmas> getAllTurmas(){
	return turmasService.getAllTurmas();	   
	}
	
	@GetMapping("/{id}")
	public Turmas getTurmas(@PathVariable Long id) {
		return turmasService.getTurmasById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteTurmas (@PathVariable Long id) {
		turmasService.deleteTurmas(id);
	}
}

