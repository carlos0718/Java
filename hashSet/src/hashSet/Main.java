package hashSet;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro p1 = new Libro("Autor1","Libro1",11111);
		Libro p2 = new Libro("Autor2","Libro1",22222);
		Libro p3 = new Libro("Autor3","Libro1",33333);
		Libro p4 = new Libro("Autor4","Libro1",44444);
		Libro p5 = new Libro("Autor1","Libro1",11111);
		
		HashSet<Libro> listaLibros = new HashSet<Libro>();
		listaLibros.add(p1);
		listaLibros.add(p1);
		listaLibros.add(p1);
		listaLibros.add(p1);
		listaLibros.add(p1);
		
		listaLibros.add(p2);
		listaLibros.add(p3);
		listaLibros.add(p4);
		listaLibros.add(p5); //no debería ser agregado
		
		System.out.println("Listado de Libros");
		for (Libro x : listaLibros) {
			System.out.println(x.toString());
		}
	}

}
