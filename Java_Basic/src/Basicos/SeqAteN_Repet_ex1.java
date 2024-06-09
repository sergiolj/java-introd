package Basicos;
import java.util.Scanner;

public class SeqAteN_Repet_ex1 {
public static void main(String[]args) {
	int n, wt=0;
	Scanner input=new Scanner(System.in);
	System.out.println("Digite um número inteiro: ");
	n=input.nextInt();
	while (wt!=n) {
		wt=wt+1;
		System.out.println(wt);
	}
}
}
