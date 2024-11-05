package api.Curso.principal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.Curso.principal.entities.Cursos;
import api.Curso.principal.repositories.CursosRepository;

@Service
public class CursosService {
	@Autowired
	private CursosRepository CursosRepository;
	
	public Cursos saveCursos(Cursos cursos) {
		return CursosRepository.save(cursos);
	}

	public List<Cursos> getAllCursos(){
		return CursosRepository.findAll();
	}	
	
	public Cursos getCursosById(Long Id) {
		return CursosRepository.findById(Id).orElse(null);
	}

	public void deleteCursos(Long id) {
		CursosRepository.deleteById(id);
	}


	}

