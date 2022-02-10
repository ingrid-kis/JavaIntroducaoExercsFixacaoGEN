package pOO;

public class Pessoa {

	//1 passo: ATRIBUTOS
	//seguran�a para que outras classes n�o possam acessar as informa��es daqui:
	
	private String primeiroNome; // tipo privado String nome= primeiro Nome
	private String nomeMeio;     //privado: s� a classe Pessoa pode manipulalos
	private String ultimoNome;
	
	//QUEM CRIA UM NOVO OBJETO �: NEW. Instanciar.
	
	//criar CONSTRUTOR da Classe: O executor vai EXECUTAR o procedimento criado pelo comando NEW, ele n�o CRIA nada, s� executa.
	public Pessoa (String primeiro, String meio, String ultimo) //construtor SMP carrega o nome da Classe, seguido da lista de par�metros ()
	{                                                           //argumentos os 3 atributos q temos (dos nomes)
		primeiroNome=primeiro; //associar cada parametro () com cada atributo
		nomeMeio=meio;
		ultimoNome=ultimo;
	}
	
	//criar M�TODO para juntar os 3 nomes (primeiro, meio e �ltimo)
	public String getNomeCompleto()
	{
		String nomeCompleto = primeiroNome + " " + nomeMeio + " " + ultimoNome; //variavel criada, com os 3 atributos concatenados
		return nomeCompleto; //retornar algo
	}
	
	
	
}
