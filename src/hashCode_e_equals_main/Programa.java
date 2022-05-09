package hashCode_e_equals_main;

import hashCode_e_equals_entidades.Cliente;

public class Programa {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Adriano", "adriano@gmail.com");
		Cliente c2 = new Cliente("Adriano", "adriano.abreu@gmail.com");
		Cliente c3 = new Cliente("Adriano", "adriano.abreu@gmail.com");
		
		System.out.println("c1.hashCode(): " + c1.hashCode());
		System.out.println("c2.hashCode(): " + c2.hashCode());
		System.out.println("c3.hashCode(): " + c3.hashCode());
		System.out.println("c1.equals(c2): " + c1.equals(c2)); // false
		System.out.println("c2.equals(c3): " + c2.equals(c3)); // true. O m�todo .equals() compara conte�dos.
		System.out.println("c1 == c2:      " + (c1 == c2));    // false. A compara��o '==' compara objetos.
		System.out.println("c2 == c3:      " + (c2 == c3));    // false
		
		String s1 = "Teste";
		String s2 = "Teste";
		
		// true. O resultado � true por que h� um tratamento especial para valores literais.
		System.out.println("s1 == s2:      " + (s1 == s2)); 
		
		String s3 = new String("Teste");
		String s4 = new String("Teste");
		
		// false. O resultado � false por que h� instancia da classe String, gerando um novo objeto na mem�ria. Diferentemente do teste acima com valores literais.
		System.out.println("s3 == s4:      " + (s3 == s4)); 
	}

}
