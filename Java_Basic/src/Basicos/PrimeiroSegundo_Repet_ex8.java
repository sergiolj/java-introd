package Basicos;
import java.util.Scanner;

public class PrimeiroSegundo_Repet_ex8 {

	public static void main(String[]args) {
		int pn,sn,c=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Digite dois números: ");
		pn=input.nextInt();
		sn=input.nextInt();
		if(pn>sn) {
			for(c=pn;c>=sn;c--) {
				System.out.println(c);
			}
		}else {
			for(c=pn;c<=sn;c++) {
				System.out.println(c);
			}
		}
	}
}
