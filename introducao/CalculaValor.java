/*
 * 
 */

package introducao;

import java.util.Scanner;

public class CalculaValor {

	public static void main(String[] args) {
		int n1, n2, media;
		Scanner calc = new Scanner(System.in);
		//vem da biblioteca Util, faz leitura do teclado, � o "ler" do Portugol
		// Scanner + nome pra identificar = new Scanner(System.....
		//pra fazer Scanner e dar um crtl+espa�o
		
		System.out.println("Digite um n�mero: ");
		n1=calc.nextInt();
		
		System.out.println("Digite outro n�mero: ");
		n2=calc.nextInt();
		
		media=(n1+n2)/2;
		
		System.out.println("A m�dia �: " +media);
		calc.close(); //fechar o calc, mas � mais usado em projs mais complexos.
	}

}
