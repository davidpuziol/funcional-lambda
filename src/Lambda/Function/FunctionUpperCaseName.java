package Lambda.Function;

import java.util.function.Function;
//Vai receber um Product e retorna uma String 
public class FunctionUpperCaseName implements Function<Product, String> {

	@Override
	public String apply(Product p) {
		return p.getNome().toUpperCase();
	}
}