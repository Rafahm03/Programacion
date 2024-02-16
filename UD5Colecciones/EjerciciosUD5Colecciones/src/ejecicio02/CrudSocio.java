package ejecicio02;

import java.util.List;

public class CrudSocio {

	private List <Socio> lista;

	public CrudSocio(List<Socio> lista) {
		super();
		this.lista = lista;
	}

	public List<Socio> getLista() {
		return lista;
	}			

	public void setLista(List<Socio> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "CrudSocio [lista=" + lista + "]";
	}
	
	public Socio findByDniV2(String dni) {
		Socio tem=null;
		boolean salir = false;
		
		for (int i=0; i<lista.size() && !salir; i++) {
			if(lista.get(i).getDni().equalsIgnoreCase(dni)) {
				tem = lista.get(i);
				salir = true;		
			}
		}
		return tem;
	}
	
	public void agregarSocio(Socio s) {
		lista.add(s);
	}
	
	//metodo imprimir
		public void imprimirLista() {
			for(Socio s: lista){
				System.out.println(s);
			}
		}
		
		//metodo borrar
		public void borrar(String dni) {
			if(findByDniV2(dni)!=null) {
				lista.remove(findByDniV2(dni));
			}
		}
	
}
