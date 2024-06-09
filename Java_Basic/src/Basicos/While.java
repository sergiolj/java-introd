package Basicos;
import java.util.Scanner;

public class While {
public static void main(String[]args) {
	int n, soma=0;
	Scanner input=new Scanner(System.in);
	System.out.println("Digite um número ou (-1) para sair");
	n=input.nextInt();
	while (n!=-1) {
		soma=soma+n;
		System.out.println("Digite um número ou (-1) para sair");
		n=input.nextInt();
	}
	System.out.println("Soma = "+soma);
	}
}
