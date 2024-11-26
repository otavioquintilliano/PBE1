package br.com.senaidev.bancoLivraria.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_endereco")
public class Editora {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "nome", nullable = false, length = 100)
	private String name;
	
	@Column(name = "cnpj", nullable = false, length = 14, unique = true)
	private String cnpj;
	
	@Column(name = "nome_contato", nullable = false, length = 100)
	private String nome_contato;
	
	@Column(name = "telefone_contato", nullable = false, length = 13)
	private String telefone_contato;
	
	@Column(name = "email", nullable = false, length = 100)
	private String email;

	public Editora(String name, String cnpj, String nome_contato, String telefone_contato, String email) {
		super();
		this.name = name;
		this.cnpj = cnpj;
		this.nome_contato = nome_contato;
		this.telefone_contato = telefone_contato;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome_contato() {
		return nome_contato;
	}

	public void setNome_contato(String nome_contato) {
		this.nome_contato = nome_contato;
	}

	public String getTelefone_contato() {
		return telefone_contato;
	}

	public void setTelefone_contato(String telefone_contato) {
		this.telefone_contato = telefone_contato;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
