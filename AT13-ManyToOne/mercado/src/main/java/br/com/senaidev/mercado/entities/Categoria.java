package br.com.senaidev.mercado.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id_produto")
	private long id_produto;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "preco")
	private double preco;
	
	
	public Categoria(long id_produto, String nome, double preco) {
		super();
		this.id_produto = id_produto;
		this.nome = nome;
		this.preco = preco;
	}


	public long getId_produto() {
		return id_produto;
	}


	public void setId_produto(long id_produto) {
		this.id_produto = id_produto;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
	
}
