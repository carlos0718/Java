package Ejercicio2;

import java.time.LocalDate;

public class ProductosCongelados extends Producto {
	
	private double temperaturaCongelacion;
	
	//Getters y Setters
	public double getTemperaturaCongelacion() {
		return temperaturaCongelacion;
	}

	public void setTemperaturaCongelacion(double temperaturaCongelacion) {
		this.temperaturaCongelacion = temperaturaCongelacion;
	}

	//Constructor
	public ProductosCongelados(LocalDate fechaCaducidad, int lote, double temperaturaCongelacion) {
		super(fechaCaducidad, lote);
		this.temperaturaCongelacion = temperaturaCongelacion;
	}

	@Override
	public String toString() {
		return  "Productos Congelados: \nVencimiento: " + getFechaCaducidad() + "\nLote=" + getLote() + 
				"\nT°-Congelacion: " + temperaturaCongelacion + "\n__________________________________________";
	}
	//toString


	
}
