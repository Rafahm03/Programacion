package ejecicio02;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;


public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*2)
		 * Crear un programa para gestionar los socios de un Club de campo. Se debe
		 * poder guardar Socios con sus datos personales, buscarlos, mostrar sus datos,
		 * modificarlos y borrarlos (operaciones CRUD). Usar la clase ArrayList. Este
		 * ejercicio es para empezar, así que no es necesario hacer nada más, aunque se
		 * podrían agregar funcionalidades como alquilar pistas, pagar cuotas, etc.
		 * Debemos usar la clase Socio, la clase Club y la principal como mínimo. Puedes
		 * probar a separar "las operaciones CRUD" en una clase CRUDSocio de la clase
		 * Club.
		 */
		String nombre, dni;
		int op, id, edad;
		
		List <Socio> lista = new ArrayList<>();
		
		CrudSocio c = new CrudSocio(lista);
		
		Socio s= new Socio("Carlos", 1, "2345678g", 19);
		Socio s1= new Socio("Pepe", 2, "456789b", 20);
		Socio s2 = new Socio("Rafa", 3, "2345678f", 20);
		
		lista.add(s);
		lista.add(s1);
		lista.add(s2);
		
		Club c1 = new Club("Puteros fc", c);
		
		do {
			System.out.println(" ");
			System.out.println("MENU");
			System.out.println("1) Ver lista de socios");
			System.out.println("2) Añadir un nuevo socio");
			System.out.println("3) Borrar un socio");
			System.out.println("4) buscar un socio por dni");
			System.out.println(".........................");
			System.out.println("¿Qué opción elijes?");
			op=Leer.datoInt();
			System.out.println(" ");
			
			switch (op) {
			case 0:
				System.out.println("SALIENDO...");
				break;
			case 1:
				c.imprimirLista();
				break;
				
			case 2:
				System.out.println("Diga el nombre del socio");
				nombre=Leer.dato();
				System.out.println("Diga el id del socio (Distinto de 0, 1, 2 y 3)");
				id=Leer.datoInt();
				System.out.println("Diga el dni del socio");
				dni=Leer.dato();
				System.out.println("Diga la edad del socio");
				edad=Leer.datoInt();
				Socio s3=new Socio(nombre, id, dni, edad);
				c.agregarSocio(s3);
				c.imprimirLista();
				break;
				
			case 3:
				c.imprimirLista();
				System.out.println("Elija cual socio borrar, por su dni");
				dni=Leer.dato();
				c.borrar(dni);
				c.imprimirLista();
				break;
			case 4:
				System.out.println("Diga el dni del socio que quiere buscar");
				dni=Leer.dato();
				System.out.println(c.findByDniV2(dni));
				break;
			default:
				System.out.println("Opción no válida intentelo de nuevo");
				break;
			}
		} while (op!=0);

		System.out.println(" ");
		System.out.println("Gracias por usar el programa");
		System.out.println(" ");
	}

}
