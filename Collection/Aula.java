package Collection;

public class Aula {

	private String titulo;
	private int tempo;
	
	//construtor
	public Aula(String x, int n) {
		this.titulo=x;
		this.tempo=n;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
	public String toString() { //para pegar os metodos direto e nao usar da memoria: toString
		return "Aulas: "+this.titulo+ ", " +this.tempo+ " min";
	}
}
