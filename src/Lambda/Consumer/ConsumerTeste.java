package Lambda.Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTeste {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.0));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.5));
		list.add(new Product("HD Case", 80.9));

		// Serao feitos 4 exemplos diferentes de como podemos fazer o Consumer

		// 1 EXEMPLO COM CLASSE IMPLEMENTADA COM A INTERFACE CONSUMER
		// Poderia ter sido ConsumerPriceUpdate cpu = new ConsumerPriceUpdate(); e
		// passar o cpu como parametro do foreach que eh executar esse metodo para cada instancia da lista

		list.forEach(new ConsumerPriceUpdate());

		// Pode ser utilizando o proprio println que é um metodo static de System.out
		// para imprimir
		list.forEach(System.out::println);
		System.out.println();

		
		// 2 EXEMPLO TESTE COM CLASSE ESTATICA

		list.forEach(Product::staticPriceUpdate);
		list.forEach(System.out::println);
		System.out.println();
		
		// 3 EXEMPLO TESTE COM CLASSE NAO STATIC

		list.forEach(Product::nonStaticPriceUpdate);
		list.forEach(System.out::println);
		System.out.println();
		
		// 4 EXEMPLO LAMBDA DECLARADA
		Consumer<Product> cons = p -> p.setPreco(p.getPreco()*1.1);

		list.forEach(cons);
		list.forEach(System.out::println);
		System.out.println();
		
		// 5 EXEMPLO LAMBDA INLINE DENTRO DO ARGUMENTO DA FUNCAO QUE EH O QUE DEVE SER UTILIZADO
		list.forEach(p -> p.setPreco(p.getPreco()*1.1));
		list.forEach(System.out::println);
	}
}