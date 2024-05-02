package listaPart1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ColecoesParte1 {

	public static void main(String[] args) {
		listaDeNomes();

	}
	
	private static void listaDeNomes() {
		System.out.println("~~~~ LISTA DE NOMES ~~~~");
		List<String> nomes = new ArrayList<>();
		nomes.add("Adriana Aparecida");
		nomes.add("Pâmela Camargo");
		nomes.add("Wellington Amaral");
		nomes.add("Thamires Joana");
		nomes.add("Beatriz Camargo");
		nomes.add("Gustavo Uliana");
		nomes.add("Anahí Clementino");
		Collections.sort(nomes);
		System.out.println(nomes);
				
	}

}
