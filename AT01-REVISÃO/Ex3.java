package programacao_backend;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual é o seu número? ");
		int num = sc.nextInt();
		
		System.out.print("Qual é o seu número? ");
		int horas = sc.nextInt();
		
		System.out.print("Qual é o valor que você ganha por hora? ");
		int valor = sc.nextInt();
		
		System.out.println("funcionário" + (num) + "tem" + (horas) + "horas trabalhadas, o valor de sua hora é R$" + (valor));
		
		
		

	}

}
