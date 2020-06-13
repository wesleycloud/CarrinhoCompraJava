package unicesumar.segundoBimestre;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	private int idCompra;
	private int totalValores = 0;
	private List<Carrinho> carrinhos = new ArrayList<>();

	public Compra(int idCompra) {
		super();
		this.idCompra = idCompra;
	}

	public int getIdCompra() {
		return idCompra;
	}

	public int getTotalValores() {
		return totalValores;
	}

	public List<Carrinho> getCarrinhos() {
		return carrinhos;
	}

	public void addCarrinho(Carrinho p) {
		carrinhos.add(p);
		totalValores += p.getValortotal();
	}
}
