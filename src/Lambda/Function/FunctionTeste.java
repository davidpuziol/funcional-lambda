package Lambda.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionTeste {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.0));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.5));
		list.add(new Product("HD Case", 80.9));
		
		
		// Serao feitos 4 exemplos diferentes de como podemos fazer a Function

		// 1 EXEMPLO COM CLASSE IMPLEMENTADA COM A INTERFACE FUNCTION
		// Poderia ter sido FunctionUpperCaseName fucn = new FunctionUpperCaseName(); e
		// passar o fucn como parametro do map que eh executar essa funcao para cada instancia da lista
		
		
		//O map aplica a funcao na lista. Como o map so funciona para stream teve que converter a lista
		//para stream aplicar a funcao e depois converter o stream de volta para lista e guardar em uma lista para ter o resultado
		List<String> names = list.stream().map(new FunctionUpperCaseName()).collect(Collectors.toList());
		names.forEach(System.out::println);
		System.out.println();
		
		// 2 EXEMPLO TESTE COM CLASSE ESTATICA

		names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
		names.forEach(System.out::println);
		System.out.println();
		
		// 3 EXEMPLO TESTE COM CLASSE NAO STATIC

		names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
		names.forEach(System.out::println);
		System.out.println();
		
		// 4 EXEMPLO LAMBDA DECLARADA
		Function<Product, String> func = p -> p.getNome().toUpperCase();

		names = list.stream().map(func).collect(Collectors.toList());
		names.forEach(System.out::println);
		System.out.println();
		
		// 5 EXEMPLO LAMBDA INLINE DENTRO DO ARGUMENTO DA FUNCAO QUE EH O QUE DEVE SER UTILIZADO
		names = list.stream().map(p -> p.getNome().toUpperCase()).collect(Collectors.toList());
		names.forEach(System.out::println);
		System.out.println();
	}
}