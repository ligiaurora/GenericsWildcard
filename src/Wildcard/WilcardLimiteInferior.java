package Wildcard;

import java.util.Arrays;
import java.util.List;

public class WilcardLimiteInferior {
    public static void main(String[] args)
    {
        
        List<Integer> lista1 = Arrays.asList(4, 5, 6, 7);
        impressãoLista(lista1);

        ////é uma superclasse de Integer
        List<Number> lista2 = Arrays.asList(8,9,10,11);
        impressãoLista(lista2);
    }

    ///Está usando parametro genericoE 
    public static void impressãoLista(
        List<? super Integer> lista)
    {
        System.out.println(lista);
    }
}

