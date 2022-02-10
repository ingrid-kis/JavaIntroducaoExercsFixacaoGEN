/*
 * Do - faça
 * While - Enquanto
 */

package Repeticao;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1, n2;
		
		System.out.println("\nDigite um número: "); //escreva
		n1=ler.nextInt();
		
		System.out.println("\nDigite um número: ");
		n2=ler.nextInt();
		
		do
		{
			System.out.println("A soma é " + (n1+n2));
			
			System.out.println("\nDigite um número: "); //escreva
			n1=ler.nextInt();//leia
			
			System.out.println("\nDigite um número: ");
			n2=ler.nextInt();
		}
		while(n1!=-1 || n2!=-1);
		
		
	ler.close();
	}

}
