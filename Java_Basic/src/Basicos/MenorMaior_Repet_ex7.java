package Basicos;
import java.util.Scanner;

public class MenorMaior_Repet_ex7 {
	public static void main(String[]args) {
		int n1,n2,c=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Digite dois números naturais diferentes: ");
		n1=input.nextInt();
		n2=input.nextInt();
		System.out.println("A sequência do menor para o maior é: ");
		if (n1>n2) {
			for(c=n2;c<=n1;c++) {
				System.out.println(c);
			}
		}else {
				for(c=n1;c<=n2;c++) {
					System.out.println(c);
				}
			}
			}
		}