package intro_Java;

import java.util.Scanner;

public class TempoDuracao_L1_10 {

	public static void main(String[] args) {
		int hi,hf,mi,mf,si,sf;
		int ts,ht,mt,st;
		Scanner input=new Scanner(System.in);
		System.out.println("Informe o início da atividade em hora, minuto e segundo: ");
		hi=input.nextInt();
		mi=input.nextInt();
		si=input.nextInt();
		System.out.println("Informe o término da atividade em hora, minuto e segundo: ");
		hf=input.nextInt();
		mf=input.nextInt();
		sf=input.nextInt();
		ts=((hf*3600)-(hi*3600))+((mf*60)-(mi*60))+(sf-si);
		ht=ts/3600;
		mt=ts%3600/60;
		st=ts%60;
		System.out.println("A duração da atividade foi de " + ht+" horas "+mt+" minutos e "+st+" segundos");
	}

}
