/* package Excecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		int n=0;
		
		try {
			
			System.out.println("Digite um n�mero para fazer a divis�o: ");
			int n=ler.nextInt(); //ONDE PODE OCORRER O ERRO
			System.out.println(30/n);
			
 		} catch(InputMismatchException erro) { //ERRO ESPEC�FICO
 			System.out.println("Erro! Vc digitou n� errado. " +erro);
 	    }
		
//	   } catch(Exception erro) { // TRATATIVA DE ERRO GENERICO
//			System.out.printf("Voc� cometeu um erro " , erro);
//			//pode criar um catch pra cada erro, s� colocar abaixo, no prox {}
//	   }
		
	   }catch(ArithmeticException erro) {
		   do {
			   System.out.println("N�o � poss�vel divis�o por ZERO");
			   System.out.println("Digite um n�mero para fazer a divis�o: ");
			   int n=ler.nextInt(); //ONDE PODE OCORRER O ERRO
		   }
			while(n==0);   
		}
		System.out.println("\n FIM DO PROGRAMA");
		
		
		
		
	}

}
*/
