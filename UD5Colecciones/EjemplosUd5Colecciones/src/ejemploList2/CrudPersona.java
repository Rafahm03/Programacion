package ejemploList2;

import java.util.List;

public class CrudPersona {

	private List <Persona> lista;

	public CrudPersona(List<Persona> lista) {
		super();
		this.lista = lista;
	}

	public List<Persona> getLista() {
		return lista;
	}

	public void setLista(List<Persona> lista) {
		this.lista = lista;
	}
	
	//1ºcaso
	public Persona findByDni (String dni) {
		int i=0;
		boolean encontrado = false;
		while(i<lista.size() && !encontrado) {
			Persona deLista = lista.get(i);
			if(deLista.getDni().equalsIgnoreCase(dni))
				encontrado = true;
			else
				i++;
		}
		if(encontrado)
			return lista.get(i);
		else
			return null;
	}
	
	//2ºcaso
	public Persona findByDniV2(String dni) {
		Persona tem=null;
		boolean salir = false;
		
		for (int i=0; i<lista.size() && !salir; i++) {
			if(lista.get(i).getDni().equalsIgnoreCase(dni)) {
				tem = lista.get(i);
				salir = true;		
			}
		}
		return tem;
	}
	
	//metodo agregar
	
	public void agregarPersona(Persona p) {
		lista.add(p);
	}
	//nunca pasamos como parametros los atributos de una persona para agregarlos 
	
	//2ºmetodo agregar
	public boolean agregarPersonaV2(Persona p) {
		return lista.add(p);
	}
	//metodo imprimir
	public void imprimirLista() {
		for(Persona p: lista){
			System.out.println(p);
		}
	}
	
	//metodo borrar
	public void borrar(String dni) {
		if(findByDniV2(dni)!=null) {
			lista.remove(findByDniV2(dni));
		}
	}
	
}


