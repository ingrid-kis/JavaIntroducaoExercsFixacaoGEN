package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Ex1 {

	public static void main(String[] args) {
		String aula1 = "Bloco 1";
		String aula2 = "Bloco 2";
		String aula3 = "Bloco 3";
		
		ArrayList<String> aula = new  ArrayList<>();//arraylist nome da classe, <tipo>, nome do obj
		//método construtor
		System.out.println(aula); //[] ta vazio
		
		aula.add("Feira de empregabilidade"); //add texto na lista, pode colocar string
		System.out.println(aula);
		
		aula.add(aula1); //add o valor de uma variavel
		System.out.println(aula);
		
		aula.add(aula2); //chama o metodo com valor
		aula.add(aula3);
		System.out.println(aula); //printa o método
		
		aula.set(0, "Matricula"); //pediu pra ESCREVER EM CIMA do, MUDA Feira de Empregabilidade
		System.out.println(aula); //pediu pra printar
		
		System.out.println(aula.get(2)); //mostra o conteudo específico do indice escolhido.
		
		System.out.println(aula.size());//retorna a qtdd de elementos do arraylist, mostra o tamanho
		
		System.out.println(aula.contains("Matricula")); //retorna TRUE se encontrar o valor
		//como procurar/encontrar uma info dentro do Arraylist
		
		System.out.println(aula.contains(aula3)); //pode procurar o texto String ou variável
		//esse contains pode ter uma condição, dai usa jto com If
		
		
		Collections.sort(aula);//como colocar em ordem crescente os conteudos
		System.out.println(aula); //imprimir organizado em ordem alfabetica
		
		aula.remove(0);//como apagar o conteúdo. Isso realoca os outros valores do arrayList
		System.out.println(aula); //antes matricula era 0, agora bloco está no indice 0.
		
		aula.clear();//para apagar tudo da listaArray
		System.out.println(aula);
		
	}
}
