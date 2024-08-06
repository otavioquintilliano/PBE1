package prjCaneta;

public class Aplicacao02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Livro Livro01 = new Livro("Alice no pais","Julio Trigueiro");
		Livro Livro02 = new Livro("Quarto de desejo","Pedro Francisco");
		
		System.out.println("livros disponiveis");
		System.out.print("01. ");
		livro01.status();
		System.out.print("02. ");
		livro02.status();
		
		System.out.println("qual livro deseja alugar");
		int escolha = sc.nextInt();	

	}

}
