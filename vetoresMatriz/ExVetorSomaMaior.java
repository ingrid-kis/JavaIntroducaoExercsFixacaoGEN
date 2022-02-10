package vetoresMatriz;

import java.util.Scanner;

public class ExVetorSomaMaior {

	public static void main(String[] args) {
		Scanner ler= new Scanner (System.in);
		int[]vet = new int[5];
		
		// int[]vet={1,2,3,4,5}; ------> vetor populado, já preenchido
		int maior=0;
		
		for(int x=0; x<5;x++)
		{
			System.out.println("Digite um número: ");
			vet[x]=ler.nextInt();
			
			if(vet[x]>maior)
					maior=vet[x];
		}

		System.out.println("O maior valor é" +maior);
		
	}
}

