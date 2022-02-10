package Polimorfismo;

public class Mamifero extends Animal {

	@Override //indica q est� sobreescrevendo o void movimentar da classe mae Animal
	public void emitirSom() {
		System.out.println("Som de mamifero"); //aqui tem comportamento de som de MAMIFERO
	}
	
	@Override //indica q est� sobreescrevendo o void movimentar da classe mae Animal
	public void movimentar() {
		System.out.println("Correndo"); //aqui est� sobreescrevendo CORRENDO
	}
}
