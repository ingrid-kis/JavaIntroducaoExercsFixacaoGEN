/*
 * switch = escolha do Portugol
 * -> usado bastante em menus.
 * nextline s� funciona com String
 * switch case - escolha caso
 * break - pare
 * default - caso contr�rio
 * switch case � uma alternativa mais elegante qdo vc quer verificar uma situa��o de igualdade.
 * Ex.: Em menus, se vc quiser ir para op��o 1, vc aperta o bot�o vermelho.
 * IF � mais comum de ser usado do que SWITCH CASE, pq � mais abrangente.
 * String = l� n�meros, mas n�o atribui. Ex, num formul�rio, na hora de preencher o RG.
 * S�o s� n�meros, mas n�o s�o atribu�dos para alguma vari�vel.
 */

package introducao;

import java.util.Scanner;

public class ExemploSwitch {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String x;
		
		System.out.println("Digite uma letra: "); //escreva
		x=ler.nextLine();
		
		switch(x)
		{
		case "a": //caso o valor seja A , somente uma igualdade bem espec�fica.
			System.out.println("Vogal."); //escreva
			break; //pare
			
		case "e": //caso o valor seja E
			System.out.println("Vogal.");
			break; //pare
			
		case "i": //caso o valor seja I
			System.out.println("Vogal."); //escreva
			break; //pare, n�o tem condi��o ()
			
		case "o":
			System.out.println("Vogal");
			break;
		
		case "u":
			System.out.println("Vogal");
			break;
			
		default:
			System.out.println("Consoante");
		}
		
		
		ler.close();
	}

}
