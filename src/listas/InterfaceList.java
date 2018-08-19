package listas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class InterfaceList {
	/*
	 * java.util.List = ordenação de inserção
	 * 
	 * métodos = add, get, remove, size
	 * 
	 * List ArrayList = melhor para recuperação de dados LinkedList = melhor para
	 * adição e remoção de dados
	 * 
	 */

	public static void main(String[] args) {
		// ArrayList	= melhor na recuperação de dados
		List<String> nomes = new ArrayList<>();
		nomes.add("eduardo");
		nomes.add("carla");
		nomes.add("luiz");
		nomes.add("adriana");

		System.out.println("ordenação pela ordem de inserção: " + nomes);
		
		System.out.println("***************************");
		
		// LinkedList  = melhor na adição e remoção dos dados
		Collection<String> paises = new LinkedList<>();
		paises.add("russia");
		paises.add("china");
		paises.add("coreia");
		paises.add("brasil");
		
		System.out.println("ordenação pela ordem de inserção: " + paises);
	}
}
