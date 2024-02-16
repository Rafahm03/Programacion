package ejercicio03;

public class Alumno {

	private String nombre;
	private int edad;
	private String dni;
	private String curso;
	public Alumno(String nombre, int edad, String dni, String curso) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.curso = curso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", curso=" + curso + "]";
	}
	
	
	
}
