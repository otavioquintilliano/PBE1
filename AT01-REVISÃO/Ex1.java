package programacao_backend;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	  System.out.print("Qual o valor: ");
	  int v1 = sc.nextInt();
	  
	  System.out.print("Qual o valor: ");
	  int v2 = sc.nextInt();
	  
	  
	  System.out.printf("A soma dos valores é: " + (v1 + v2));
	  
	  sc.close();
	  
	}

}
