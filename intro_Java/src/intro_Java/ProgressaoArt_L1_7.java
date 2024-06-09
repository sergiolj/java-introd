package intro_Java;

import java.util.Scanner;

public class ProgressaoArt_L1_7 {

	public static void main(String[] args) {
		int t1, t2, rz,tn,n;
		Scanner input=new Scanner(System.in);
		System.out.print("Insira o primeiro termo da PA: ");
		t1=input.nextInt();
		System.out.print("Insita o segundo termo da PA : ");
		t2=input.nextInt();
		System.out.print("Insira o termo a ser calculado: ");
		n=input.nextInt();
		rz=t2-t1;
		tn=t1+(n-1)*rz;
		System.out.println("O termo "+n+" possui valor "+tn);
	}

}
