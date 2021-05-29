package Ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Polideportivo> poli = new ArrayList<Polideportivo>(3);
		
		Polideportivo poli1 = new Polideportivo(50.2,20);
		Polideportivo poli2 = new Polideportivo(35.8,25);
		Polideportivo poli3 = new Polideportivo(100,50);
		
		poli.add(poli1);
		poli.add(poli2);
		poli.add(poli3);
		
		Iterator<Polideportivo> it = poli.iterator();
		while (it.hasNext()) {
			Polideportivo p = (Polideportivo) it.next();
			System.out.println(p.toString());
		}
		
	}

}
