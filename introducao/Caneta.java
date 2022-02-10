/*
	 * características == atributos
	 *  4 pilares do POO - abstração 
	 *  comportamentos == métodos (funções, oq a caneta pode fazer, tarefas q ele realiza ou sofre)
	 *  todo método tem um nome, e é mto comum usar como um VERBO. Identificado por ()
	 *  métodos q só executam a açaõ, nao trazem um resultado/informação de volta, são chamados VOID
	 *  os métodos q trazem retorno, info não são VOID, são o q eles trazem, eles retornam valor.
	 *  ex.: troca o dinheiro no mercado, o dinheiro volta como INT ou DOUBLE.
	 *  instanciar = puxar os valores ou tudo que tem em uma classe a seu objeto instanciado.
	 *  /
	 */ 

package introducao;

public class Caneta {
	
	//atributos, sem parenteses:
		String cor; //vermelho, preto ou azul
		float ponta; // tipo lapiseira, ponta 0.7, 0.5, etc
		int carga; //porcentagem 20% ou 90% cheia
		boolean tampada; //se ta tampada V, senão F
	
	//método construtor:
		public Caneta(int valor, String vColorido) //msm nome da classe, sem void. Pode modificar o q era default (padrao)
		//qdo o parenteses está vazio, qr dizer q nao recebe nenhum parametro, funciona sozinho:
		//public Caneta()
		//para q funciona a partir de um paramentro, coloca-lo entre ().
		
		{
			this.tampada=true;
			this.carga=valor;
			this.cor=vColorido;
			
		}
		
		
		
		
	//métodos, com parenteses:
		public void tampar() { //método tampar, só tampa, não traz info de volta, não retorna valor.
			
			this.tampada=true; //this quer dizer q ele está mudando o valor da variavel dentro desse { }
			                   //this só se referencia a classe CANETA.
		}
		
		public void destampar() {
			this.tampada=false; //mudou o boolean para F
		}
		
		public void escrever() {
			if(this.tampada==true)
				System.out.println("ERRO! Caneta está tampada."); //printar na tela nao é retorno de informação
			else
				System.out.println("Escrevendo...");
		}
		
		public void status() { //p/ver estado atual do objeto
			System.out.println("A cor da caneta é: " +this.cor);
			System.out.println("A ponta é: " +this.ponta);
			System.out.println("Esta tampada? " +this.tampada);
			System.out.println("A carga está em: " +this.carga);
			
		}
		
}


