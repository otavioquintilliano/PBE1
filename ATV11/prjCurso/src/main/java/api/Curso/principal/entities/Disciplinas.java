package api.Curso.principal.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
	public class Disciplinas {
		@Id
		private Long id_disciplina;
		private String nome;
		private String descricao;
		private double carga_horaria;
		
		public Disciplinas() {
			
		}
		
		public Disciplinas(Long id_disciplina, String nome, String descricao, double carga_horaria) {
			this.id_disciplina = id_disciplina;
			this.nome = nome;
			this.descricao = descricao;
			this.carga_horaria = carga_horaria;
		}

		public Long getId_disciplina() {
			return id_disciplina;
		}

		public void setId_disciplina(Long id_disciplina) {
			this.id_disciplina = id_disciplina;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
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
}
