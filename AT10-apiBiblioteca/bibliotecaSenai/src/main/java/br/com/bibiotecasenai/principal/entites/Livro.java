package br.com.bibiotecasenai.principal.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


	
	@Entity
	@Table(name = "tb_livro")
	public class Livro {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "id_livro")
	private Long id_livro;
	
	@Column(name = "nome livro")
	private String nome_livro;
	
	@Column(name = "nome autor")
	private String nome_autor;
	
	@Column(name = "isbn" )
	private String isbn;
	
	
	@Column(name = "ano")
	private int ano;
	
	@Column(name = "valor")
	private double valor;
	
	@Column(name = "estoque")
	private int estoque;

	
	
	public Livro(int ano, double valor, int estoque) {
		super();
		this.ano = ano;
		this.valor = valor;
		this.estoque = estoque;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	
}
	