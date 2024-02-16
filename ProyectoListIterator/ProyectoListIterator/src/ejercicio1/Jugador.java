package ejercicio1;

public class Jugador {

	//Atributos
	private String nombre;
	private int dorsal;
	private int edad;
	private String equipoActual;
	private String dni;
	
	public Jugador(String nombre, int dorsal, int edad, String equipoActual, String dni) {
		super();
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.edad = edad;
		this.equipoActual = equipoActual;
		this.dni = dni;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getEquipoActual() {
		return equipoActual;
	}
	public void setEquipoActual(String equipoActual) {
		this.equipoActual = equipoActual;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}


	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", dorsal=" + dorsal + ", edad=" + edad + ", equipoActual=" + equipoActual
				+ ", dni=" + dni + "]";
	}
	
	
	
	
	
	
	
	

	
	
	
}
