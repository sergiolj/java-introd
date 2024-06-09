package intro_Java;

import java.util.Scanner;

public class Calculadora_L2_8 {

	public static void main(String[] args) {
	double op1,op2,result=0;
	int operac;
	Scanner input=new Scanner(System.in);
	System.out.println("Informe o operador 1: ");
		op1=input.nextDouble();
	System.out.println("Informe o operador 2: ");
		op2=input.nextDouble();
	System.out.println("Informe a operação (1) Soma (2) Subtração (3) Multiplicação (4) Divisão");
		operac=input.nextInt();
	switch (operac){
		case 1:result=op1+op2;
		//String symb="+";
				break;
		case 2:result=op1-op2;
		//String symb="-";
				break;
		case 3:result=op1*op2;
		//String symb="*";
				break;
		case 4:result=op1/op2;
		//String symb="/";
				break;
	}
	System.out.println("O resultado de "+op1+" e "+op2+" ="+result);
	}
}
