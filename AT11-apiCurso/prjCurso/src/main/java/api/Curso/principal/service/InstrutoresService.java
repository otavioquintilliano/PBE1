package api.Curso.principal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.Curso.principal.entities.Instrutores;
import api.Curso.principal.repositories.InstrutoresRepository;

@Service
public class InstrutoresService {
	@Autowired
	private InstrutoresRepository InstrutoresRepository;
	
	public Instrutores saveInstrutores(Instrutores instrutores) {
		return InstrutoresRepository.save(instrutores);
	}

	public List<Instrutores> getAllInstrutores(){
		return InstrutoresRepository.findAll();
	}	
	
	public Instrutores getInstrutoresById(Long Id) {
		return InstrutoresRepository.findById(Id).orElse(null);
	}

	public void deleteInstrutores(Long id) {
		InstrutoresRepository.deleteById(id);
	}


	}