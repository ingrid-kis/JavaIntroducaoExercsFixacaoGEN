package Polimorfismo;

public class Cachorro extends Mamifero {
	
	@Override
	public void emitirSom() {
		System.out.println("Som de latido"); //sobreescrevendo o som de mamifero.
	}
}
