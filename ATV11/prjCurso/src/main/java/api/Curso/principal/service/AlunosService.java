package api.Curso.principal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.Curso.principal.entities.Alunos;
import api.Curso.principal.repositories.AlunosRepository;

@Service
public class AlunosService {
	@Autowired
	private AlunosRepository AlunosRepository;
	
	public Alunos saveAlunos(Alunos alunos) {
		return AlunosRepository.save(alunos);
	}

	public List<Alunos> getAllAlunos(){
		return AlunosRepository.findAll();
	}	
	
	public Alunos getAlunosById(Long Id) {
		return AlunosRepository.findById(Id).orElse(null);
	}

	public void deleteAlunos(Long id) {
		AlunosRepository.deleteById(id);
	}


	}
