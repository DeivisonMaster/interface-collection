package conjuntos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Conjuntos {
	/*
	 * Conjuntos = coleções onde não há repetição de dados, caso haja igualdade
	 * considerando o método equals, apenas um dado será incluido no conjunto.
	 * 
	 * Set HashSet LinkedHashSet TreeSet
	 * 
	 */

	public static void main(String[] args) {
		// HashSet = sem garantia de ordem de exibição

		Set<String> nomes = new HashSet<>();
		nomes.add("eduardo");
		nomes.add("luiz");
		nomes.add("katia");
		nomes.add("bruna");

		System.out.println("dados : " + nomes);

		System.out.println("**************************************");

		// LinkedHashSet = garantia de ordem de inserção
		Set<String> paises = new LinkedHashSet<>();
		paises.add("eduardo");
		paises.add("luiz");
		paises.add("katia");
		paises.add("bruna");

		System.out.println("dados : " + paises);

		System.out.println("**************************************");

		// TreeSet = garantia de ordem alfabetica
		Set<String> cores = new TreeSet<>();
		cores.add("verde");
		cores.add("amarelo");
		cores.add("cinza");
		cores.add("laranja");

		System.out.println("dados : " + cores);
	}

}
