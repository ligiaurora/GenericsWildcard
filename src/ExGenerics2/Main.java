package ExGenerics2;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("----------- Uso com Integer ----------- ");
		
		/////// Integer
        Produto<Integer> produto1 = new Produto<>(1001, 150, new Date(), new Date());
        System.out.println("Produto 1 - ID: " + produto1.getId() + ", Valor: " + produto1.getValor() +  ", Data de Fabricação: " + produto1. getDataFabricação() +  ", Data de Vencimento: " + produto1.getDataVencimento());

        System.out.println("----------- Uso com String ----------- ");
        
        /////// String
        Produto<String> produto2 = new Produto<>("ABC123", 125, new Date(), new Date());
        System.out.println("Produto 2 - ID: " + produto2.getId() + ", Valor: " + produto2.getValor() + ", Data de Fabricação: " + produto2. getDataFabricação() + ", Data de Vencimento: " + produto2.getDataVencimento());
	}

}
