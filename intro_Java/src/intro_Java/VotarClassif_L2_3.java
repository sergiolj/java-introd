package intro_Java;

import java.util.Scanner;

public class VotarClassif_L2_3 {

	public static void main(String[] args) {
		int idade;
		Scanner input=new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		idade=input.nextInt();
		if (idade<=15) {
			System.out.println("Você não tem idade para votar");
		}else {
			if (((idade>=16) & (idade<=17)) || (idade>65)) {
				System.out.println("Seu voto é facultativo");
			}else {
				System.out.println("Seu voto é obrigatório");
			}
		}
	}

}