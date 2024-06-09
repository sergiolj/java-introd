package intro_Java;

import java.util.Scanner;

public class VideoLocadora_L1_9 {

	public static void main(String[] args) {
		int acervo,opcao;
		double diaria = 0, fat_ano, vmulta,fatmulta,reposicao=0,acervon;
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Informe a quantidade de fitas do acervo inicial:");
			acervo=input.nextInt();
			System.out.println("Informe a valor da diária:");
			diaria=input.nextInt();
			vmulta=(diaria*0.10);
			opcao=1;
			while (opcao != 0){
				System.out.println("Qual a informação deseja?");
				System.out.println("(1) Faturamento");
				System.out.println("(2) Valor recebido com multas");
				System.out.println("(3) Acervo de fitas atualizado");
				System.out.println("(0) Zero para sair");
				opcao=input.nextInt();
				switch (opcao){
			case 1: fat_ano= (((acervo*0.3)*12)*diaria);
					System.out.println("O faturamento anual é de R$ "+fat_ano);
					break;
			case 2: fatmulta= (((acervo*0.3)*0.1)*vmulta);
					System.out.println("O valor arrecadado mensalmente com multas é de R$ "+fatmulta);
					break;
			case 3: reposicao=(acervo*0.1);
					acervon=(acervo*0.98)+reposicao;
					System.out.println("O acervo atualizado após um ano é de  "+acervon);
					break;	
				}
				
			}
		}
	}

}
