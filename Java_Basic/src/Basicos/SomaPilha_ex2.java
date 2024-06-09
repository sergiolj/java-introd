package Basicos;
import java.util.Scanner;

public class SomaPilha_ex2 {
public static void main(String[]args) {
	int n1,n2,n3,soma;
	Scanner input=new Scanner(System.in);
	System.out.println("Digite o valor base: ");
	n1=input.nextInt();
	System.out.println("Digite um valor: ");
	n2=input.nextInt();
	System.out.println("Digite um valor: ");
	n3=input.nextInt();
	soma=n2+n3;
	while (soma!=n1) {
		System.out.println("Digite um valor: ");
		n2=input.nextInt();
		System.out.println("Digite um valor: ");
		n3=input.nextInt();
		soma=n2+n3;
	}
	System.out.println("O valor de "+n2+" + "+n3+" é igual a "+n1);
}
}
