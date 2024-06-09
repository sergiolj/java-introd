package intro_Java;

import java.util.Scanner;

public class ClassifIdade_L2_10 {
	public static void main(String[]args){
	int id;
	Scanner input=new Scanner(System.in);
	System.out.println("Informe a idade do participante: ");
	id=input.nextInt();
	if (id<5) {
		System.out.println("Ainda não tem idade para competir");
	}else {
		if (id>=5 & id<=7) {
		System.out.println("INFANTIL A");
		}else {
			if (id<=10) {
			System.out.println("INFANTIL B");
			}else {
				if (id<=13) {
				System.out.println("JUVENIL A");
				}else {
					if (id<=17) {
					System.out.println("JUVENIL B");
					}else {
						if (id>=18) {
						System.out.println("SÊNIOR");
							}
						}
					}
				
				}
			
			}
	
		}
	}
}
