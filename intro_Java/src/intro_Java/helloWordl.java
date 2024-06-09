package intro_Java;
import java.util.Scanner;

public class helloWordl{

	public static void main(String[] args) {
		int a, b, c;
		Scanner input=new Scanner(System.in);
// ctrl+shift+o importa automaticamente a classe
		System.out.println("Digite um valor");
		a=input.nextInt();
		System.out.println("Digite um valor");
		b=input.nextInt();
		c=a+b;
		
	//	String teste="Ola Mundo";
		/*
		 * Comentários complexos podem aparecer em várias linhas
		 * para que fiquem mais compreensíveis
		 */
		System.out.println(a + "" + b + "" +c);
		System.out.println(a + "+" + b + "=" +c);

	}

}
