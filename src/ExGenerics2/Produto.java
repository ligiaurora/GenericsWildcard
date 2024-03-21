package ExGenerics2;

import java.util.Date;

public class Produto<T> {
	public T id;
	public double valor;
	public Date dataFabricação;
	public Date dataVencimento;
	
	public Produto(T id, double valor, Date dataFabricação, Date dataVencimento) {
		super();
		this.id = id;
		this.valor = valor;
		this.dataFabricação = dataFabricação;
		this.dataVencimento = dataVencimento;
	}

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Date getDataFabricação() {
		return dataFabricação;
	}

	public void setDataFabricação(Date dataFabricação) {
		this.dataFabricação = dataFabricação;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
}
