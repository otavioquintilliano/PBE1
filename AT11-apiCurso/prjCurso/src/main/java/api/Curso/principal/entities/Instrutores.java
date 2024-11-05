package api.Curso.principal.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Instrutores {
	@Id
	private String nome;
	private String email;
	private String telefone;
	private String area_especializacao;
	private String experiencia;
	
	public Instrutores() {
		
	}
	
	public Instrutores(String nome, String email, String telefone, String area_especializacao, String experiencia) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.area_especializacao = area_especializacao;
		this.experiencia = experiencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getArea_especializacao() {
		return area_especializacao;
	}

	public void setArea_especializacao(String area_especializacao) {
		this.area_especializacao = area_especializacao;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	
	

}
