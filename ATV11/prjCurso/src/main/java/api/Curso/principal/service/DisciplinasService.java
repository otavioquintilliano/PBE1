package api.Curso.principal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.Curso.principal.entities.Disciplinas;
import api.Curso.principal.repositories.DisciplinasRepository;

@Service
public class DisciplinasService {
	@Autowired
	private DisciplinasRepository DisciplinasRepository;
	
	public Disciplinas saveDisciplinas(Disciplinas disciplinas) {
		return DisciplinasRepository.save(disciplinas);
	}

	public List<Disciplinas> getAllDisciplinas(){
		return DisciplinasRepository.findAll();
	}	
	
	public Disciplinas getDisciplinasById(Long Id) {
		return DisciplinasRepository.findById(Id).orElse(null);
	}

	public void deleteDisciplinas(Long id) {
		DisciplinasRepository.deleteById(id);
	}


	}


