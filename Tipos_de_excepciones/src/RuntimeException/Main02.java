package RuntimeException;

import javax.swing.JOptionPane;

public class Main02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
			int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
			int res = num1/num2;
						
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Error: no se puede divir numero entre cero");
		}catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("Error: no se puede divir numero con string");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
