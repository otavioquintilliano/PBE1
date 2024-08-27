package prjPokemon;

public class Pokemon {
	
	//Atributos
	
			String atributoNome;
			String atributoTipo;
			int atributoNivel;
			int atributoHp;
			
			//Construtores
			
			public Pokemon() {
			}
			
			public Pokemon(String parametroNome, String parametroTipo, String parametroNivel, double parametroHP){
				
				this.atributoNome = parametroNome;
				this.atributoTipo = parametroTipo;
				this.atributoNivel = parametroNivel;
				this.atributoHP = parametroHP;
			}
			
			
			//Metodos
			
			
			public void metodoAtacar() {
					System.out.println(this.atributoNome + " está atacando: " + this.atributoNome);
				}
			
			public void metodoEvoluir() {
				System.out.println(this.atributoNome + " está evoluindo!!");
			}
			
	        public void exibirinfo() {
		    	
			    System.out.println("Nome: " + this.atributoNome);
		    	System.out.println("Tipo: " + this.atributoTipo);
		    	System.out.println("Nivel: " + this.atributoNivel);
		    	System.out.println("Vida: " + this.atributoHP);
				
	        }
	}
