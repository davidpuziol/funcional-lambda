package Lambda.Predicate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTeste {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.0));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.5));
		list.add(new Product("HD Case", 80.9));

		// Serao feitos 4 exemplos diferentes de como podemos fazer o Predicado
		
		// 1 EXEMPLO COM CLASSE IMPLEMENTADA COM A INTERFACE PREDICATE
		// Poderia ter sido ProductPredicate pred = new ProductPredicate(); e passar o
		// pred como parametro do removeif

		list.removeIf(new ProductPredicate());
		for (Product p : list) {
			System.out.println(p.toString());
		}

		System.out.println();list.add(new Product("Tablet", 350.5));list.add(new Product("TV", 900.0));

		// 2 EXEMPLO TESTE COM CLASSE ESTATICA
		list.removeIf(Product::staticProductPredicate);
		for (Product p : list) {
			System.out.println(p.toString());
		}

		System.out.println(); list.add(new Product("Tablet", 350.5));list.add(new Product("TV", 900.0));

		// 3 EXEMPLO TESTE COM CLASSE NAO ESTATICAL, VAI TRABALHAR COM O PROPRIO OBJETO E NAO COM PARAMETRO
		list.removeIf(Product::nonStaticProductPredicate);
		for (Product p : list) {
			System.out.println(p.toString());
		}
		
		System.out.println(); list.add(new Product("Tablet", 350.5));list.add(new Product("TV", 900.0));

		// 4 LAMBDA DECLARADA
		Predicate<Product> pred = p -> p.getPreco() >= 100;
		list.removeIf(pred);
		for (Product p : list) {
			System.out.println(p.toString());
		}
		
		System.out.println(); list.add(new Product("Tablet", 350.5));list.add(new Product("TV", 900.0));

		// 5 LAMBDA INLINE QUE É O QUE ESTA EM CIMA DIRETO NA PASSAGEM DE PARAMETROS
		list.removeIf(p -> p.getPreco() >= 100);
		for (Product p : list) {
			System.out.println(p.toString());
		}
	}
}