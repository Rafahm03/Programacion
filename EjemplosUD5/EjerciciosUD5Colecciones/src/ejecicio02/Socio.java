
package ejecicio02;

public class Socio {

	private String nombre;
	private int idSocio;
	private String dni;
	private int edad;
	
	public Socio(String nombre, int idSocio, String dni, int edad) {
		super();
		this.nombre = nombre;
		this.idSocio = idSocio;
		this.dni = dni;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdSocio() {
		return idSocio;
	}

	public void setIdSocio(int idSocio) {
		this.idSocio = idSocio;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Socio [nombre=" + nombre + ", idSocio=" + idSocio + ", dni=" + dni + ", edad=" + edad + "]";
	}
	
	
	
}
