package unicesumar.segundoBimestre;

public class App {
	public static void main(String[] args) {
		Cliente wesley = new Cliente("Wesley Rezende", "23658442155", "Av Maranhao Centro");
		Carrinho carrinho1 = new Carrinho(1, wesley);
		Produto mouse = new Produto("Mouse", 100.00);
		Produto teclado = new Produto("Teclado", 200.00);
		carrinho1.addProduto(mouse);
		carrinho1.addProduto(teclado);
		Compra compra = new Compra(1);
		compra.addCarrinho(carrinho1);
	}

}
