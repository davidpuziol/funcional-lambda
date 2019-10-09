package Comparator;

import java.util.Comparator;

public class MyComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		//0 para numero iguais
		//negativo para o p1 < que p2
		//positivo para p1 > p2
		return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
	}

}
