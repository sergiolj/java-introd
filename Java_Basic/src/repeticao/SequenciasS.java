package repeticao;

import java.util.Scanner;

public class SequenciasS {

	public static void main(String[] args) {
		int n;
		double s1=1.0,s2=1.0,s3=1.0;
		Scanner input=new Scanner(System.in);
		System.out.println("Digite um inteiro maior do que (0):");
		n=input.nextInt();
		System.out.println("S(a)="+seqa(n));
		System.out.println("S(b)="+seqb(n));
		System.out.println("S(c)="+seqc(n));
	}
	
	public static double seqa(int n) {
		double s=1.0;
		for (int i=2;i<=n;i++){
			s+=(1.0/i);  // Se não colocar um valor com vírgulas o compilador não divide corretamente s+=(1/i) incorreto
		}
		return s;
	}
	
	public static double seqb(int n) {
		double s=0;
		int a=n;
		for (int i=1;i<=n;i++){
			s+=(double)i/a;
			a--;
		}
		return s;
	}
	
	// Recebe um número e faz as operações de soma e 
	//subtração das frações caso sejam pares (subtrai) ou impares (soma)
	public static double seqc(int n) {
		double s=1.0;
		for (int i=2;i<=n;i++){
			if(i%2==0) {
				s-=(1.0/i);              // Se não colocar um valor com vírgulas o compilador não divide corretamente s+=(1/i) incorreto
			}else {
				s+=(1.0/i);
			}
		}
		return s;
	}

}