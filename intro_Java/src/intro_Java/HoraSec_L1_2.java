package intro_Java;

import java.util.Scanner;

public class HoraSec_L1_2 {

	public static void main(String[] args) {
		int h,m,s,ts;
		Scanner input=new Scanner(System.in);
		System.out.print("Insira a hora atual: ");
		h=input.nextInt();
		System.out.print("Insira os minutos da hora atual: ");
		m=input.nextInt();
		System.out.print("Insira os segundos da hora atual: ");
		s=input.nextInt();
		ts=h*3600+m*60+s;
		System.out.println("Já se passaram "+ts+" segundos");
 	
	}

}
