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

import api.Curso.principal.entities.Cursos;
import api.Curso.principal.service.CursosService;

@RestController
	@RequestMapping ("/Cursos")
	public class CursosController {

		@Autowired
		private CursosService cursosService;

		@PostMapping
		public Cursos createCursos(@RequestBody Cursos cursos) {
			return cursosService.saveCursos(cursos);
		}

		@GetMapping
		public List<Cursos> getAllCursos(){
		return cursosService.getAllCursos();	   
		}
		
		@GetMapping("/{id}")
		public Cursos getCursos(@PathVariable Long id) {
			return cursosService.getCursosById(id);
		}

		@DeleteMapping("/{id}")
		public void deleteCursos (@PathVariable Long id) {
			cursosService.deleteCursos(id);
		}
	}
