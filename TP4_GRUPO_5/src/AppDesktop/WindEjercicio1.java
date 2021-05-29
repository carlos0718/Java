package AppDesktop;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;


public class WindEjercicio1 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					WindEjercicio1 frame = new WindEjercicio1();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public WindEjercicio1() {
		setTitle("Contactos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(130, 130, 450, 322);
		getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre :");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNombre.setBounds(52, 45, 88, 14);
		getContentPane().add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblApellido.setBounds(52, 72, 70, 14);
		getContentPane().add(lblApellido);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(136, 42, 161, 20);
		getContentPane().add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldApellido = new JTextField();
		textFieldApellido.setBounds(136, 70, 161, 20);
		getContentPane().add(textFieldApellido);
		textFieldApellido.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Tel\u00E9fono:");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTelefono.setBounds(52, 103, 70, 14);
		getContentPane().add(lblTelefono);
		
		textField = new JTextField();
		textField.setBounds(136, 101, 161, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblFechaNac = new JLabel("Fecha Nac.");
		lblFechaNac.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFechaNac.setBounds(52, 139, 70, 14);
		getContentPane().add(lblFechaNac);
		
		textField_1 = new JTextField();
		textField_1.setBounds(136, 137, 161, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnMostrar.setBounds(169, 185, 89, 23);
		getContentPane().add(btnMostrar);
		
		JLabel lblDatos = new JLabel("Los datos ingresados fueron:");
		lblDatos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDatos.setBounds(27, 252, 181, 20);
		getContentPane().add(lblDatos);
	}
}
