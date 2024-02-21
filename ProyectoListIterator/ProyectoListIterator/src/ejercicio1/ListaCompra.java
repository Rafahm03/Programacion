package ejercicio1;

import java.util.List;
import java.util.ListIterator;

public class ListaCompra {

	private List<Producto> productos;
	private ListIterator<Producto> listIterator;

	// constructor
	public ListaCompra(List<Producto> productos) {
		this.productos = productos;
		this.listIterator = productos.listIterator();
	}

	public ListIterator<Producto> getListIterator() {
		return listIterator;
	}

	public void setListIterator(ListIterator<Producto> listIterator) {
		this.listIterator = listIterator;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	@Override
	public String toString() {
		return "ListaCompra [productos=" + productos + ", listIterator=" + listIterator + "]";
	}

	// metodos
	public void addProducto(Producto producto) {
		productos.add(producto);
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void mostrarLista() {
		System.out.println("Lista de la Compra:");
		for (Producto producto : productos) {
			System.out.println(producto);
		}
		System.out.println();
	}

	public void eliminarProducto(String nombreProducto) {
		ListIterator<Producto> iterator = productos.listIterator();
		while (iterator.hasNext()) {
			Producto producto = iterator.next();
			if (producto.getNombre().equalsIgnoreCase(nombreProducto)) {
				iterator.remove();
				System.out.println(nombreProducto + " eliminado de la lista.");
				return;
			}
		}
		System.out.println(nombreProducto + " no encontrado en la lista.");
	}

	// metodos de api listiterator
	public void mostrarListaAdelante() {
		ListIterator<Producto> iterator = productos.listIterator();
		while (iterator.hasNext()) {
			Producto producto = iterator.next();
			System.out.println(producto);
		}
	}

	public void mostrarListaAtras() {
		ListIterator<Producto> iterator = productos.listIterator();

		if (productos.isEmpty()) {
	        System.out.println("La lista está vacía.");
	        return;
	    }

	    // Re-inicializar el iterador al final de la lista
	    iterator = productos.listIterator(productos.size());

	    while (iterator.hasPrevious()) {
	        Producto producto = iterator.previous();
	        System.out.println(producto);
	    }
	}

	public void reemplazarProducto(String nombreProducto, String nuevoNombre, double nuevoPrecio) {
		// Buscar el producto en la lista
		ListIterator<Producto> iterator = productos.listIterator();
		while (iterator.hasNext()) {
			Producto producto = iterator.next();
			if (producto.getNombre().equalsIgnoreCase(nombreProducto)) {
				// Reemplazar el producto
				iterator.set(new Producto(nuevoNombre, nuevoPrecio));
				System.out.println("Producto reemplazado correctamente.");
				return;
			}
		}

		// Producto no encontrado
		System.out.println("Producto no encontrado en la lista.");
	}

	public double calcularTotal() {
		double total = 0;
		for (Producto producto : productos) {
			total += producto.getPrecio();
		}
		return total;
	}
}
