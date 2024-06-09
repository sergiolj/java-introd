package Basicos;
import java.util.Scanner;
public class DezNumeros_Repet_ex4 {

	public static void main(String[]args) {
		int n,cp=0,ci=0,sp=0,si=0,mdi=0;
		Scanner input=new Scanner(System.in);
		while(cp!=10) {
			System.out.println("Digite um número natural:");
			n=input.nextInt();
			if (n%2==0) {
				cp++;
				sp=sp+n;
				/* sp+=n; Poderia ser escrito dessa maneira*/
			}else {
				ci++;
				si=si+n;
				mdi=si/ci;
			}
		}
		System.out.println("A soma dos números pares é "+sp);
		System.out.println("A média dos números ímpares é "+mdi);
	}
}
