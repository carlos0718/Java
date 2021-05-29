package Ejercicio3;

public class Polideportivo implements ItfInstalacionDeportiva, ItfEdificio {

	private double lado;
	private double ancho;
	
	public Polideportivo() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param lado
	 * @param ancho
	 */
	public Polideportivo(double lado, double ancho) {
		this.lado = lado;
		this.ancho = ancho;
	}
	
	/**
	 * @return the lado
	 */
	public double getLado() {
		return lado;
	}

	/**
	 * @param lado the lado to set
	 */
	public void setLado(double lado) {
		this.lado = lado;
	}

	/**
	 * @return the ancho
	 */
	public double getAncho() {
		return ancho;
	}

	/**
	 * @param ancho the ancho to set
	 */
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	

	@Override
	public double getSuperficieEdificio() {
		// TODO Auto-generated method stub
		
		return getAncho()*getLado();
	}

	@Override
	public int getTipoDeInstalacion() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String toString() {
		return "Polideportivo [lado=" + lado + ", ancho=" + ancho + ", SuperficieEdificio()="
				+ getSuperficieEdificio() + "]";
	}

	
}
