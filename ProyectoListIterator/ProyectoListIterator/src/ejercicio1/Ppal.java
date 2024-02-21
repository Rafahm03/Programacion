package ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Ejemplo uso listIterator
		 * 
		 * En este ejemplo se usará la coleccion ListIterator
		 * 
		 * Este ejemplo consiste en un programa para llevar la lista de la compra
		 * Tendrémos una clase POJO llamada Producto, un producto tiene como atributos
		 * el nombre y su precio, Además tendremos la clase listaCompra que contendrá una lista
		 * de productos, en la clase ListCompra habrá varios métodos, con los cuales podremos
		 * Mostrar la lista de la compra o de productos, mostrar la lista recorridad desde desde adelante,
		 * o también mostrar la lista desde atrás, también podremos cambiar un producto de la lista,
		 * o borrar un producto.
		 * Y un metodo noCrud que consiste en calcular el coste total los productos de la lista. 
		 * 
		 */
		
		//Variables
		int op=0;
		double precioNuevoProducto=0.0;
		String nombreProducto, nombreNuevoProducto;
		
		//Instancias
		List<Producto> listaProductos = new ArrayList<>();
	    ListIterator<Producto> listIterator = listaProductos.listIterator();
		ListaCompra lc = new ListaCompra(listaProductos);
		
		//Creación de los productos
		Producto p1 = new Producto("Manzana", 0.56);
		Producto p2 = new Producto("Leche", 1.64);
		Producto p3 = new Producto("Botella Coca-Cola", 2.16);
		Producto p4 = new Producto("Patatas Lays", 1.56);

		//Agregación de los productos a la lista de la compra
		lc.addProducto(p1);
		lc.addProducto(p2);
		lc.addProducto(p3);
		lc.addProducto(p4);
		
		
		do {
			System.out.println(" ");
			System.out.println("MENU");
			System.out.println("___________________________________");
			System.out.println("1) Mostrar lista de productos");
			System.out.println("2) Eliminar Producto de la lista");
			System.out.println("3) Mostrar la lista desde adelante");
			System.out.println("4) Mostrar la lista desde atrás");
			System.out.println("5) Cambiar un producto");
			System.out.println("6) Calcular coste de la compra");
			System.out.println("0) SALIR");
			System.out.println("___________________________________");
			System.out.println("Ejija una opción a realizar");
			op=Leer.datoInt();
			
			switch (op) {
			case 0:
				System.out.println("SALIENDO...");
				break;
			case 1:
				// Mostrar la lista
				lc.mostrarLista();
				break;
			case 2:
				//Eliminar Producto de la lista
				System.out.println("Acontinuación se le mostrará la lista de productos");
				lc.mostrarLista();
				System.out.println("Diga el nombre del producto que desea eliminar");
				nombreProducto=Leer.dato();
				lc.eliminarProducto(nombreProducto);
				System.out.println(" ");
				lc.mostrarLista();

				break;
			case 3:
				//Mostrar la lista desde adelante
				lc.mostrarListaAdelante();
				break;
			case 4: 
				//Mostrar la lista desde atrás
				lc.mostrarListaAtras();
				break;
			case 5:
				//Cambiar un producto
				System.out.println("Acontinuación se le mostrará la lista de productos");
				lc.mostrarLista();
				System.out.println("Diga el nombre del producto que desea reemplazar");
				nombreProducto=Leer.dato();
				System.out.println("Ahora diga el nombre del nuevo producto");
				nombreNuevoProducto=Leer.dato();
				System.out.println("Diga también el precio del nuevo producto");
				precioNuevoProducto=Leer.datoDouble();
				lc.reemplazarProducto(nombreProducto, nombreNuevoProducto, precioNuevoProducto);
				lc.mostrarLista();
				break;
			case 6:
				// Calcular el total de la compra
				double totalCompra = lc.calcularTotal();
				System.out.printf("Total de la compra: " + totalCompra, "€");
				break;
			default:
				System.out.println("Opción no válida, inserte una opción válida");
				break;
			}
			
		} while (op!=0);
		
		System.out.println("Gracias por usar el programa");
		
	}

}
