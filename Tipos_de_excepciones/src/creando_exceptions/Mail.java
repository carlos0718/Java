/**
 * 
 */
package creando_exceptions;


/**
 * @author Carlos Alfredo Jesus
 *
 */
public class Mail {

	/**
	 * 
	 */
	public Mail() {
		// TODO Auto-generated constructor stub
	}
	
	public static boolean validarMail(String mail) throws faltaArrobaException, faltaPuntoException{
		Boolean auxArroba = false;
		Boolean auxPunto = false;
		
		for (int i = 0; i < mail.length(); i++) {
			if (mail.charAt(i)=='@') {
				auxArroba = true;
			}
			if (mail.charAt(i)=='.') {
				auxPunto = true;
			}
		}
		if (auxArroba==false) {
			//falta arroba
			faltaArrobaException exc1 = new faltaArrobaException();
			throw exc1;
					
		}
		if (auxPunto==false) {
			//falta punto
			faltaPuntoException exc2 = new faltaPuntoException();
			throw exc2;
		}
		if (auxArroba && auxPunto) {
			//falta arroba
			return true;
		}
		
		return false;
		
	}

}
