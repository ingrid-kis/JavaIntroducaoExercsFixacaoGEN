package Polimorfismo;

public abstract class  Animal { //classe abstrata

	private double peso;
	private String nome;
	
	//métodos
	public void emitirSom() {
		
		System.out.println("Som genérico");
	}
	
	public void movimentar() {
		System.out.println("Movimento genérico");
	}
	
	
	
}
