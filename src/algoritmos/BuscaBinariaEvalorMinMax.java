package algoritmos;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

public class BuscaBinariaEvalorMinMax {
	
	public static void main(String[] args) {
		/* Descobrindo valor minimo */
		List<Integer> numeros = new LinkedList<>();
		numeros.add(new Integer(10));
		numeros.add(new Integer(3));
		numeros.add(new Integer(1));
		numeros.add(new Integer(-3));
		
		Integer min = Collections.min(numeros);
		System.out.println("valor minimo " + min);
		
		Integer max = Collections.max(numeros);
		System.out.println("valor maximo " + max);
		
		
		System.out.println("******************************************");
		
		/* Busca Binária */
		List<String> nomes = new LinkedList<>();
		nomes.add("bruna");
		nomes.add("roger");
		nomes.add("carla");
		nomes.add("kaio");
		
		String info = JOptionPane.showInputDialog("digite o nome a ser procurado: " );
		int indice = Collections.binarySearch(nomes, info);
		System.out.println(" o item buscado esta na posição: " + indice);
	}
}
