package br.com.senaidev.empresa.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senaidev.empresa.entites.Departamento;

@RestController
@RequestMapping("/Departamento")
public class DepartamentoController {

	@PostMapping
	private Departamento createDepartamento(@RequestBody Departamento departamento) { 
		return departamento.saveDepartamento(departamento);
}
	
	@GetMapping
	public List<Departamento> getAllDepartamento(){
		return departamento.getAllDepartamento();
	}
	
	
	@GetMapping("/{id}")
	public Departamento getDepartamento(@PathVariable Long id) {
	return departamento.getDepartamentoById(id);
	}
	
	
	@DeleteMapping("/{id}")
	public void deleteDepartamento(@PathVariable Long id) {
		departamento.deleteDepartamento(id);
	}
}