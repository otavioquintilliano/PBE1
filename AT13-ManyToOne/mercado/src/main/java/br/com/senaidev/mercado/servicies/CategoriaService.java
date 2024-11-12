package br.com.senaidev.mercado.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senaidev.mercado.entities.Categoria;
import br.com.senaidev.mercado.repositories.CategoriaRepository;
	
	@Service
	public class CategoriaService {
		
		@Autowired
		private CategoriaRepository categoriaRepository;
		
		public Categoria saveCategoria( Categoria categoria) {
			return CategoriaRepository.save(Categoria);
		}
		
		public List<Categoria> getAllCategoria(){
			return CategoriaRepository.findAll();
		}
		
		public Categoria getCategoriaById (Long id) {
			return CategoriaRepository.findById(id).orElse(null);
		}
		
		public void deleteCategoria(Long id) {
			CategoriaRepository.deleteById(id);
}
	}
}