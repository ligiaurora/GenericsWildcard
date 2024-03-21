package ExGenerics1;

public class Main {
	public static void main (String[] args) {
		
		//Utilização como String e Integer
		MinhaClasseGenerics<String> g = new MinhaClasseGenerics<>("texto qualquer");
		MinhaClasseGenerics<Integer> i = new MinhaClasseGenerics<>(50);
		
		System.out.println("Uso do Generics com Valores String e Integer");
		System.out.println( g.getValor() + "," + i.getValor());
		
		System.out.println("--------------------------");
		
		/////Utilização como objeto
		
		ClasseEx pessoa = new ClasseEx("Hotaru Tomoe", 16);
		MinhaClasseGenerics<ClasseEx> exP = new MinhaClasseGenerics<>(pessoa);
		ClasseEx ex = exP.add();
		System.out.println("Uso do Generics em Objeto");
		System.out.println("Pessoa: " + ex.getNome() + "," + ex.getIdade());
		
		
		
		
		
		
		
	}

}
