package ejercicio1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws DniInvalido {

		Persona p = new Persona();

		/*
		 * p.MostrarListPersonas();
		 * 
		 * if(p.VerificarDniInvalido("ddddd")==true)System.out.println("verdadero");
		 * 
		 * if(p.VerificarDniInvalido("111111")==true)System.out.println("verdadero");
		 */

		Archivo File = new Archivo();

		ArrayList<Persona> ListaOrdenada = new ArrayList<Persona>();

		ListaOrdenada = File.CargarArrayList();
		p.MostrarListPersonas(ListaOrdenada);

		File.guardarResultado(ListaOrdenada);
	}

}
