package br.com.bibiotecasenai.principal.repositores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.bibiotecasenai.principal.entites.Livro;
import br.com.bibiotecasenai.principal.services.LivroRepository;
import br.com.bibiotecasenai.principal.services.livro;

public class livroRepositores {

	@Autowired
	private LivroRepository livroRepository;

	public Livro saveLivro(Livro livro) {
		return livroRepository.save(livro);
	}

	public List<Livro> getAllLivro() {
		return livroRepository.findAll();
	}

	public livro getLivroById(Long id) {
		return livroRepository.findById(id).orElse(null);
	}

	public void deleteLivro(Long id) {
		livroRepository.deleteById(id);
	}
}
