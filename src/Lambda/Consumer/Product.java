package Lambda.Consumer;

public class Product {
	//observer que nao tem os metodos hash e equals definido
	private String nome;
	private double preco;
	
	public Product(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	//um jeito de fazer passando um produto. Precisa ter uma referencia pois a classe eh estatica
	public static void staticPriceUpdate(Product p) {
		p.setPreco(p.getPreco()*1.1);
	}
	
	//utiliza a propria instanciacao da classe e seus atritubos entao nao precisa do parametro
	public  void nonStaticPriceUpdate() {
		preco = preco*-1.1;
	}
	
	@Override
	public String toString() {
	return "Produto [nome=" + nome + ", preco=" + preco + "]";
	}
}
