package Ejercicio2;

import java.time.LocalDate;

public class ProductosFrescos extends Producto{

	LocalDate fechaEnvasado;
	private String paisOrigen;

	
	//Getters y Setters
	public LocalDate getFechaEnvasado() {
		return fechaEnvasado;
	}
	public void setFechaEnvasado(LocalDate fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}
	public String getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	
	//Constructor
	public ProductosFrescos(LocalDate fechaCaducidad, int lote, LocalDate fechaEnvasado, String paisOrigen) {
		super(fechaCaducidad, lote);
		this.fechaEnvasado = fechaEnvasado;
		this.paisOrigen = paisOrigen;
	}
	
	//toString
	@Override
	public String toString() {
		return "Productos Frescos:\n Vencimiento: " + getFechaCaducidad() + "\nLote=" + getLote() + "\nEnvasado. " + fechaEnvasado +
				"\nPais Origen=" + paisOrigen + "\n__________________________________________";
	}

	
	
}