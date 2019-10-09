package Lambda.Consumer;

import java.util.function.Consumer;


public class ConsumerPriceUpdate implements Consumer<Product>{

	@Override
	public void accept(Product p) {
		//Vai aumentar o preco em 10%
		p.setPreco(p.getPreco()*1.1);
	}
}