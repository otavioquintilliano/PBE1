package prjCaneta;

public class Livro {

	public static void main(String[] args) {
		
		String nomeLivro;
		String nomeAutor;
		boolean alugado;
		
		public Livro(String nome, String autor) {
			this.nomeLivro = nomelivro;
			this.nomeAutor = nomeAutor;
			this.alugado = false;
		}			
		void status() {
			System.out.println( this.livro + ":" + (this.alugado ? "Alugado":"Disponivel"));
		}
		
		void alugar() {
			this.alugado = true;
		}
		void devolver() {
			this.alugado = false;
		}
	}

}
