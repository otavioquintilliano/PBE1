package prjExercicio01;

public class Carro {

	
	//Atributos
	
	String  atributoModelo;
	String atributoMarca;
	String atributoPlaca;
	int atributoAno;
	
	//Construtores
	
	public Carro() {
	}
	
	public Carro(String parametroModelo, String parametroMarca, String parametroPlaca, int parametroAno) {
		
		this.atributoModelo = parametroModelo;
		this.atributoMarca = parametroMarca;
		this.atributoPlaca = parametroPlaca;
		this.atributoAno = parametroAno;
	}
	
	//Metodos
	
	public void exibirinfo() {
		System.out.println(this.atributoMarca +  this.atributoModelo + this.atributoPlaca + this.atributoAno);
	}
}
