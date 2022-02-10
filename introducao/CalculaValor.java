/*
 * 
 */

package introducao;

import java.util.Scanner;

public class CalculaValor {

	public static void main(String[] args) {
		int n1, n2, media;
		Scanner calc = new Scanner(System.in);
		//vem da biblioteca Util, faz leitura do teclado, é o "ler" do Portugol
		// Scanner + nome pra identificar = new Scanner(System.....
		//pra fazer Scanner e dar um crtl+espaço
		
		System.out.println("Digite um número: ");
		n1=calc.nextInt();
		
		System.out.println("Digite outro número: ");
		n2=calc.nextInt();
		
		media=(n1+n2)/2;
		
		System.out.println("A média é: " +media);
		calc.close(); //fechar o calc, mas é mais usado em projs mais complexos.
	}

}
