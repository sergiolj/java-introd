package intro_Java;

import java.util.Scanner;

public class IdadeDias_L1_5 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a, m, d,dv;
		System.out.println("Digite quantos anos você tem");
		a=input.nextInt();
		System.out.println("Digite quantos meses");
		m=input.nextInt();
		System.out.println("Digite quantos dias");
		d=input.nextInt();
		dv=(a*360+m*30+d);
		System.out.println("Você tem " + dv + " dias de vida");
	}

}
