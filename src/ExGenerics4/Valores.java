package ExGenerics4;

public class Valores<K, V> {
	 private K chave;
	 private V valor;

	 public Valores(K chave, V valor) {
		 this.chave = chave;
	     this.valor = valor;
	}
	 
	 public K obterChave() {
	        return chave;
	 }

	 public V obterValor() {
	        return valor;
	 }

	public K getChave() {
		return chave;
	}

	public void setChave(K chave) {
		this.chave = chave;
	}

	public V getValor() {
		return valor;
	}

	public void setValor(V valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Valores [chave=");
		builder.append(chave);
		builder.append(", valor=");
		builder.append(valor);
		builder.append("]");
		return builder.toString();
	} 	 	  
}
