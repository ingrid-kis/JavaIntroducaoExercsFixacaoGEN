/*
	 * caracter�sticas == atributos
	 *  4 pilares do POO - abstra��o 
	 *  comportamentos == m�todos (fun��es, oq a caneta pode fazer, tarefas q ele realiza ou sofre)
	 *  todo m�todo tem um nome, e � mto comum usar como um VERBO. Identificado por ()
	 *  m�todos q s� executam a a�a�, nao trazem um resultado/informa��o de volta, s�o chamados VOID
	 *  os m�todos q trazem retorno, info n�o s�o VOID, s�o o q eles trazem, eles retornam valor.
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
		boolean tampada; //se ta tampada V, sen�o F
	
	//m�todo construtor:
		public Caneta(int valor, String vColorido) //msm nome da classe, sem void. Pode modificar o q era default (padrao)
		//qdo o parenteses est� vazio, qr dizer q nao recebe nenhum parametro, funciona sozinho:
		//public Caneta()
		//para q funciona a partir de um paramentro, coloca-lo entre ().
		
		{
			this.tampada=true;
			this.carga=valor;
			this.cor=vColorido;
			
		}
		
		
		
		
	//m�todos, com parenteses:
		public void tampar() { //m�todo tampar, s� tampa, n�o traz info de volta, n�o retorna valor.
			
			this.tampada=true; //this quer dizer q ele est� mudando o valor da variavel dentro desse { }
			                   //this s� se referencia a classe CANETA.
		}
		
		public void destampar() {
			this.tampada=false; //mudou o boolean para F
		}
		
		public void escrever() {
			if(this.tampada==true)
				System.out.println("ERRO! Caneta est� tampada."); //printar na tela nao � retorno de informa��o
			else
				System.out.println("Escrevendo...");
		}
		
		public void status() { //p/ver estado atual do objeto
			System.out.println("A cor da caneta �: " +this.cor);
			System.out.println("A ponta �: " +this.ponta);
			System.out.println("Esta tampada? " +this.tampada);
			System.out.println("A carga est� em: " +this.carga);
			
		}
		
}


