package Lambda.Predicate;

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
	public static boolean staticProductPredicate(Product p) {
		return p.getPreco() >= 100;
	}
	
	//utiliza a propria instanciacao da classe e seus atritubos entao nao precisa do parametro
	public  boolean nonStaticProductPredicate() {
		return this.preco >= 100;
	}
	
	
	
	@Override
	public String toString() {
	return "Produto [nome=" + nome + ", preco=" + preco + "]";
	}
}
