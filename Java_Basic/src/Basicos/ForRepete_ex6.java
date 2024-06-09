package Basicos;
import java.util.Scanner;

public class ForRepete_ex6 {

	public static void main(String[]args) {
		int n,c=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Digite um número: ");
		n=input.nextInt();
		System.out.println("Os divisores de "+n+" são:");
		for(c=1;c<=n;c++) {
			if(n%c==0) {
				System.out.println(c);
			}
		}
	}
}
