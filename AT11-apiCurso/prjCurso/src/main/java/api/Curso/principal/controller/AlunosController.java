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

import api.Curso.principal.entities.Alunos;
import api.Curso.principal.service.AlunosService;

@RestController
@RequestMapping ("/Alunos")
public class AlunosController {

	@Autowired
	private AlunosService alunosService;

	@PostMapping
	public Alunos createAlunos(@RequestBody Alunos alunos) {
		return alunosService.saveAlunos(alunos);
	}

	@GetMapping
	public List<Alunos> getAllAlunos(){
	return alunosService.getAllAlunos();	   
	}
	
	@GetMapping("/{id}")
	public Alunos getAlunos(@PathVariable Long id) {
		return alunosService.getAlunosById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteAlunos (@PathVariable Long id) {
		alunosService.deleteAlunos(id);
	}
}
