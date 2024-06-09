package intro_Java;

import java.util.Scanner;

public class IdadesHM_L2_9 {

	
	public static void main(String[]args) {
		int h1, h2, m1, m2,hvmn,hnmv,hv,hn,mv,mn;
		Scanner input=new Scanner(System.in);
		System.out.println("Digite a idade dos Homens: ");
		h1=input.nextInt();
		h2=input.nextInt();
		System.out.println("Digite a idade das Mulheres: ");
		m1=input.nextInt();
		m2=input.nextInt();
		if (h1>h2) {
			hv=h1;
			hn=h2;
		}else {
			hv=h2;
			hn=h1;
		}
		if (m1>m2){
			mv=m1;
			mn=m2;
		}else {
			mv=m2;
			mn=m1;
		}				
			hvmn=hv+mn;
			hnmv=hn*mv;
			System.out.println("O homem mais velho tem "+hv+" anos");
			System.out.println("A mulher mais nova tem "+mn+" anos");
			System.out.println(hvmn);
			System.out.println(hnmv);
	}
}