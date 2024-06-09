package Basicos;
import java.util.Scanner;
public class NumFaixa_Repet_ex3 {
public static void main(String[]args) {
	int n;
	Scanner input=new Scanner(System.in);
	do {
		System.out.println("Digite um valor do conjunto dos números naturais");
		n=input.nextInt();
	}while (n>=100 || n<0);
	System.out.println("O valor "+n+" pertence à faixa de 0-100");
	}
}
