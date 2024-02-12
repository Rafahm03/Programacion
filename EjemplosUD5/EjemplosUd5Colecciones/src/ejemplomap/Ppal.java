package ejemplomap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map <String, String> mapa = new HashMap <String, String>();
		
		Map <Integer, Alumno> lista2=  new HashMap <>();
		
		Alumno a = new Alumno (1, "Carlos", 6.8);
		
		lista2.put(6, a);
		System.out.println(lista2);
		a.setNombre("Rafa"); 
		System.out.println(lista2);
		
		
		mapa.put("Uno","one");
		mapa.put("Dos", "second");
		mapa.put("tres","3rd");
		
		//Sobrescribe la asignación anterior porque no admite claves repetidas
		
		mapa.put("third","III");
		
		//Devuelve el conjunto de las claves y se guarda en set1
		
		Set <String>set1 = mapa.keySet();
		
		//Devuelve la vista Colletion de los valores y se guarda en collection
		
		Collection collection = mapa.values();
		
		//Devuelve el conjunto de las asignaciones (clave,valor)
		
		Set<Entry<String, String>>set2 = mapa.entrySet();
		
		System.out.println(set1 + "\n" + collection + "\n" + set2);


	}
	

}
