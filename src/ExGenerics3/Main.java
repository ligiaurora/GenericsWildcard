package ExGenerics3;

public class Main {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	
        ProdutoX p1 = new ProdutoX("Galaxy S24", "Samsung", 50000);
        ProdutoX p2 = new ProdutoX("Fone de Ouvido", "JBL", 250);
   
        Pedido<ProdutoX> pedido = new Pedido<>();
        pedido.adicionarProduto(p1);
        pedido.adicionarProduto(p2);
        System.out.println("-----Lista Produtos-----");
        pedido.mostrarProdutos();
        System.out.println("------------------------");
    }

}