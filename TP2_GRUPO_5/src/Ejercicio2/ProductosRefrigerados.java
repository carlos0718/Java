package Ejercicio2;

import java.time.LocalDate;

public class ProductosRefrigerados extends Producto {

	private String codigoOrganismo;
	
	//Getters y Setters
	public String getCodigoOrganismo() {
		return codigoOrganismo;
	}

	public void setCodigoOrganismo(String codigoOrganismo) {
		this.codigoOrganismo = codigoOrganismo;
	}

	
	//Constructor
	public ProductosRefrigerados(LocalDate fechaCaducidad, int lote, String codigoOrganismo) {
		super(fechaCaducidad, lote);
		this.codigoOrganismo = codigoOrganismo;
	}

	//toString
	@Override
	public String toString() {
		return "Productos Refrigerados: \nVencimiento: " + getFechaCaducidad() + "\nLote=" + getLote() + "\nCodigo Organismo=" + codigoOrganismo +
				"\n__________________________________________";
	}


	
	
	
}
