package pOO;

public class Pessoa {

	//1 passo: ATRIBUTOS
	//segurança para que outras classes não possam acessar as informações daqui:
	
	private String primeiroNome; // tipo privado String nome= primeiro Nome
	private String nomeMeio;     //privado: só a classe Pessoa pode manipulalos
	private String ultimoNome;
	
	//QUEM CRIA UM NOVO OBJETO É: NEW. Instanciar.
	
	//criar CONSTRUTOR da Classe: O executor vai EXECUTAR o procedimento criado pelo comando NEW, ele não CRIA nada, só executa.
	public Pessoa (String primeiro, String meio, String ultimo) //construtor SMP carrega o nome da Classe, seguido da lista de parâmetros ()
	{                                                           //argumentos os 3 atributos q temos (dos nomes)
		primeiroNome=primeiro; //associar cada parametro () com cada atributo
		nomeMeio=meio;
		ultimoNome=ultimo;
	}
	
	//criar MÉTODO para juntar os 3 nomes (primeiro, meio e último)
	public String getNomeCompleto()
	{
		String nomeCompleto = primeiroNome + " " + nomeMeio + " " + ultimoNome; //variavel criada, com os 3 atributos concatenados
		return nomeCompleto; //retornar algo
	}
	
	
	
}
