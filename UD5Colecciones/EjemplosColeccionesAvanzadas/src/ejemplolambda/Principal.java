package ejemplolambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mensaje="";
		double km;
		
		
		//primer ejemplo
		System.out.println("Indique un mensaje de bienvenida");
		mensaje=Leer.dato();
		IBienvenida bienvenida = (x) -> System.out.println(x);
		bienvenida.mostrarBienvenida(mensaje);
		
		
		//segundo ejemplo
		
		int e = 3;
		
		ISumar suma1= z -> z+2;
		
		System.out.println(suma1.sumar(e));
		
		
		
		//tercer metodo(Supplier)
		
		Supplier <Double> proveedor = () -> Math.random();
		System.out.println(proveedor.get());
		
		//metodo consumer
		
		Consumer<String> mostrar = (a) -> System.out.println(a);
		
		
		//Método function
		
		Function <Double, Double> aMetros = (Km) -> Km*1000; 
		
		//Método BiFunction 
		
		
				
				
	}

}
