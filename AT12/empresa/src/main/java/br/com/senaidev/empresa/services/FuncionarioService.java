package br.com.senaidev.empresa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senaidev.empresa.entites.Funcionario;
import br.com.senaidev.empresa.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {

	@Autowired
	private FuncionarioRepository funcionarioRepository;

	public Funcionario saveFuncionario(Funcionario funcionario) {
		return funcionarioRepository.save(funcionario);
	}

	public List<Funcionario> getAllFuncionario() {
		return funcionarioRepository.findAll();
	}

	public Funcionario getFuncionarioById(Long id) {
		return funcionarioRepository.findById(id).orElse(null);
	}

	public void deleteFuncionario(Long id) {
		funcionarioRepository.deleteById(id);
	}
}


