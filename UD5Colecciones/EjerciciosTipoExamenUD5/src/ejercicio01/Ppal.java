package ejercicio01;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int op=0, id;
		String nombre, significado;
		
		List<Palabra> lista= new ArrayList<>();
		

		Palabra p1 = new Palabra(1, "Apple", "Manzana");
		Palabra p2 = new Palabra(2, "Tree", "Árbol");
		Palabra p3 = new Palabra(3, "Dog", "Perro");
		Palabra p4 = new Palabra(4, "AirPlane", "Avión");

		Diccionario d = new Diccionario(lista);

		d.add(p1);
		d.add(p2);
		d.add(p3);
		d.add(p4);
		
		do {
			System.out.println(" ");
			System.out.println("MENU");
			System.out.println("1) Imprimir palabaras de la lista");
			System.out.println("2) Buscar palabra por nombre");
			System.out.println("3) Añadir una nueva palabra a la lista");
			System.out.println("4) Modificar una palabra");
			System.out.println("5) Ordenar lista alfabeticamente");
			System.out.println("6) Borrar una palabra");
			System.out.println("0) SALIR");
			System.out.println("______________________________________");
			System.out.println("Elije una opción");
			op=Leer.datoInt();
			
			switch (op) {
			case 0:
				System.out.println("SALIENDO...");
				break;
			case 1:
				d.imprimirListaConIterator();
				break;
			case 2:
				System.out.println("Diga el nombre de la palabra que quiera buscar");
				nombre=Leer.dato();
				d.findByNombre(nombre);
				break;
			case 3:
				System.out.println("diga un id para la nueva palabra mayor que 4 menor que 10");
				id=Leer.datoInt();
				System.out.println("Diga el nombre de la palabra en ingles ");
				nombre=Leer.dato();
				System.out.println("Diga el significado o traduccion del mismo");
				significado=Leer.dato();
				Palabra p5 =new Palabra (id, nombre, significado);
				d.add(p5);
				break;
			case 4:
				System.out.println("Diga el nombre de la palabra a modificar");
				nombre=Leer.dato();	
				//d.modificar(nombre);
				break;
			case 5:
				break;
			case 6:
				break;
			default:
				break;
			}
		} while (op!=0);
	}

}
