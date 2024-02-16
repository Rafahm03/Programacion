package ejecicio02;

public class Club {

	private String nombre;
	private CrudSocio c;
	
	public Club(String nombre, CrudSocio c) {
		super();
		this.nombre = nombre;
		this.c = c;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public CrudSocio getC() {
		return c;
	}

	public void setC(CrudSocio c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Club [nombre=" + nombre + ", c=" + c + "]";
	}
	
	
	
}
