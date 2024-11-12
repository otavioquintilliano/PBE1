package br.com.senaidev.mercado.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senaidev.mercado.entities.Produto;
import br.com.senaidev.mercado.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	
	public Produto saveProduto( Produto produto) {
		return ProdutoRepository.save(Produto);
	}
	
	public List<Produto> getAllProduto(){
		return ProdutoRepository.findAll();
	}
	
	public Produto getProdutoById (Long id) {
		return ProdutoRepository.findById(id).orElse(null);
	}
	
	public void deleteProduto(Long id) {
		ProdutoRepository.deleteById(id);
}
}


