package unicesumar.segundoBimestre;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nome;
	private String cpf;
	private String endereco;
	private List<Carrinho> carrinhos = new ArrayList<Carrinho>();

	public Cliente(String nome, String cpf, String endereco) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public List<Carrinho> getCarrinhos() {
		return carrinhos;
	}

	public void addCarrinho(Carrinho c) {
		carrinhos.add(c);
	}
}
