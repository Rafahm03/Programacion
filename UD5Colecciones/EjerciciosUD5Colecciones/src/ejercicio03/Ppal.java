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
		 
		int op=0;
		
		Set <Alumno> lista = new HashSet<>();
		
		Alumno a1 = new Alumno("Rafa", 21, "2345678g", "1ºDAM");
		Alumno a2 = new Alumno("Carlos", 20, "876543r", "1ºDAM");
		Alumno a3 = new Alumno("Pepe", 21, "6432664h", "1ºDAM");
		Alumno a4 = new Alumno("Messi", 36, "3456789l", "1º TELECO");
		
		lista.add(a1);
		lista.add(a2);
		lista.add(a3);
		lista.add(a4);
		
		CrudAlumno c = new CrudAlumno(lista);
		
		do {
			
			System.out.println("MENU");
			System.out.println("1) Imprimir lista de alumnos");
			System.out.println("1) Agregar nuevo alumno");
			System.out.println("3) Buscar im ");
		} while (op!=0);
		System.out.println("Gracias por usar el programa");
		
	}

}
