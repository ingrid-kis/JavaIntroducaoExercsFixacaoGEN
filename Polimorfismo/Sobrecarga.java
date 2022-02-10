package Polimorfismo;

public class Sobrecarga {

	
	//método
	//assinatura do metodo: qtt e tipo de PARAMENTRO:  soma(int n1, int n2)
	//aqui soma recebe DOIS parametros do tipo INTEIRO
	//void: método q não retorna nada, não tem return
	
	//Metodo SET smp é VOID. executa a tarefa
	//metodo GET smp retorna algo.
	
	public void soma(int x, int y) { //dois parametros, tipo INT
		
		System.out.println(x+y);
	}
	
	public void soma(int x, int y, int z) { //3 parametros tipo INT
		
		System.out.println(x+y+z);
	}
	
	public void soma(double x, int y) { //2 parametros, 1 tipo double e 1 int
		
	}
}
