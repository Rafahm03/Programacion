package ejemplocomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Corredor> corredores = new ArrayList<>();
		
		corredores.add(new Corredor(4, 0.93, "Pepe"));
		corredores.add(new Corredor(32, 1.01, "Lucas"));
		corredores.add(new Corredor(1, 4.43, "Emilio"));
		corredores.add(new Corredor(10, 2.13, "Juan"));
		corredores.add(new Corredor(7, 1.03, "Paco"));
		corredores.add(new Corredor(25, 2.43, "David"));
		
		
		for(Corredor corredor : corredores) {
			System.out.println(corredor);
		}
		
		Collections.sort(corredores);
		System.out.println();
		for(Corredor corredor : corredores) {
			System.out.println(corredor);
		}
		
		Collections.sort(corredores, new CompararPorMarca());
		System.out.println();
		for(Corredor corredor : corredores) {
			System.out.println(corredor);
		}
		
		Collections.sort(corredores, new CompararPorNombre());
		System.out.println();
		for(Corredor corredor : corredores) {
			System.out.println(corredor);
		}
		
		
		
	}

}
