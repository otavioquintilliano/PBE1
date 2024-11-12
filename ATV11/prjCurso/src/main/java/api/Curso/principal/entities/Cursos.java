package api.Curso.principal.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cursos {
	@Id
	private Long id_curso;
	private String titulo;
	private String descricao;
	private double carga_horaria;
	private String nivel_dificuldade;
	
	public Cursos() {

	}
	
	public Cursos(Long id_curso, String titulo, String descricao, double carga_horaria, String nivel_dificuldade) {
		this.id_curso = id_curso;
		this.titulo = titulo;
		this.descricao = descricao;
		this.carga_horaria = carga_horaria;
		this.nivel_dificuldade = nivel_dificuldade;
	}

	public Long getId_curso() {
		return id_curso;
	}

	public void setId_curso(Long id_curso) {
		this.id_curso = id_curso;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getCarga_horaria() {
		return carga_horaria;
	}

	public void setCarga_horaria(double carga_horaria) {
		this.carga_horaria = carga_horaria;
	}

	public String getNivel_dificuldade() {
		return nivel_dificuldade;
	}

	public void setNivel_dificuldade(String nivel_dificuldade) {
		this.nivel_dificuldade = nivel_dificuldade;
	}

	
}
