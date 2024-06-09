package intro_Java;

import java.util.Scanner;

public class Apto_votar_L2_1 {

	public static void main(String[] args) {
		int anasc,aatual;		
		Scanner input=new Scanner(System.in);
		System.out.println("Digite o ano de nascimento: ");
		anasc=input.nextInt();
		aatual=2024;
		if ((aatual-anasc) >=16){
			System.out.println("Está apto a votar esse ano");
			}else {
				System.out.println("Não está apto a votar ainda");
			}
		}
	}