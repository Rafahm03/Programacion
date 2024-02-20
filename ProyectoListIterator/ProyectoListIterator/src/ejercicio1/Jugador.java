package ejercicio1;

public class Jugador {

	//Atributos
	private String nombre;
    private String dni;
    private int dorsal;
    private int edad;
    private double salarioBase;
    
    public Jugador(String nombre, String dni, int dorsal, int edad, double salarioBase) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.dorsal = dorsal;
		this.edad = edad;
		this.salarioBase = salarioBase;
	}

	// Otros métodos, por ejemplo, método para calcular salario con bonificaciones
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
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

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	
	
	
	
	
	
	
	

	
	
	
}
