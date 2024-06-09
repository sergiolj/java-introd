package Basicos;

public class Crescimento_Repet_ex10 {
	public static void main(String[]args){
		double asd=1.05,tibr=1.20;
		int c=1;
		do {
			c++;
			asd +=0.03;
			tibr +=0.02;			
		}while(asd<tibr);
		System.out.println("Levará "+c+" anos para que Asdrubal com "+asd+" metros fique maior do que "+tibr);
		}
		
	}
