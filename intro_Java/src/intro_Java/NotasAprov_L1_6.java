package intro_Java;

import java.util.Scanner;

public class NotasAprov_L1_6 {

	public static void main(String[] args) {
		float n1,n2,n3,mp,sp;
		byte p1,p2,p3;
		Scanner input=new Scanner(System.in);
		System.out.println("Insira a nota 1 e o peso 1");
		n1=input.nextFloat();
		p1=input.nextByte();
		System.out.println("Insira a nota 2 e o peso 2");
		n2=input.nextFloat();
		p2=input.nextByte();
		System.out.println("Insira a nota 3 e o peso 3");
		n3=input.nextFloat();
		p3=input.nextByte();
		/*
		 * Calcular a media ponderada
		 */
		sp=(p1+p2+p3);
		mp=((n1*p1)/sp)+((n2*p2)/sp)+((n3*p3)/sp);
		System.out.print("A média final do aluno é "+mp);
		}

}
