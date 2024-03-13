package ejercicio1;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op=0;
		String letraInicial, curso="1DAM";
		
		List<Alumno> lista = new ArrayList<>();
		Alumno a = new Alumno("Eustaquio", "Martinez Santos", "1DAM", 5, 17);
		Alumno a2 = new Alumno("Pepito", "Hernandez gonzalez", "1DAW", 2.5, 21);
		Alumno a3 = new Alumno("Alejandro", "Jimenez", "1COMERCIO", 6.5, 19);
		Alumno a4 = new Alumno("Fran", "De la rosa ", "2DAM", 7, 27);
		Alumno a5 = new Alumno("Paco", "Gutierrez Hermoso", "2DAW", 9, 22);
		Alumno a6 = new Alumno("Juan", "Campos Martinez", "1TELECO", 10, 18);
		Alumno a7 = new Alumno("Alberto", "Rebollo Jimenez", "1DAM", 15, 20);
		
		Secretaria s = new Secretaria (lista);
		
		s.add(a);
		s.add(a2);
		s.add(a3);
		s.add(a4);
		s.add(a5);
		s.add(a6);
		s.add(a7);
		
		do {
			System.out.println(" ");
			System.out.println("MENU");
			System.out.println("__________________________________________________________________________________________________________");
			System.out.println("1) Obtener todos los alumnos de la lista usando filter. ");
			System.out.println("2) Mostrar todos los alumnos imprimiéndolos con forEach ().");
			System.out.println("3) Imprimir todos los alumnos cuyo nombre empiece con una letra determinada (puede ser leída por teclado).");
			System.out.println("4) Dar el tamaño de la lista usando count ().");
			System.out.println("5) Obtener los alumnos con nota media mayor de 9 en el curso 1DAM.");
			System.out.println("6) Imprimir los 3 primeros alumnos de la lista usando limit ().");
			System.out.println("7) Obtener el alumno de menor edad.");
			System.out.println("8) Obtener el primer alumno de la lista con findFirst()");
			System.out.println("9) Obtener una nueva lista con los alumnos cuya longitud de la cadena de su nombre sea mayor a 10 letras");
			System.out.println("10) Obtener los alumnos que empiecen por la letra A y la longitud de su nombre sea menor o igual a 6.");
			System.out.println("__________________________________________________________________________________________________________");
			System.out.println("Diga una opción");
			op=Leer.datoInt();
			
			switch (op) {
			case 0:
				System.out.println("SALIENDO...");
				break;
			case 1:
				
				break;
			case 2:
				s.mostrarAlumnosForEach(lista);
				break;
			case 3:
				System.out.println("Diga la inicial de los alumnos a buscar");
				letraInicial=Leer.dato();
				s.mostarAlumnosPorInicial(letraInicial);
				break;
			case 4: 
				System.out.println(s.darTamanhiolista());
				break;
			case 5:
				System.out.println(s.buscarAlumnosPorNotaMediaYCurso(curso));
				break;
			case 6:
				System.out.println(s.mostrarTresPrimerosAlumnos());
				break;
			case 7:
				
				break;
			case 8:
				System.out.println(s.mostrarPrimerAlumno());
				break;
			case 9:
				System.out.println(s.mostrarListaAlumnosConNombresLargos());
				break;
			case 10:
				letraInicial = "a";
				System.out.println(s.mostrarAlumnosPorInicialYLongitud(letraInicial));
				break;

			default:
				System.out.println("Opción no válida");
				break;
			}
		} while (op!=0);
		
		System.out.println("GRACIAS POR USAR EL PROGRAMA");
	}

}
