package Polimorfismo;

public abstract class  Animal { //classe abstrata

	private double peso;
	private String nome;
	
	//m�todos
	public void emitirSom() {
		
		System.out.println("Som gen�rico");
	}
	
	public void movimentar() {
		System.out.println("Movimento gen�rico");
	}
	
	
	
}
