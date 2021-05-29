package Ejercicio2;
import java.time.LocalDate;

public  class Producto {

	LocalDate fechaCaducidad;
	private int lote;
	
	
	//Getters y Setters
	public LocalDate getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(LocalDate fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	public int getLote() {
		return lote;
	}
	public void setLote(int lote) {
		this.lote = lote;
	}
	
	
	//Constructor
	public Producto(LocalDate fechaCaducidad, int lote) {
		this.fechaCaducidad = fechaCaducidad;
		this.lote = lote;
	}
	
	 
	@Override
	public String toString() {
		return "Producto\n Vencimiento: " + fechaCaducidad + "\nLote=" + lote + "\n__________________________________________";
	}
	
	
}
