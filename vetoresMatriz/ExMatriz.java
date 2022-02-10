package vetoresMatriz;

import java.util.Scanner;

public class ExMatriz {

	public static void main(String[] args) {
		Scanner ler= new Scanner (System.in);
		
		int[][]mat = {{1,2,3},{4,5,6}};//tipo [] [] nome matriz (mat) = {populada}. Matriz de 2 linhas, 3 colunas.

		int [][]mat2 = new int[2][3]; //quando nao q matriz nao é populada (dada o valor), 4 linhas e 3 colunas.
				
		for(int linha=0;linha<2;linha++)
		{
			for(int coluna=0;coluna<3;coluna++)
			{
				System.out.println("Digite um número: ");
				mat2[linha][coluna]=ler.nextInt();
			}
		}
		
		//para imprimir as 2 matrizes, fazer o FOR para cada uma
		
		for(int x=0;x<2;x++) //x é a linha
		{
			for(int y=0;y<3;y++) //y=coluna
			{
				System.out.print(mat[x][y] +"\t");
			}
			
			System.out.println("\n");
		}
		
		for(int x=0;x<2;x++) //x é a linha, y coluna
		{
			for(int y=0;y<3;y++)
			{
				System.out.print(mat2[x][y] +"\t");
			}
			
			System.out.println("\n");
	}
	}

}
