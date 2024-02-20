package ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Club {

	    private List<Jugador> jugadores;

	    public Club() {
	        this.jugadores = new ArrayList<>();
	    }

	    public List<Jugador> getJugadores() {
			return jugadores;
		}

		public void setJugadores(List<Jugador> jugadores) {
			this.jugadores = jugadores;
		}
		
		@Override
		public String toString() {
			return "Club [jugadores=" + jugadores + "]";
		}

		public void agregarJugador(Jugador j) {
	        jugadores.add(j);
	    }

	    public void iterarHaciaAdelante() {
	        System.out.println("Iteración hacia adelante:");
	        for (Jugador jugador : jugadores) {
	            System.out.println(jugador.getNombre());
	        }
	    }

	    public void iterarHaciaAtras() {
	        System.out.println("\nIteración hacia atrás:");
	        for (int i = jugadores.size() - 1; i >= 0; i--) {
	            Jugador jugador = jugadores.get(i);
	            System.out.println(jugador.getNombre());
	        }
	    }

	    public int obtenerIndiceActual(Jugador j) {
	        return jugadores.indexOf(j);
	    }


	    public void modificarDorsalJugador(Jugador j, int nuevoDorsal) {
	        int indice = jugadores.indexOf(j);
	        if (indice != -1) {
	            // Obtener el jugador actual en el índice encontrado
	            Jugador jugadorActual = jugadores.get(indice);

	            // Modificar el dorsal del jugador actual
	            jugadorActual.setDorsal(nuevoDorsal);

	            // Actualizar la lista en el índice
	            jugadores.set(indice, jugadorActual);
	        }
	    }


	    public void eliminarElementoActual(Jugador j) {
	        jugadores.remove(j);
	    }

	    public void imprimirListaDespuesDeModificaciones() {
	        System.out.println("\nLista después de las modificaciones:");
	        for (Jugador jugador : jugadores) {
	            System.out.println(jugador.getNombre());
	        }
	    }
	   
}