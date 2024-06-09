package lista3_condicional;

import java.util.Scanner;

public class SalarioProf_Modul {
	public static void main(String[]args) {
		float sal=0, ht;
		int c,np, ch=0,cat;
		String nome;
		Scanner input=new Scanner(System.in);
		System.out.print("Qual a quantidade de professores?: ");
		np=input.nextInt();
				for (c=1;c<=np;c++) {
					System.out.print("Nome: ");
					/* A próxima linha corrige um bug e deve ser usada antes de ler uma String com nextLine*/
					input.nextLine();
					nome=input.nextLine();
					System.out.print("Informe a quantidade de horas trabalhadas: ");
					ht=input.nextFloat();
					categoria(cat);
					ch=cat;
					/*Porque não está entrando no case com o valor de cat?*/
					switch (ch) {
					case 1:
						sal=ht*12;
						break;
					case 2:
						sal=ht*17;
						break;
					case 3:
						sal=ht*25;
						break;
					}
					System.out.println("A remuneração do professor(a) "+nome+" é de R$ "+sal);
				}
		
	}
	public static int categoria(int cat) {
		do {
			System.out.print("Categoria (1) (2) ou (3): ");
			Scanner input=new Scanner(System.in);
			cat=input.nextInt();
			}while ((cat<1) || (cat>3));
		System.out.println("Categoria escolhida"+cat);
		return cat;
	}
}	