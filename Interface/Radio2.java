package Interface;

public class Radio2 implements Radio{ //implements IMPLEMENTA/USA a Interface. No caso, Radio.
	                                  //criando uma padronização.

	private boolean ligado;
	private int volume=0;
	
	//aqui tá falando como funciona
	@Override
	public void ligar() {
		System.out.println("Ligando o radio");
		ligado=true;
	}

	@Override
	public void desligar() {
		System.out.println("Desligando");
		ligado=false;
	}

	@Override
	public void maisVol() {
		volume++;
		System.out.println(volume);
		
	}

	@Override
	public void menosVol() {
		volume--;
		System.out.println(volume);
		
	}

	@Override
	public void trocarEstacao() {
		System.out.println("Mudando estacao");
		
	} 

}
