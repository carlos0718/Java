/**
 * 
 */
package Archivo3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Carlos Alfredo Jesus
 *
 */
public class Archivo3 {
	private String ruta;
	/**
	 * 
	 */
	public Archivo3() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return the ruta
	 */
	public String getRuta() {
		return ruta;
	}

	/**
	 * @param ruta the ruta to set
	 */
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	
	public boolean existe() {
		File archivo = new File(ruta);
		if (archivo.exists()) {
			return true;
		}
		return false;
	}
	
	public boolean crearArchivo() {
		FileWriter escritura;
		try {
			escritura = new FileWriter(ruta, true);
			escritura.write("");
			escritura.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
	public void escribe_lineas(String frase) {
		try {
			FileWriter fw = new FileWriter(ruta, true);
			BufferedWriter miBufferedWriter = new BufferedWriter(fw);
			miBufferedWriter.write(frase);
			miBufferedWriter.close();
			fw.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void leer_letra_por_letra() {
		FileReader entrada;
		try {
			entrada = new FileReader(ruta);
			BufferedReader miBufferedReader = new BufferedReader(entrada);
			String linea = "";

			while (linea != null) {
				
				System.out.println(linea);
				linea = miBufferedReader.readLine();
			}
			miBufferedReader.close();
			entrada.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
