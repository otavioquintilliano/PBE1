package api.Curso.principal.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alunos {
	@Id
	private String nome;
	private String email;
	private String telefone;
	private int matricula;
	
	public Alunos() {
		
	}
	
	public Alunos(String nome, String email, String telefone, int matricula) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.matricula = matricula;
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

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


}
