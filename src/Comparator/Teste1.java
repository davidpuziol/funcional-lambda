package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teste1 {

	public static void main(String[] args) {
		

		List<Produto> list = new ArrayList<>();
		list.add(new Produto("TV", 900.0));
		list.add(new Produto("Notebook", 1200.0));
		list.add(new Produto("Tablet", 400.0));
		
		Collections.sort(list);		
		//Vai imprimir ordenado pq a lista ordenou usando o compareTo
		//se a regra de comparacao mudar vai mudar ter que mudar la na classe
		for (Produto p : list) {
		System.out.println(p.toString());
		}
	}
}