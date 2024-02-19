package ejercicio03;

import java.util.Set;

public class CrudAlumno {

	Set<Alumno> lista;

	public CrudAlumno(Set<Alumno> lista) {
		super();
		this.lista = lista;
	}

	public Set<Alumno> getAlumnos() {
		return lista;
	}

	public void setAlumnos(Set<Alumno> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "CrudAlumno [alumnos=" + lista + "]";
	}
	
	public void add(Alumno a) {
		lista.add(a);
	}
	
	public void imprimirLista() {
		for (Alumno alumno : lista) {
			System.out.println(alumno);
		}
	}
	
	public Alumno findByDni(String dni) {
		if (lista.size() !=0) {
			for (Alumno alumno : lista) {
				if(alumno.getDni()==dni) {
					return alumno;//no hace falta el encontrado porque cuando encuentra el alumno se termina el método, si no lo encuentra devuelve null
				}
			}
		}
		
		return null;
	}
	
	public void borrarAlumno(String dni) {
		if (findByDni(dni)!=null) {
			lista.remove(findByDni(dni));
		}
	}
	
	public void modificarAlumno(String dni, String nuevoCurso) {
		findByDni(dni).setCurso(nuevoCurso);
	}
	
	
	
	
}
