package intro_Java;

import java.util.Scanner;

public class CaixaEletronico_L1_8 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n1, n2, n5, n10, n50,saque;
		/* Porque eu não preciso zerar as variáveis?
		n1=0;
		n2=0;
		n5=0;
		n10=0;
		n50=0;
		*/
		System.out.println("Digite o valor do saque");
		saque=input.nextInt();
		n50=saque/50;
		n10=saque%50/10;
		n5=saque%10/5;
		n2=saque%5/2;
		n1=saque%5-(2*n2);
		System.out.println("Saque  --> "+n50+" nota(s) de R$ 50");
		System.out.println("       --> "+n10+" nota(s) de R$ 10");
		System.out.println("       --> "+n5+" nota(s) de R$ 5");
		System.out.println("       --> "+n2+" nota(s) de R$ 2");
		System.out.println("       --> "+n1+" nota(s) de R$ 1");	

	}

}
