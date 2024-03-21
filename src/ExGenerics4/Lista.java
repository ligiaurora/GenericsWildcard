package ExGenerics4;

import java.util.ArrayList;

public class Lista<K,V> {
	private ArrayList<Valores<K, V>> mp;
	
	   public Lista() {
	        this.mp = new ArrayList<>();
	    }

	    public boolean adicionar(K chave, V valor) {
	        for (Valores<K, V> par : mp) {
	            if (par.obterChave().equals(chave)) {
	                return false;
	            }
	        }
	        mp.add(new Valores<>(chave, valor));
	        return true; 
	    }

	    public Valores<K, V> obter(K chave) {
	        for (Valores<K, V> par : mp) {
	            if (par.obterChave().equals(chave)) {
	                return par;
	            }
	        }
	        return null;
	    }
}
