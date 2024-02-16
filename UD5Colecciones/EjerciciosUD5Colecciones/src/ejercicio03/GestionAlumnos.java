package ejercicio03;

public class GestionAlumnos {

	public double calcularNotaMedia(double nota1, double nota2, double nota3) {
		double media=0.0;
		media=nota1+nota2+nota3;
		return media;
	}
	
	public void decirSuspensos(double nota1, double nota2, double nota3) {
		int suspensos=0;
		if(nota1<5) {
			suspensos++;
		}
		if(nota2<5) {
			suspensos++;
		}
		if(nota3<5) {
			suspensos++;
		}
	}
}
