package br.com.senaidev.empresa.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_departamento")
public class Departamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id")
	private long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "local")
	private String local;
	
	
	public Departamento(long id, String nome, String local) {
		super();
		this.id = id;
		this.nome = nome;
		this.local = local;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getLocal() {
		return local;
	}


	public void setLocal(String local) {
		this.local = local;
	}


	public Departamento saveDepartamento(Departamento departamento) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
