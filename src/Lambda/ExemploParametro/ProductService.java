package Lambda.ExemploParametro;

import java.util.List;
import java.util.function.Predicate;

import Lambda.Predicate.Product;

public class ProductService {
	
	//Essa funcao seria a que a condicao do if nao eh recebida como parametro..  a debaixo eh a que foi recebida
	/*public double filteredSum(List<Produto> list) {
		double sum = 0.0;
		for (Produto p : list) {
			//esse if eh um predicado pois a resposta desse teste vai dar verdadeiro ou falso
			if(p.getNome().charAt(0) == 'T') {
				sum += p.getPreco();
			}
		}
		return sum;
	}*/
	public double filteredSum(List<Produto> list, Predicate<Produto> predicado) {
		double sum = 0.0;
		for (Produto p : list) {
			//o predicado no lugar do IF. Essa funcao vai funcionar de modo que o teste sera passado como parametro
			if(predicado.test(p)) {
				sum += p.getPreco();
			}
		}
		return sum;
	}
}