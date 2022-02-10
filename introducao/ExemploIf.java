/*
 *  ("/t") - espa�o de tab
 *  ("/n") - pula a linha
 *  if - se
 *  else - sen�o
 *  else if - sen�o se
 */

package introducao;

import java.util.Scanner;

public class ExemploIf {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x;
		
		System.out.println("Insira um n�mero: "); //escreva
		x=ler.nextInt(); //leia
		
		if(x==5 || x==7) //se x=5 OU x=7. OU=uma das condi��es tem q ser verdadeira.
		{
			System.out.println("O valor � 5 ou 7.");
		}
		else if (x<5 && x>3) //sen�o se.  Se x<5 E x>3. As duas condi��es tem q ser verdadeiras.
		{
			System.out.println("O valor est� entre 3 e 5.");
		}
		
		else //sen�o, n�o coloca condi��o ( )
		{
			System.out.println("O valor � maior que 5.");
		}
		System.out.println("\nFim do Programa");
		ler.close();
	}

}
