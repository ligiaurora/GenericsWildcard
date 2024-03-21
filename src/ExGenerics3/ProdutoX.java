package ExGenerics3;

class ProdutoX {
    private String nome;
    private String marca;
    private double preco;
    
    public ProdutoX(String nome, String marca, double preco) {
		this.nome = nome;
		this.marca = marca;
		this.preco = preco;
	}
     
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProdutoX [nome=");
		builder.append(nome);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", preco=");
		builder.append(preco);
		builder.append("]");
		return builder.toString();
	}
	
	
	   
}
