package intro_Java;

import java.util.Scanner;

public class Poligono_L2_7 {
	public static void main(String[] args) {
		int nl,cl,p;
		double aq;
		Scanner input=new Scanner(System.in);
		System.out.println("Digite o número de arestas do polígono");
		nl=input.nextInt();
		System.out.println("Qual a medida do lado em cm? ");
		cl=input.nextInt();
		if (nl==3){
			p=cl*nl;
			System.out.println("Polígono é um triângulo com perímetro de "+p+" centímetros");
		}else {
			if (nl==4){
				aq=cl*cl;
				System.out.println("O pológono é um quadrado de área "+aq+" centímetros quadrados");
			}else {
				if (nl==5) {
					System.out.println("O pológono é um pentágono");
				}else {
					System.out.println("Dados inválidos");
				}
			}
		}
	}

}
