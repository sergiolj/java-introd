package intro_Java;

import java.util.Scanner;

public class Gorjeta_L1_3 {

	public static void main(String[] args) {
		double vc, vt, gj;
		byte cgj;
		Scanner input=new Scanner(System.in);
		System.out.print("Insira o valor da conta R$ :");
		vc=input.nextFloat();
		vt=vc*1.1;
		gj=vc*0.1;
		System.out.print("Deseja a conta com a gorjeta? (Sim=1) (Não=2)?:");
		cgj=input.nextByte();
		
		if (cgj==1) {
				System.out.println("Valor a pagar R$ " + vt);
		}else {
					System.out.println("Valor a pagar R$ " + vc);
			}
		}
	}
