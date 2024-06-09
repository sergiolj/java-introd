package intro_Java;

import java.util.Scanner;

public class ConvertTemp_L1_1 {

	public static void main(String[] args) {
		float tc, tf;
		Scanner input=new Scanner(System.in);
		System.out.println("Digite uma temperatura em graus Célcius");
		tc=input.nextFloat();
		tf=((9*tc)+160)/5;
		System.out.println("Temperatura em Fahrenheit= "+ tf);
	}

}
