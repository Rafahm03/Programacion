package ejercicio;

import java.util.Comparator;

public class CompararPorPrecio implements Comparator<Trastero>{

	@Override
	public int compare(Trastero o1, Trastero o2) {
		double precio = o1.getPrecio();
		double precio2 = o2.getPrecio();
		
		if (precio < precio2) {
			return -1;
		}else {
			if (precio > precio2) {
				return 1;
			}else {
				return 0;
			}
	}
	}
}
