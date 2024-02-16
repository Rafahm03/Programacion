package ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Jugador> listaJugadores =  new ArrayList<Jugador>();
		Jugador j1= new Jugador("Cristiano Ronaldo", 7, 39, "Al-Nassr", "1234567f");
		Jugador j2= new Jugador("Lionel Messi", 10, 36, "Inter Miami", "76543456d");
		Jugador j3= new Jugador("Carlos Bacca", 70, 36, "Junior de Barranquilla", "1234567f");
		Jugador j4= new Jugador("Alejo véliz", 36, 20, "Sevilla FC", "9876543b");
		Jugador j5= new Jugador("Jorrel Hato", 7, 17, "Ajax", "65343746l");
		Iterator<Jugador>jugadoresFutbol = listaJugadores.iterator();
	}

}
