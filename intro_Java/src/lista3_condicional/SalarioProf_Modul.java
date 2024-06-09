package lista3_condicional;

import java.util.Scanner;

public class SalarioProf_Modul {
	
	public static void main(String[]args) {
		float sal=0, ht;
		int c,np,cat=0,ch=0;
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
					cat=categoria(ch);
					/*if (cat==1) {
						sal=ht*12;
					}else { if (cat==2) {
						sal=ht*17;
					}else { if (cat==3) {
						sal=ht*25;
							}
						}
						}*/
					switch (cat) {
					case 1:
						sal=ht*25;
						break;
					case 2:
						sal=ht*35;
						break;
					case 3:
						sal=ht*75;
						break;
					}
					System.out.println("A remuneração do(a) professor(a) "+nome+" é de R$ "+sal);
				}
	}
	
	public static int categoria(int c) {
		do {
			System.out.print("Categoria (1) (2) ou (3): ");
			Scanner input=new Scanner(System.in);
			c=input.nextInt();
			}while ((c<1) || (c>3));
		System.out.println("Categoria escolhida "+c);
		return c;
	}

	
}	