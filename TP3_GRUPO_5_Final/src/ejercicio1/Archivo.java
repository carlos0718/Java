package ejercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Archivo {

	public static <T> ArrayList<T> removerDuplicados(ArrayList<T> list) {

		// Crea un new LinkedHashSet
		Set<T> set = new LinkedHashSet<T>();

		// Agrega los elementos alset
		set.addAll(list);

		// Limpia la lista
		list.clear();

		// agrega los elementos del set sin duplicados a la lista nueva
		list.addAll(set);

		// return the list
		return list;
	}

	public ArrayList<Persona> CargarArrayList() {

		ArrayList<Persona> nuevaListaPersona = new ArrayList<Persona>();

		try {

			BufferedReader br = new BufferedReader(new FileReader("Archivo/Personas.txt"));
			String linea = null;
			ArrayList<Persona> ListPersona = new ArrayList<Persona>();

			while ((linea = br.readLine()) != null) {

				try {
					StringTokenizer token = new StringTokenizer(linea, "-");

					Persona P = new Persona();
					P.setNombre(token.nextToken().trim());
					P.setApellido(token.nextToken().trim());
					P.setDni(token.nextToken().trim());
					if (P.VerificarDniInvalido(P.getDni()))
						ListPersona.add(P);
				} catch (DniInvalido e) {
					System.out.println("el DNI es Invalido");
				}

			}
			br.close();
			nuevaListaPersona = removerDuplicados(ListPersona);
			Collections.sort(nuevaListaPersona);

		}

		catch (IOException e) {
			System.out.println("No se encontro el archivo");
			e.printStackTrace();
		}

		return nuevaListaPersona;

	}

	public void guardarResultado(ArrayList<Persona> lista) {

		for (Persona persona : lista) {
			try {
				FileWriter entrada = new FileWriter("Archivo/resultado.txt", true);
				BufferedWriter miBuffer = new BufferedWriter(entrada);
				miBuffer.write("\n " + persona.toString());
				miBuffer.close();
				entrada.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
