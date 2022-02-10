package Polimorfismo;

public class SobreposicaoTeste {
	
	public static void main(String[] args) {
		
	//	Animal a = new Animal();
		Mamifero m = new Mamifero();
		Cachorro c1 = new Cachorro();
		Canguru c2 = new Canguru();
		
	//	a.emitirSom(); //cada um chamou a acão da sua classe
		m.emitirSom();
		c1.emitirSom();
		c2.emitirSom();
		
		System.out.println("\n"); //pular linha
	//	a.movimentar(); //cada um chamou a acão da sua classe
		m.movimentar();
		c1.movimentar();
		c2.movimentar();
	}

}
