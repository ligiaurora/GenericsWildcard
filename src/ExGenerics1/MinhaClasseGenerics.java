package ExGenerics1;

public class MinhaClasseGenerics <T>{
	private T valor;
	
	
	public MinhaClasseGenerics (T valor) {
		this.valor = valor;
	}
	
	public T add() {
		return valor;
	}
	
	public T getValor() {
		return valor;
	}

	public void setValue(T valor) {
		this.valor = valor;
	}	
}
