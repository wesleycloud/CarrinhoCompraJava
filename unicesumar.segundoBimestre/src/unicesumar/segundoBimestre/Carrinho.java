package unicesumar.segundoBimestre;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private int idCarrinho;
	private List<Produto> produtos = new ArrayList<>();
	private double valortotal = 0;
	private Cliente cliente;

	public Carrinho(int idCarrinho, Cliente cliente) {
		super();
		this.idCarrinho = idCarrinho;
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public int getIdCarrinho() {
		return idCarrinho;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public double getValortotal() {
		return valortotal;
	}

	public void addProduto(Produto p) {
		produtos.add(p);
		valortotal += p.getValorProduto();

	}
}
