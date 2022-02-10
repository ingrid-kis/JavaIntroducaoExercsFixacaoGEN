package introducao;

import java.util.Scanner;

public class aulaIntro {

	public static void main(String[] args) {
		
		Scanner ler= new Scanner(System.in); //scanner- class, ler - objeto, scanner- construtor, (system.in)- paramentro do input do sistema
		int x;
		String m="rosa";
		
		System.out.println("Digite carga");
		x=ler.nextInt();
		
		Caneta c1= new Caneta(x, m); //caneta classe, c1 nome do molde (classe), tipo scanner
		//C1 chamando pra fazer algo, pois sua class é c1
		c1.cor="azul";
		c1.ponta=0.5f;
		c1.tampar();
		c1.carga=80;
		c1.status();  //atribui primeiro, pra depois mostrar o status.
		c1.escrever();
		
		System.out.println("\n");
		
		Caneta c2= new Caneta(x,m); //c2 nao é a msm caneta q c1, só tá usando a msm forma
		
		c2.ponta=0.7f;
		c2.destampar();
		c2.carga=30;
		c2.status(); 
		c2.escrever();
		
	}
}
