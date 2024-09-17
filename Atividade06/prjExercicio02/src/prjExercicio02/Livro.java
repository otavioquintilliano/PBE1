package prjExercicio02;

public class Livro {

	
	//Atributos
	
	String atributoTitulo;
	String atributoAutor;
	int atributonumPaginas;
	double atributoPreco;
	
	//Construtores
	
		public Livro() {
		}
		
		public Livro(String parametroTitulo, String parametroAutor, int parametronumPaginas, double parametroPreco) {
			
			this.atributoTitulo = parametroTitulo;
			this.atributoAutor = parametroAutor;
			this.atributonumPaginas = parametronumPaginas;
			this.atributoPreco = parametroPreco;
		}
		
		//Metodos
		
		public void aplicarDesconto(double atributoPreco) {
			if (this.atributoPreco == atributoPreco) {
				System.out.println(this.atributoPreco + ", desconto");
			}
			
			else {
				this.atributoPreco -=15;
			}
		}
		
		public void exibirinfo() {
			System.out.println(this.atributoTitulo +  this.atributoAutor + this.atributonumPaginas + this.atributoPreco);
		}

		public String getAtributoTitulo() {
			return atributoTitulo;
		}

		public void setAtributoTitulo(String atributoTitulo) {
			this.atributoTitulo = atributoTitulo;
		}

		public String getAtributoAutor() {
			return atributoAutor;
		}

		public void setAtributoAutor(String atributoAutor) {
			this.atributoAutor = atributoAutor;
		}

		public int getAtributonumPaginas() {
			return atributonumPaginas;
		}

		public void setAtributonumPaginas(int atributonumPaginas) {
			this.atributonumPaginas = atributonumPaginas;
		}

		public double getAtributoPreco() {
			return atributoPreco;
		}

		public void setAtributoPreco(double atributoPreco) {
			this.atributoPreco = atributoPreco;
		}
}
