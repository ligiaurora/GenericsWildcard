package ExGenerics3;

import java.util.ArrayList;
import java.util.List;

public class Pedido<T extends ProdutoX> {
	
	 private List<T> listaProdutos;

	    public Pedido() {
	        this.listaProdutos = new ArrayList<>();
	    }

	    public void adicionarProduto(T produto) {
	        listaProdutos.add(produto);
	    }

	    public void mostrarProdutos() {
	        for (T produto : listaProdutos) {
	            System.out.println(produto);
	        }
	 }
}
