package unicesumar.segundoBimestre;

public class Produto {
	private String nome;
	private double valorProduto;

	public Produto(String nome, double valorProduto) {
		super();
		this.nome = nome;
		this.valorProduto = valorProduto;
	}

	public String getNome() {
		return nome;
	}

	public double getValorProduto() {
		return valorProduto;
	}

}
