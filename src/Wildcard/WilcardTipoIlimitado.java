package Wildcard;
import java.util.Arrays;
import java.util.List;

public class WilcardTipoIlimitado {
	
	 private static void imprimeLista(List<?> lista)
	    {
	        System.out.println(lista);
	    }
	    
	    public static void main(String[] args){
	    	// TODO Auto-generated method stub
	    	/////Vai aceitar listas de qualquer tipo sem especificação
	        List<Integer> lista1 = Arrays.asList(1, 2, 3);
	        List<Double> lista2 = Arrays.asList(1.1, 2.2, 3.3);
	        List<String> lista3 = Arrays.asList("aaa","bbb","ccc");
	      
	        imprimeLista(lista1);
	        imprimeLista(lista2);
	        imprimeLista(lista3);
	    }
}
