package creando_exceptions;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String correo = JOptionPane.showInputDialog("Ingrese correo electr�nico: ");
			Mail.validarMail(correo);
			
		} catch (faltaArrobaException e) {
			// TODO: handle exception
			System.out.println("Ingresa faltaArrobaException -");
			e.printStackTrace();
		}catch (faltaPuntoException e) {
			// TODO: handle exception
			System.out.println("Ingresa faltaPuntoException");
			e.printStackTrace();
		}
	}

}
