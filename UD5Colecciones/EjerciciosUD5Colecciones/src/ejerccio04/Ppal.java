package ejerccio04;

import java.util.HashMap;
import java.util.Map;
import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Realizar, usando la clase HashMap, una agenda de teléfonos (un Contacto como
		 * clave y el número de teléfono como valor). Crear aquellos métodos que se
		 * utilizan normalmente en una agenda, como agregar, borrar, mostrar, buscar por
		 * algún criterio (por ejemplo, por nombre), modificar algún dato, etc. Y un
		 * main para probar todo.
		 */

		int op = 0, id=0;
		String nombre, telefono;

		Map<String, Contacto> lista = new HashMap();

		Contacto c1 = new Contacto("Rafa", "2345678", 1);
		Contacto c2 = new Contacto("Carlos", "876543", 2);
		Contacto c3 = new Contacto("Pepe", "6432664", 3);
		Contacto c4 = new Contacto("Messi", "3456789", 4);

		AgendaTelefonica at = new AgendaTelefonica(lista);

		at.add(c1, "2345678");
		at.add(c2, "876543");
		at.add(c3, "6432664");
		at.add(c4, "3456789");

		do {
			System.out.println(" ");
			System.out.println("MENU");
			System.out.println("_______________________________________________");
			System.out.println("1) Imprimir lista de Contactos");
			System.out.println("1) Agregar nuevo Contacto");
			System.out.println("3) Buscar un contacto por su número de teléfono");
			System.out.println("4) Eliminar un contacto");
			System.out.println("0)  SALIR");
			System.out.println("_______________________________________________");
			System.out.println("Elija una opción: ");
			op = Leer.datoInt();

			switch (op) {
				case 0:
					System.out.println("SALIENDO...");
					break;
				case 1:
					at.toString();
					break;
				case 2:
					System.out.println("Diga el nombre del nuevo contacto");
					nombre=Leer.dato();
					System.out.println("Ahora su número de Teléfono");
					telefono=Leer.dato();
					System.out.println("Y el id, (Válidos solo numeros del 4 al 10)");
					id=Leer.datoInt();
					Contacto c5 = new Contacto(nombre, telefono, id);
					at.add(c5, telefono);
					
					System.out.println("Contacto agregado correctamente");
					at.toString();
					break;
				case 3:
					System.out.println("Indique el número del contacto que quiera buscar");
					telefono=Leer.dato();
					System.out.println(at.findByTelefono(telefono));
					break;
				case 4:
					System.err.println("Indique el número del contacto que quiera borrar");
					telefono=Leer.dato();
					at.delete(at.findByTelefono(telefono));
					break;

			default:
				System.out.println("Opción no válida, introducta una opción correcta");
				break;
			}

		} while (op != 0);
		System.out.println("Gracias por usar el programa");

	}

}
