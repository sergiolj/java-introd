package intro_Java;

import java.util.Scanner;

public class Computalino_EX_1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String nome;
		
		System.out.println("Oi, sou Computalino, qual seu nome?");
		nome=input.nextLine();
		System.out.println("Bonito nome, " + nome + "!");
		
	}

}
