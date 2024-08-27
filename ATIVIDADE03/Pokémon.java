package prjPokémon;

public class Pokémon {
	//Atributos
	String atributoNome;
	String atributoTipo;
	int atributoNivel;
	int atributoHp;
	
	//Construtores
	public void Pokémon() {
	}
	public void Pokémon(String parametroNome, String parametroTipo, int parametroNivel, int parametroHp) {
		this.atributoNome = parametroNome;
		this.atributoTipo = parametroTipo;
		this.atributoNivel = parametroNivel;
		this.atributoHp = parametroHp;
	}
	//Metodos
	
	public void metodoEvoluir {
		System.out.println(this.atributoNome);
	}
	public void metodoAtacar {
		System.out.println("Nome: " + this.atributoNome + "esta actacando");
	}
		