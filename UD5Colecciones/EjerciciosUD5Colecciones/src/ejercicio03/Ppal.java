package ejercicio03;

import java.util.HashSet;
import java.util.Set;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Realizar un programa que guarde Alumnos de una clase. Se deben poder mostrar,
		 * modificar y borrar los que se quiera de forma individual, es decir, el
		 * usuario debe decir quién quiere mostrar, modificar o borrar. Se puede crear
		 * otra clase con funcionalidades como sacar nota media del curso, dar el número
		 * de suspensos en total, media de suspensos, etc. Usa la interfaz Set
		 * implementada por HashSet.
		 */
		 
		Set <Alumno> lista = new HashSet<>();
		
		lista.add(new Alumno("Rafa", 21, "2345678g", "1ºDAM"));
		lista.add(new Alumno("Carlos", 20, "876543r", "1ºDAM"));
		lista.add(new Alumno("Pepe", 21, "6432664h", "1ºDAM"));
		lista.add(new Alumno("Messi", 36, "3456789l", "1º TELECO"));
		
		
	}

}
