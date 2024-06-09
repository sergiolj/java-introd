package Basicos;
import java.util.Scanner;
public class ForRepet_ex5 {
	public static void main(String[]args) {
		int n,c=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Digite um número natural diferente de zero: ");
		n=input.nextInt();
		for(c=0;c<=n;c++) {
			System.out.println(c);
		}
	}
}
