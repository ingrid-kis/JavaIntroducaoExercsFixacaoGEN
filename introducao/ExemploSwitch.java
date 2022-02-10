/*
 * switch = escolha do Portugol
 * -> usado bastante em menus.
 * nextline só funciona com String
 * switch case - escolha caso
 * break - pare
 * default - caso contrário
 * switch case é uma alternativa mais elegante qdo vc quer verificar uma situação de igualdade.
 * Ex.: Em menus, se vc quiser ir para opção 1, vc aperta o botão vermelho.
 * IF é mais comum de ser usado do que SWITCH CASE, pq é mais abrangente.
 * String = lê números, mas não atribui. Ex, num formulário, na hora de preencher o RG.
 * São só números, mas não são atribuídos para alguma variável.
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
		case "a": //caso o valor seja A , somente uma igualdade bem específica.
			System.out.println("Vogal."); //escreva
			break; //pare
			
		case "e": //caso o valor seja E
			System.out.println("Vogal.");
			break; //pare
			
		case "i": //caso o valor seja I
			System.out.println("Vogal."); //escreva
			break; //pare, não tem condição ()
			
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
