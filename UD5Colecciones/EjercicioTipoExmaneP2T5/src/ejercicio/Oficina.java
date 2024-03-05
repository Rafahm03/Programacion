package ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Oficina {

	private List <Trastero> listaT;

	public Oficina(List<Trastero> listaT) {
		super();
		this.listaT = listaT;
	}

	public List<Trastero> getListaT() {
		return listaT;
	}

	public void setListaT(List<Trastero> listaT) {
		this.listaT = listaT;
	}

	@Override
	public String toString() {
		return "Oficina [listaT=" + listaT + "]";
	}
	
	public void agregar(Trastero t) {
		listaT.add(t);
	}
	
	public void imprimir() {
		for (Trastero trastero : listaT) {
			System.out.println(trastero);
		}
	}
	
	public List<Trastero> findByPrecio(Double precio){
		List <Trastero> auxiliar = new ArrayList<>();
		for (Trastero trastero : auxiliar) {
			if (trastero.getPrecio()==precio) {
				auxiliar.add(trastero);
			}
		}
		return auxiliar;
	}
	
	public Trastero findByNumero(int numero) {
		int i = 0;
		boolean encontrado = false;
		
		while (i < listaT.size() && !encontrado) {
			Trastero deLista = listaT.get(i);
			if (deLista.getNumTrastero()==numero) {
				encontrado = true;
			}else {
				i++;
			}
		}
		
		if (encontrado) {
			return listaT.get(i);
		}else {
			return null;
		}
	}
	
	public int findByNumeroV2(int numero) {
		int i = 0;
		boolean encontrado = false;
		
		while (i < listaT.size() && !encontrado) {
			Trastero deLista = listaT.get(i);
			if (deLista.getNumTrastero()==numero) {
				encontrado = true;
			}else {
				i++;
			}
		}
		
		if (encontrado) {
			return 1;
		}else {
			return -1;
		}
	}
	
	public Trastero encontrarTrasteroMasCaro() {
	    Trastero trasteroMasCaro = listaT.get(0); 
	    double precioMaximo = trasteroMasCaro.getPrecio(); 

	    for (Trastero trastero : listaT) {
	    	 double precioActual = trastero.getPrecio();
	    	 if (precioActual > precioMaximo) {
		            precioMaximo = precioActual;
		            trasteroMasCaro = trastero;
		       }
		}

	    return trasteroMasCaro;
	}
	
	public void eliminar(int numero) {
		listaT.remove(findByNumero(numero));
	}
	
	public void modificar(int numero, double nuevoPrecio) {
		findByNumero(numero).setPrecio(nuevoPrecio);
	}
	
	public void imprimirNoOcupados() {
		for (Trastero trastero : listaT) {
			if (trastero.isOcupado()==false) {
				System.out.println(trastero);
			}
		}
	}
}
