package listas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class InterfaceList {
	/*
	 * java.util.List = ordena��o de inser��o
	 * 
	 * m�todos = add, get, remove, size
	 * 
	 * List ArrayList = melhor para recupera��o de dados LinkedList = melhor para
	 * adi��o e remo��o de dados
	 * 
	 */

	public static void main(String[] args) {
		// ArrayList	= melhor na recupera��o de dados
		List<String> nomes = new ArrayList<>();
		nomes.add("eduardo");
		nomes.add("carla");
		nomes.add("luiz");
		nomes.add("adriana");

		System.out.println("ordena��o pela ordem de inser��o: " + nomes);
		
		System.out.println("***************************");
		
		// LinkedList  = melhor na adi��o e remo��o dos dados
		Collection<String> paises = new LinkedList<>();
		paises.add("russia");
		paises.add("china");
		paises.add("coreia");
		paises.add("brasil");
		
		System.out.println("ordena��o pela ordem de inser��o: " + paises);
	}
}
