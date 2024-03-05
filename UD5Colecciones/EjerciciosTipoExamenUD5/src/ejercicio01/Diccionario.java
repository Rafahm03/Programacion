package ejercicio01;

import java.util.Iterator;
import java.util.List;

public class Diccionario {

	private List<Palabra> lista;

	public Diccionario(List<Palabra> lista) {
		super();
		this.lista = lista;
	}

	public List<Palabra> getLista() {
		return lista;
	}

	public void setLista(List<Palabra> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Diccionario [lista=" + lista + "]";
	}
	
	
	public void imprimirListaSinIterator() {
		for(Palabra p: lista){
			System.out.println(p);
		}
	}
	
	//metodo imprimir con iterator
	public void imprimirListaConIterator() {
		Iterator <Palabra> it= lista.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}
	
	//buscar palabra por nombre
	public Palabra findByNombre (String nombre) {
		int i=0;
		boolean encontrado = false;
		while(i<lista.size() && !encontrado) {
			Palabra deLista = lista.get(i);
			if(deLista.getNombre().equalsIgnoreCase(nombre))
				encontrado = true;
			else
				i++;
		}
		if(encontrado)
			return lista.get(i);
		else
			return null;
	}
	
	
	//buscar palabra devolviendo un int
	public int findByNombreV2(String nombre) {
		int i=0;
		boolean encontrado = false;
		while(i<lista.size() && !encontrado) {
			Palabra deLista = lista.get(i);
			if(deLista.getNombre().equalsIgnoreCase(nombre))
				encontrado = true;
			else
				i++;
		}
		if(encontrado)
			return i;
		else {
			return -1;
		}
	}
	
	//método añadir
	public void add(Palabra p) {
		lista.add(p);
	}
	
	//método borrar
	public void borrar(String nombre) {
		if(findByNombre(nombre)!=null) {
			lista.remove(findByNombre(nombre));
		}
	}
	
	//método modificar

	public void modificar() {
		
	}
	
}
