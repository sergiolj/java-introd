package intro_Java;

import java.util.Scanner;

public class SalariosMin_L1_4{

	public static void main(String[] args) {
		double sm, sref, qtdsm;
		Scanner input=new Scanner(System.in);
		System.out.print("Informe o valor do salário mínimo: ");
		sm=input.nextDouble();
		System.out.print("Informe o valor do salário de referência: ");
		sref=input.nextDouble();
		qtdsm=sref/sm;
		System.out.println("Você recebe "+qtdsm+ " salários mínimos");		
		
	}

}
