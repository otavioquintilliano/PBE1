package br.com.bibiotecasenai.principal.repositores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.bibiotecasenai.principal.entites.Editora;

public class editoraRepositories {
	@Autowired
	private EditoraRepository editoraRepository;

	public Editora saveEditora(Editora editora) {
		return editoraRepository.save(editora);
	}

	public List<Editora> getAllLivro() {
		return editioraRepository.findAll();
	}

	public editora getEditoraById(Long id) {
		return editoraRepository.findById(id).orElse(null);
	}

	public void deleteEditora(Long id) {
		editoraRepository.deleteById(id);
	}
}

