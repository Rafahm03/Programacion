package ejercicio1;

import java.util.Iterator;
import java.util.List;

public class Secretaria {

	private List<Alumno> lista;

	public Secretaria(List<Alumno> lista) {
		super();
		this.lista = lista;
	}

	public List<Alumno> getLista() {
		return lista;
	}

	public void setLista(List<Alumno> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Secretaria [lista=" + lista + "]";
	}
	
	//Añadir alumnos
	public void add(Alumno a) {
		lista.add(a);
	}
	
	// Mostrar todos los alumnos imprimiéndolos con forEach ().
	
	public void mostrarAlumnosForEach(List<Alumno> lista) {
		lista.stream().forEach(System.out::println);
	}
	
	//Imprimir todos los alumnos cuyo nombre empiece con una letra determinada (puede ser leída por teclado)
	public void mostarAlumnosPorInicial(String letraInicial) {

		lista.stream().filter(alumno -> alumno.getNombre().startsWith(letraInicial)).forEach(System.out::println);
	}
	
	//Dar el tamaño de la lista usando count ()
	
	public long darTamanhiolista() {
		return lista.stream().count();
	}
	
	
	//Obtener los alumnos con nota media mayor de 9 en el curso 1DAM
	
	public List<Alumno> buscarAlumnosPorNotaMediaYCurso(String curso){
		
		return lista.stream().filter(alumno -> alumno.getNotaMedia()>9 && alumno.getCurso().equalsIgnoreCase(curso)).toList();
	}
	
	//  Imprimir los 3 primeros alumnos de la lista usando limit ().
	public List<Alumno> mostrarTresPrimerosAlumnos(){
		return lista.stream().limit(3).toList();
	}
	
	// Obtener el alumno de menor edad.
    public Alumno obtenerAlumnoMenorEdad() {
        return lista.stream()
                    .min((alumno1, alumno2) -> alumno1.getEdad() - alumno2.getEdad())
                    .orElse(null);
    }
	
	// Obtener el primer alumno de la lista con findFirst()
	public Alumno mostrarPrimerAlumno() {
		return lista.stream().findFirst().get();
	}
	
	// Obtener una nueva lista con los alumnos cuya longitud de la cadena de su nombre sea mayor a 10 letras.
	
	public List<Alumno> mostrarListaAlumnosConNombresLargos(){
		return lista.stream().filter(alumno -> alumno.getNombre().length()>10).toList();
	}
	
	//Obtener los alumnos que empiecen por la letra A y la longitud de su nombre sea menor o igual a 6.
	public List<Alumno> mostrarAlumnosPorInicialYLongitud(String a){
		return lista.stream().filter(alumno -> alumno.getNombre().startsWith(a) && alumno.getNombre().length()>6).toList();
	}

} 
