package ejercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//si toca una collecion tipo hash(set o map), sera equals y hashcode, si es un list no se usará 
		
		List<Trastero> lista = new ArrayList<>();
		
		Trastero t = new Trastero(15.0, "a", 1, 100.0, false);
		Trastero t1 = new Trastero(15.0, "a", 2, 1000.0, true);
		Trastero t2 = new Trastero(15.0, "a", 3, 1005.0, false);
		Trastero t3 = new Trastero(15.0, "a", 4, 1001.0, true);
		
		Oficina o = new Oficina(lista);
		
		o.agregar(t);
		o.agregar(t1);
		o.agregar(t2);
		o.agregar(t3);
		
		System.out.println("Imprimir todos");
		o.imprimir();
		
		System.out.println("");
		
		System.out.println("Imrpimir por precio");
		Collections.sort(lista, new CompararPorPrecio());
		for (Trastero trastero : lista) {
			System.out.println(trastero);
		}
		
		System.out.println("");
		
		System.out.println("Buscar el mas caro");
		System.out.println(o.encontrarTrasteroMasCaro());

	}

}
