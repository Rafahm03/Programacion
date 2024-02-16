package ejemploset;

import java.util.HashSet;
import java.util.Set;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Set <String> lista = new HashSet <> (); 
		
		lista.add("Uno");
		lista.add("Dos");
		lista.add("Uno");
		lista.add("Tres");
		lista.add("Catorce");
		
		System.out.println(lista);
		
		lista.remove("Tres");
		
		System.out.println(lista);
		
		System.out.println(lista.contains("Uno"));*/
		
		Set<Persona> lista = new HashSet<>();
		
		lista.add(new Persona ("Rafa", 21, "123a"));
		lista.add(new Persona ("Pepe", 21, "123b"));
		lista.add(new Persona ("Paco", 46, "123c"));
		
		System.out.println(lista);
				
				
	}

}
