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

import api.Curso.principal.entities.Disciplinas;
import api.Curso.principal.service.DisciplinasService;

@RestController
	@RequestMapping ("/Disciplinas")
	public class DisciplinasController {

		@Autowired
		private DisciplinasService disciplinasService;

		@PostMapping
		public Disciplinas createDisciplinas(@RequestBody Disciplinas disciplinas) {
			return disciplinasService.saveDisciplinas(disciplinas);
		}

		@GetMapping
		public List<Disciplinas> getAllDisciplinas(){
		return disciplinasService.getAllDisciplinas();	   
		}
		
		@GetMapping("/{id}")
		public Disciplinas getDisciplinas(@PathVariable Long id) {
			return disciplinasService.getDisciplinasById(id);
		}

		@DeleteMapping("/{id}")
		public void deleteDisciplinas (@PathVariable Long id) {
			disciplinasService.deleteDisciplinas(id);
		}
	}


