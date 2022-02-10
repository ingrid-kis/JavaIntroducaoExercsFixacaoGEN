/* package Excecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		int n=0;
		
		try {
			
			System.out.println("Digite um número para fazer a divisão: ");
			int n=ler.nextInt(); //ONDE PODE OCORRER O ERRO
			System.out.println(30/n);
			
 		} catch(InputMismatchException erro) { //ERRO ESPECÍFICO
 			System.out.println("Erro! Vc digitou nº errado. " +erro);
 	    }
		
//	   } catch(Exception erro) { // TRATATIVA DE ERRO GENERICO
//			System.out.printf("Você cometeu um erro " , erro);
//			//pode criar um catch pra cada erro, só colocar abaixo, no prox {}
//	   }
		
	   }catch(ArithmeticException erro) {
		   do {
			   System.out.println("Não é possível divisão por ZERO");
			   System.out.println("Digite um número para fazer a divisão: ");
			   int n=ler.nextInt(); //ONDE PODE OCORRER O ERRO
		   }
			while(n==0);   
		}
		System.out.println("\n FIM DO PROGRAMA");
		
		
		
		
	}

}
*/
