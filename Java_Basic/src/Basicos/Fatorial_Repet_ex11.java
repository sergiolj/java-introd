package Basicos;
import java.util.Scanner;

public class Fatorial_Repet_ex11 {
	public static void main(String[]args) {
		int n,c,ft=1;
		Scanner input=new Scanner(System.in);
		System.out.println("Informe o número a ser fatorado: ");
		n=input.nextInt();
		for (c=n;c!=1;c--) {
			ft*=c;
		}
		System.out.println(ft);
	}
}
