package vetoresMatriz;

import java.util.Scanner;

public class ExVetor {

	public static void main(String[] args) {
		Scanner ler= new Scanner (System.in);
		
		int[]vet = new int[5]; //tipo [] nome = new int [tamanho];
		/* vet[0]=2; //vet [�ndice 0] vale 2.
		vet[1]=5;
		vet[2]=8;
		vet[3]=11;
		vet[4]=21;
		
		//System.out.println(vet[4]); ====== mostra o valor do vet �ndice 4, q � 21.
		*/
		
		//geralmente � usado o FOR para repetir o vetor
		
		for(int x=0; x<5;x++)
		{
			System.out.println("Digite um n�mero: ");
			vet[x]=ler.nextInt(); //esse x representa o x=0, q mostra no la�o for
			System.out.println(vet[x]); //aqui mostra o valor de cima
		}
		
		for (int x=0;x<5;x++)
		System.out.println(vet[x]); //vai mostrar o numero q vc digitou.
		
		
	}

}
