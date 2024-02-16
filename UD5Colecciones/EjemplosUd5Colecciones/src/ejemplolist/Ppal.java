package ejemplolist;

import java.util.ArrayList;
import java.util.List;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List <String> lista = new ArrayList<>();
		lista.add("Rafa");
		lista.add("Pepe");
		System.out.println(lista.contains("Rafa"));//te devuelve en boolean de si esta o no este elemento en la coleccion

		System.out.println(lista);

		System.out.println(lista.size());
		
		lista.remove(0);
		
		System.out.println(lista);
	}

}
