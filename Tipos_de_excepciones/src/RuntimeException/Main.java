/**
 * 
 */
package RuntimeException;

/**
 * @author Carlos Alfredo Jesus
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * se agrega indice 5 para probocar exception y hacer el try catch
		 */
		int [] vector = new int[5];
		try {
			vector[0]=10;
			vector[1]=20;
			vector[2]=30;
			vector[3]=40;
			vector[4]=50;
			vector[5]=60;
			
		} catch (ArrayIndexOutOfBoundsException	 e) {
			// TODO: handle exception
			System.out.println("se está tratando de acceder a una posición inválida");
		}
		for (int i = 0; i < vector.length; i++) {
			System.out.println("Número: "+vector[i]);
		}
	}

}
