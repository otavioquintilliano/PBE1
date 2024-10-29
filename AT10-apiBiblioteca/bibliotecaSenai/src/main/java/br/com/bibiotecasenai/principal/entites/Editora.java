package br.com.bibiotecasenai.principal.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
	
	@Entity
	@Table(name = "tb_editora")
	public class Editora{

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		
		Long id_deitora;
		
		@Column(name = "nome editora")
		private String nome_editora;
		
		@Column(name = "cnpj")
		private String cnpj;
		
		@Column(name = "conatato")
		private String contato;
		
		@Column(name = "email")
		private String email;
		
		

		public Editora(long id, Long id_deitora, String nome_editora, String cnpj, String contato, String email) {
			super();
			this.id = id;
			this.id_deitora = id_deitora;
			this.nome_editora = nome_editora;
			this.cnpj = cnpj;
			this.contato = contato;
			this.email = email;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public Long getId_deitora() {
			return id_deitora;
		}

		public void setId_deitora(Long id_deitora) {
			this.id_deitora = id_deitora;
		}

		public String getNome_editora() {
			return nome_editora;
		}

		public void setNome_editora(String nome_editora) {
			this.nome_editora = nome_editora;
		}

		public String getCnpj() {
			return cnpj;
		}

		public void setCnpj(String cnpj) {
			this.cnpj = cnpj;
		}

		public String getContato() {
			return contato;
		}

		public void setContato(String contato) {
			this.contato = contato;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		
		
	}
		