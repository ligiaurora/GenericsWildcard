package ExGenerics4;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        Lista<String, Integer> listaPersonalizada = new Lista<>();

        System.out.println(listaPersonalizada.adicionar("chave1", 666)); 
        System.out.println(listaPersonalizada.adicionar("chave0", 555)); 

        Valores<String, Integer> parChaveValor = listaPersonalizada.obter("chave1");
        
        if (parChaveValor != null) {
            System.out.println("Chave: " + parChaveValor.obterChave() + parChaveValor.obterValor());
        } else {
            System.out.println("Chave não encontrada");
        }

        parChaveValor = listaPersonalizada.obter("chave2");
        
        if (parChaveValor != null) {
            System.out.println("Chave: " + parChaveValor.obterChave() + parChaveValor.obterValor());
        } else {
            System.out.println("Chave não encontrada");
        }
	}
}