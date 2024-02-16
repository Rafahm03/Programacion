package ejemplo1;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [ ] numeros = {1,3,5,7,9,11,13,15,17,19};
		int suma = 0;
		
		//ForEach  
		for (int valor : numeros ) {
			
			suma =suma + valor;
			
			System.out.println (valor); //Para ver el valor del elemento
		}
		
		System.out.println ("La suma es: " + suma);
	}
	
	//Operador ternario  sintaxis:  condición ? expr1 : expr2 (es como un if-else)

}
