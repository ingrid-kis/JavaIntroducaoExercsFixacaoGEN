package vetoresMatriz;

import java.util.Scanner;

public class ExVetor {

	public static void main(String[] args) {
		Scanner ler= new Scanner (System.in);
		
		int[]vet = new int[5]; //tipo [] nome = new int [tamanho];
		/* vet[0]=2; //vet [índice 0] vale 2.
		vet[1]=5;
		vet[2]=8;
		vet[3]=11;
		vet[4]=21;
		
		//System.out.println(vet[4]); ====== mostra o valor do vet índice 4, q é 21.
		*/
		
		//geralmente é usado o FOR para repetir o vetor
		
		for(int x=0; x<5;x++)
		{
			System.out.println("Digite um número: ");
			vet[x]=ler.nextInt(); //esse x representa o x=0, q mostra no laço for
			System.out.println(vet[x]); //aqui mostra o valor de cima
		}
		
		for (int x=0;x<5;x++)
		System.out.println(vet[x]); //vai mostrar o numero q vc digitou.
		
		
	}

}
