package prjPokemon;

public class Aplicacao {

	public static void main(String[] args) {
		Pokemon chamander = new Pokemon();
		chamander.atributoNome = "charmander";
		chamander.atributoTipo = "Fogo";
		chamander.atributoNivel = 15;
		chamander.atributoHp = 100;
		
		Pokemon squirtle = new Pokemon();
		squirtle.atributoNome = "Squirtle";
		squirtle.atributoTipo = "Água";
		squirtle.atributoNivel = 14;
		squirtle.atributoHp = 79;
		
		Pokemon pikachu = new Pokemon();
		pikachu.atributoNome = "Pikachu";
		pikachu.atributoTipo = "Elétrico";
		pikachu.atributoNivel = 16;
		pikachu.atributoHp = 97;
	
		Pokemon Pidgey = new Pokemon();
		Pidgey.atributoNome = "Pidgey";
		Pidgey.atributoTipo = "Voador";
		Pidgey.atributoNivel = 10;
		Pidgey.atributoHp = 99;
		
		Pokemon rattata = new Pokemon();
		rattata.atributoNome = "rattata";
		rattata.atributoTipo = "Normal";
		rattata.atributoNivel = 17;
		rattata.atributoHp = 96;

		charmander.exibirinfo();
		charmander.metodoAtacar();
		charmander.metodoEvoluir();
		
		squirtle.exibirinfo();
     		squirtle.metodoAtacar();
		squirtle.metodoEvoluir();
		
		charmander.exibirinfo();
		charmander.metodoAtacar();
		charmander.metodoEvoluir();
		
		pikachu.exibirinfo();
		pikachu.metodoAtacar();
		pikachu.metodoEvoluir();
		
		rattata.exibirinfo();
		rattata.metodoAtacar();
		rattata.metodoEvoluir();
	}

}
