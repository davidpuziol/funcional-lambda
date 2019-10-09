package Lambda.ExemploParametro;

import java.util.ArrayList;
import java.util.List;

public class MainFunction {

	public static void main(String[] args) {

		List<Produto> list = new ArrayList<>();
		list.add(new Produto("TV", 900.0));
		list.add(new Produto("Mouse", 50.00));
		list.add(new Produto("Tablet", 350.5));
		list.add(new Produto("HD Case", 80.9));
		ProductService ps = new ProductService();
		//double sum = ps.filteredSum(list);  sera como deve ser chamado se nao tivesse o predicado
		double sum = ps.filteredSum(list, p -> p.getNome().charAt(0) == 'T');
		
		System.out.println("Soma eh = " + sum);
	}
}