package Collection;

import java.util.ArrayList;

public class Ex2Aula {

	public static void main(String[] args) {
		Aula a1 = new Aula("Laços", 40); //objeto a1 (aula1) e dentro dele tem Laços e 40min
		Aula a2 = new Aula("Herança", 50); //dentro tem (string e int)
		Aula a3 = new Aula("Vetores", 35);
		
		ArrayList<Aula> aulas = new ArrayList<>(); //Arraylist tipo Aula (sua classe)
		
		
		aulas.add(a1); //populou o Array com os objetos
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);

	}

}
