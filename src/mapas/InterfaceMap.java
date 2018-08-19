package mapas;

import java.util.HashMap;
import java.util.Map;

public class InterfaceMap {
	/* Coleções relacionadas a chaves com valores
	 * 
	 *  Map
	 *  	HashMap
	 *  	TreeMap
	 *  	LinkedHashMap
 	 * 
	 * */
	public static void main(String[] args) {
		Map<Integer, String> nomes = new HashMap<>();
		
		nomes.put(0, "carla");
		nomes.put(3, "marcia");
		nomes.put(1, "rogerio");
		nomes.put(2, "adriana");
		
		for(String dados : nomes.values()) {
			System.out.println("dados: " + dados);
		}
	}
}
























