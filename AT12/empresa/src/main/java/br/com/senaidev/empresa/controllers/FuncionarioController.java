package br.com.senaidev.empresa.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senaidev.empresa.entites.Funcionario;


@RestController
@RequestMapping("/Funcionario")
public class FuncionarioController {

	
	@PostMapping
	private Funcionario createFuncionario(@RequestBody Funcionario funcionario) { 
		return funcionario.saveFuncionario(funcionario);
}
	
	@GetMapping
	public List<Funcionario> getAllFuncionario(){
		return funcionario.getAllFuncionario();
	}
	
	
	@GetMapping("/{id}")
	public Funcionario getFuncionario(@PathVariable Long id) {
	return funcionario.getFuncionarioById(id);
	}
	
	
	@DeleteMapping("/{id}")
	public void deleteFuncionario(@PathVariable Long id) {
		funcionario.deleteFuncionario(id);
	}
}

