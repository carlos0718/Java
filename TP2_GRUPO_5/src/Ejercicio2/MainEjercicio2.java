package Ejercicio2;

import java.time.LocalDate;

public class MainEjercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate caducidadDate = LocalDate.of(2022, 02, 10);
		LocalDate envasadoDate = LocalDate.of(2021, 01, 05);
		
		Producto x = new Producto(caducidadDate,123456);
		System.out.println(x.toString());
		
		ProductosCongelados carne = new ProductosCongelados(caducidadDate,123456,-11.55);
		System.out.println(carne.toString());
		
		ProductosRefrigerados huevo = new ProductosRefrigerados(caducidadDate,123456,"SA12345");
		System.out.println(huevo.toString());
		
		ProductosFrescos verdura = new ProductosFrescos(caducidadDate,123456,envasadoDate,"Chile");
		System.out.println(verdura.toString());
	}

}
