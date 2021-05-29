package treeSet;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Persona> listaPersonas = new TreeSet<Persona>();
		
		Persona p1 = new Persona("Belen","Sanchez",11111111);
		Persona p2 = new Persona("Alberto","Rodriguez",22222222);
		Persona p3 = new Persona("Rodrigo","Fernandez",33333333);
		Persona p4 = new Persona("Pedro","Ibañez",44444444);
		Persona p5 = new Persona("Belen","Sanchez",11111111);
		
		listaPersonas.add(p1);
		listaPersonas.add(p1);
		listaPersonas.add(p1);
		listaPersonas.add(p1);
		listaPersonas.add(p1);//agrega a p1 varias veces
		listaPersonas.add(p2);
		listaPersonas.add(p3);
		listaPersonas.add(p4);
		listaPersonas.add(p5);
		
		System.out.println("\nListado de personas for each ordenado \n");
		
		for (Persona x : listaPersonas) {
			System.out.println(x.toString());
		}
	}

}
