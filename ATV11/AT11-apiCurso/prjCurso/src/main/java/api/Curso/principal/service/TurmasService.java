package api.Curso.principal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.Curso.principal.entities.Turmas;
import api.Curso.principal.repositories.TurmasRepository;

@Service
public class TurmasService {
	@Autowired
	private TurmasRepository TurmasRepository;
	
	public Turmas saveTurmas(Turmas turmas) {
		return TurmasRepository.save(turmas);
	}

	public List<Turmas> getAllTurmas(){
		return TurmasRepository.findAll();
	}	
	
	public Turmas getTurmasById(Long Id) {
		return TurmasRepository.findById(Id).orElse(null);
	}

	public void deleteTurmas(Long id) {
		TurmasRepository.deleteById(id);
	}


	}