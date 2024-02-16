package ejemplocomparator;

import java.util.Comparator;

public class CompararPorMarca implements  Comparator <Corredor>{

	@Override
	public int compare(Corredor c1, Corredor c2) {
		double marcac1 = c1.getMarca();
		double marcac2 = c2.getMarca();                                                                                                                                                                                                                                                 
		
		if(marcac1 < marcac2 ) {
			return -1;
			
		}else {
			if(marcac1 > marcac2) {
				return 1;
			}
			return 0;
		}
	}
				
}
