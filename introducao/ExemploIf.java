/*
 *  ("/t") - espaço de tab
 *  ("/n") - pula a linha
 *  if - se
 *  else - senão
 *  else if - senão se
 */

package introducao;

import java.util.Scanner;

public class ExemploIf {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x;
		
		System.out.println("Insira um número: "); //escreva
		x=ler.nextInt(); //leia
		
		if(x==5 || x==7) //se x=5 OU x=7. OU=uma das condições tem q ser verdadeira.
		{
			System.out.println("O valor é 5 ou 7.");
		}
		else if (x<5 && x>3) //senão se.  Se x<5 E x>3. As duas condições tem q ser verdadeiras.
		{
			System.out.println("O valor está entre 3 e 5.");
		}
		
		else //senão, não coloca condição ( )
		{
			System.out.println("O valor é maior que 5.");
		}
		System.out.println("\nFim do Programa");
		ler.close();
	}

}
