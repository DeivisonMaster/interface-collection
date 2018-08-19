package algoritmos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Ordenacao {
	/* Ordenação de dados */
	
	public static void main(String[] args) {
		List<String> nomes = new LinkedList<>();
		nomes.add("luiz");
		nomes.add("bruna");
		nomes.add("carla");
		nomes.add("romario");
		
		// sem ordenação
		System.out.println(nomes);
		
		// Ordenação crescente
		Collections.sort(nomes);
		System.out.println(nomes);
		
		// Ordenação decrescente
		Comparator<String> decrescente = Collections.reverseOrder();
		Collections.sort(nomes, decrescente);
		System.out.println(nomes);
	}
}




























