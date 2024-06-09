package intro_Java;

import java.util.Scanner;

public class Divisivel_L2_2 {

	public static void main(String[] args) {
		int a,b;
		Scanner input=new Scanner(System.in);
		System.out.println("Digite o valor de A: ");
		a=input.nextInt();
		System.out.println("Digite o valor de B: ");
		b=input.nextInt();
		if (a%b == 0){
			System.out.println("O número "+a+" É DIVISÍVEL por "+b);
		}else {
			System.out.println("O número "+a+" NÃO É DIVISÍVEL por "+b);		
			}
	}

}
