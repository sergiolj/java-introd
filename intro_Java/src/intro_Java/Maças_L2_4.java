package intro_Java;

import java.util.Scanner;

public class Maças_L2_4 {

	public static void main(String[] args) {
		int qtd;
		double valor;
		Scanner input=new Scanner(System.in);
		System.out.println("Quantidade de maçãs compradas: ");
		qtd=input.nextInt();
		if (qtd<12) {
			valor=qtd*0.3;
		}else {
			valor=qtd*0.25;
		}
		System.out.println("O valor da compra de "+qtd+" maçãs é de R$ "+valor);
	}

}
