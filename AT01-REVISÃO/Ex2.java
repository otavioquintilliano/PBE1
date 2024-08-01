package programacao_backend;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	    double pi = 3.14159;
		System.out.println("Qual o raio do circulo: ");
		double raio = sc.nextDouble();
		
		System.out.printf("A área do círculo é: %.4f " , pi*raio*raio);
		
		
		sc.close();

	}

}
