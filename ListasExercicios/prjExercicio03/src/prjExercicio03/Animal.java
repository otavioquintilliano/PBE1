package prjExercicio03;

public class Animal {

	//Atributos
	
	String atributoNome;
	int atributoIdade;
	String atributoRaca;
	
	//Construtores
	
	public Animal() {
	}
	
	public Animal(String parametroNome, String parametroRaca, int parametroIdade) {
		this.atributoIdade = parametroIdade;
		this.atributoNome = parametroNome;
		this.atributoRaca = parametroRaca;
	}
	
	//Metodos
	
	public void fazerSom() {
		System.out.println(this.atributoNome + "O animal fez um som.");
	}
	public void metodoCacar() {
		System.out.println(this.atributoNome + "O animal esta caçando.");
	}
	public void metodoNadar() {
		System.out.println(this.atributoNome + "O animal esta nadando");
	}
}
