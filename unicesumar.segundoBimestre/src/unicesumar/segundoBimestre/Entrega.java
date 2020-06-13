package unicesumar.segundoBimestre;

public class Entrega {
	private int idEntrega;
	private String DataPrevista;
	private Compra Compra;

	public Entrega(int idEntrega, String dataPrevista, unicesumar.segundoBimestre.Compra compra) {
		super();
		this.idEntrega = idEntrega;
		DataPrevista = dataPrevista;
		Compra = compra;
	}

	public int getIdEntrega() {
		return idEntrega;
	}

	public String getDataPrevista() {
		return DataPrevista;
	}

	public Compra getCompra() {
		return Compra;
	}

}
