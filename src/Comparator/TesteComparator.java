package Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteComparator {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.0));
		list.add(new Product("Notebook", 1200.0));
		list.add(new Product("Tablet", 400.0));
		// Essa classe Product Usado nao implmenta mais o compareTo
		// O List.sort usa comparator e o Collections.sort usa comparable
		// A vantagem de usar o comparator eh que nao precisa mudar a logica de
		// comparacao dentro da classe Product em caso de manutencao
		// O comparator eh uma interface funcional, ou seja, apena 1 metodo que vc tem
		// que implementar

		// nesse primeiro caso vamos usar uma classe
		list.sort(new MyComparator());

		for (Product p : list) {
			System.out.println(p.toString());
		}

		System.out.println();
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// nesse segundo caso vamos usar uma classe anonima direto no codigo
		Comparator<Product> comp = new Comparator<Product>() {
			@Override
			public int compare(Product p1, Product p2) {
				return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
			}
		};

		list.sort(comp);

		for (Product p : list) {
			System.out.println(p.toString());
		}
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// Agora vamos trocar tudo por uma expressao lambda que eh uma funcao anonima
		// que eh muito menos verbosa que a
		// a declaracao da classe anonima dentro da funcao
		// Manda os parametros ao lado esquerdo e depois ->
		// e dentro de um bloco a implementacao da funcao
		// Nao precisa declarar o tipo, mas poderia ser (Product p1, Product p2)
		Comparator<Product> comp2 = (p1, p2) -> {
			return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
		};

		System.out.println();

		list.sort(comp2);

		for (Product p : list) {
			System.out.println(p.toString());
		}
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// Como so tem uma linha poderia tirar as chaves e o return 
		Comparator<Product> comp3 = (p1, p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());

		System.out.println();

		list.sort(comp3);

		for (Product p : list) {
			System.out.println(p.toString());
		}
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//Agora vamos tirar o comparator da declaracao e por direto no parametro do sort
		System.out.println();

		list.sort((p1, p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()));

		for (Product p : list) {
			System.out.println(p.toString());
		}
	}
}