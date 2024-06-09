package Basicos;
import java.util.Scanner;
public class MMC_Repet_ex9 {

	public static void main(String[]args) {
		int n1,n2,c=0,mn1=1,mn2=1;
		Scanner input=new Scanner(System.in);
		System.out.println("Digite dois números inteiros: ");
		n1=input.nextInt();
		n2=input.nextInt();
			for(c=2;c<=n1;c++) {
				while (n1%c==0) {
					n1=n1/c;
					mn1=mn1*c;
				}
			for(c=2;c>=n2;c++) {
				if(n2%c==0) {
					mn2=mn2*c;
				}
			}
		}
		
	}
	
}
