package Wildcard;

import java.util.Arrays;
import java.util.List;

public class WilcardLimiteSuperior {
	// TODO Auto-generated method stub
    public static void main(String[] args){

      
        List<Integer> lista1 = Arrays.asList(4, 5, 6, 7);
        System.out.println("Valor total da soma:" + soma(lista1));
        List<Double> lista2 = Arrays.asList(4.1, 5.1, 6.1);
        System.out.print("Valor Subtração:" + sub(lista2));
    }

    private static double soma(List<? extends Number> lista){
        double soma = 0.0;
        for (Number i : lista) {
            soma += i.doubleValue();
        }
        return soma;
    }
    
    private static double sub(List<? extends Number> lista){
        double sub = 0.0;
        for (Number i : lista) {
            sub -= i.doubleValue();
        }
        return sub;
    }
}
