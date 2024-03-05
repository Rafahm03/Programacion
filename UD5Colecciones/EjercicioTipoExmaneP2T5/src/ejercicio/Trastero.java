package ejercicio;

public class Trastero implements Comparable<Trastero>{
	
	private double mCuadrados;
	private String direccion;
	private int numTrastero;
	private double precio;
	private boolean ocupado;
	
	public Trastero(double mCuadrados, String direccion, int numTrastero, double precio, boolean ocupado) {
		super();
		this.mCuadrados = mCuadrados;
		this.direccion = direccion;
		this.numTrastero = numTrastero;
		this.precio = precio;
		this.ocupado = ocupado;
	}

	public double getmCuadrados() {
		return mCuadrados;
	}

	public void setmCuadrados(double mCuadrados) {
		this.mCuadrados = mCuadrados;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getNumTrastero() {
		return numTrastero;
	}

	public void setNumTrastero(int numTrastero) {
		this.numTrastero = numTrastero;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	@Override
	public String toString() {
		return "Trastero [mCuadrados=" + mCuadrados + ", direccion=" + direccion + ", numTrastero=" + numTrastero
				+ ", precio=" + precio + ", ocupado=" + ocupado + "]";
	}

	@Override
	public int compareTo(Trastero o) {
		if (this.numTrastero < o.getNumTrastero()) {
			return -1;
		}else {
			if(this.numTrastero > o.getNumTrastero()) {
			return 1;
			}
		}
		return 0;
	}	

}
