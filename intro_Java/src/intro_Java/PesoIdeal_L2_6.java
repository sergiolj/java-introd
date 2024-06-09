package intro_Java;
import java.util.Scanner;


public class PesoIdeal_L2_6 {

	public static void main(String[] args){
		int g;
		double pideal,h;
		Scanner input=new Scanner(System.in);
		System.out.println("Informe sua altura em metros: ");
		h=input.nextDouble();
		System.out.println("Informe seu sexo (1) Masculino (2) Feminino: ");
		g=input.nextInt();
		if (g==1) {
			pideal=(72.7*h)-58;
			System.out.println("Seu peso ideal é de "+pideal+" kg");
					}else { if (g==2) {
						pideal=(62.1*h)-44.7;
						System.out.println("Seu peso ideal é de "+pideal+" kg");
							}else {
								System.out.println("Dados inválidos para sexo");
							}
	}
	}
}
