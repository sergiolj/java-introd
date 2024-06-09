package intro_Java;

import java.util.Scanner;

public class Emprestimo_L2_5 {
	
	public static void main(String[] args) {
		double sal, parcel;
		Scanner input=new Scanner(System.in);
		System.out.println("Informe o valor do salário bruto: ");
		sal=input.nextDouble();
		System.out.println("Informe o valor da parcela: ");
		parcel=input.nextDouble();
		if (parcel<=sal*0.3) {
			System.out.println("O empréstimo foi aprovado!");
		}else {
			System.out.println("O valor da parcela "+parcel+" excede 30% de "+sal);
		}
}
}
