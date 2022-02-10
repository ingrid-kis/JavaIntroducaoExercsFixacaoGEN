package vetoresMatriz;

import java.util.Scanner;

public class ExVetorSoma {

	public static void main(String[] args) {
		Scanner ler= new Scanner (System.in);
		int[]vet = new int[5];
		int soma=0;
		
		for(int x=0; x<5;x++)
		{
			System.out.println("Digite um número: ");
			vet[x]=ler.nextInt();
			soma=soma+vet[x];
		}

		System.out.println("A soma dos valores é:" +soma);
		
	}
}

