/* While - enquanto
 * 
 */

package Repeticao;

import java.util.Scanner;

public class ExemploWhile {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1, n2;
		
		System.out.println("\nDigite o npumero que será dividido: "); //escreva
		n1=ler.nextInt();
		
		System.out.println("\nDigite o npumero divisor: ");
		n2=ler.nextInt();
		
		while(n2!=0) //se n2 for diferente de 0
		{
			System.out.println("A divisão é " +n1/n2);
		
			System.out.println("\nDigite o npumero que será dividido: ");
			n1=ler.nextInt();
			
			System.out.println("\nDigite o npumero divisor: ");
			n2=ler.nextInt();	
		}
		
		System.out.println("Não é possível dividir por zero");
		
		ler.close();
	}

}
