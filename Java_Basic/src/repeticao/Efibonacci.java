package repeticao;

import java.util.Scanner;

public class Efibonacci {

	public static void main(String[] args) {
		int x,n0=1,n1=1, f;
		Scanner input=new Scanner(System.in);
		System.out.println("Informe o inteiro para teste:");
		x=input.nextInt();	
		for (int i=1;i<x;i++) {
			if (n0+n1==x) {
				i=x;
				System.out.println("O número "+x+" faz parte da sequencia de fibonacci e seus termos são ("+n0+") e ("+n1+")");
			}else {
				f=n0+n1;
				n0=n1;
				n1=f;	
			}			
		}
		if (n0+n1!=x) {
			System.out.println("O número "+x+" NÃO faz parte da sequencia de fibonacci");			
		}

	}
}	