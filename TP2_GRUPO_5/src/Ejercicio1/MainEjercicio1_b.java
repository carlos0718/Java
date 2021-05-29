package Ejercicio1;
import java.util.Iterator;
import java.util.TreeSet;


public class MainEjercicio1_b {
	
	public static void main(String [] args) {
	
		///// PUNTO 6

		TreeSet<Profesor> ListaProfesor = new TreeSet<Profesor>();
		ListaProfesor.add(new Profesor("Angel", 35, "Docente", 5));
		ListaProfesor.add(new Profesor("Daniel", 50, "Ayudante", 15));
		ListaProfesor.add(new Profesor("Tamara", 31, "Docente", 2));
		ListaProfesor.add(new Profesor("Brian", 40, "Preceptor", 5));
		ListaProfesor.add(new Profesor("Javier", 35, "docente", 8));

		Iterator<Profesor> It = ListaProfesor.iterator();
		while (It.hasNext()) {
			Profesor Profesor = It.next();
			System.out.println(Profesor);
		}

		///// PUNTO 7

		Profesor p1 = new Profesor("Carlos", 26, "docente", 3);
		Profesor p2 = new Profesor("Juan", 26, "docente", 3);

		if (p1.equals(p2)) {
			System.out.println("Son la misma persona");
		} else {
			System.out.println("No son la misma persona");
		}
			
	}

}
