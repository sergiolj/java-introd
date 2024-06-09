package Basicos;

import java.util.Scanner;

public class Primo_Repet_ex12 {
	public static void main(String[]args) {
		int n,c=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Insira um inteiro maior do que 1: ");
		n=input.nextInt();
		if (n==2){
			System.out.println(n+" é um número primo");	
		}else{
			for(c=(n-1);c>1;c--) {				
				if (n%c==0) {
					System.out.println(n+ " NÃO é um número primo");
					c=1;
				}else if (c==2){
					System.out.println(n+" É número primo");	
				}
			}
		}
	}
}