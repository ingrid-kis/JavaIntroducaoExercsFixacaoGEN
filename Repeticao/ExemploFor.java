/*
 * for - para
 * laço FOR - qdo eu sei quantas vezes será repetido.
 */

package Repeticao;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nTabuada do 7");
		for (int x=1; x<=10;x++)
		{
			System.out.println("7 x " +x+ "= " +7*x);
		}
		
		ler.close();
	}

}
