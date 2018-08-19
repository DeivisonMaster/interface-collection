package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class CollectionAPI {
	public static void main(String[] args) {
		/* Collection = Interface absoluta na hierarquia de cole��es. 
		 * 
		 * Implementa��es
		 * 
		 * Object
		 * 		Collection
		 * 			Set				= cole��o sem valores duplicados
		 * 				HashSet
		 * 				LinkedHashSet
		 * 				TreeSet
		 * 			List			= cole��o ordenada com valores duplicados
		 * 				ArrayList
		 * 				LinkedList
		 * 			Queue
		 * 				LinkedList
		 * 
		*/
		
		// declara��o do tipo
		Collection <String> nomes;
		
		// implementa��o
		nomes = new ArrayList<>();
		
		nomes.add("russia");
		nomes.add("china");
		nomes.add("usa");
		nomes.add("taiwan");
		
		System.out.println("dados: " + nomes);
		
		System.out.println("************************************************************");
		
		// isEmpty
		boolean verifica = nomes.isEmpty();
		System.out.println(verifica);
		
		// clear 
		//nomes.clear();
		System.out.println("dados: " + nomes);
		
		// remove
		nomes.remove("russia");
		System.out.println("dados: " + nomes);
		
		Collection<String> vogais = new ArrayList<>();
		vogais.add("A");
		vogais.add("b");
		vogais.add("C");
		
		boolean retorno = vogais.contains("B");
		System.out.println("verifica vogal " + retorno);
		
		// agrupando cole��es
		Collection<String> vogais2 = new ArrayList<>();
		vogais2.add("D");
		vogais2.add("E");
		
		vogais.addAll(vogais2);
		
		System.out.println(vogais);
		
		// foreach
		for(String caracteres : vogais) {
			System.out.println(caracteres);
		}
		
		
	}
}


























