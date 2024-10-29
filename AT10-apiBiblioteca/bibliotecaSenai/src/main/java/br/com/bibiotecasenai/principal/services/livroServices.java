package br.com.bibiotecasenai.principal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bibiotecasenai.principal.entites.Livro;

	@Service
	public class livroServices {

		@Autowired
		private LivroRepository livroRepository;

		public Livro saveLivro(Livro livro) {
			return livroRepository.save(livro);
		}

		public List<Livro> getAllLivro() {
			return livroRepository.findAll();
		}

		public Livro getLivroById(Long id) {
			return livroRepository.findById(id).orElse(null);
		}

		public void deleteLivro(Long id) {
			livroRepository.deleteById(id);
		}
	}

