package AppDesktop;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WindEjercicio3 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldHoras;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					WindEjercicio3 frame = new WindEjercicio3();
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
	public WindEjercicio3() {
		setTitle("Selecci\u00F3n M\u00FAltiple");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(150, 150, 585, 373);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.BLACK, 2));
		panel.setBounds(23, 22, 500, 51);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblSistOperativo = new JLabel("Elije un sistema operativo");
		lblSistOperativo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSistOperativo.setBounds(22, 11, 162, 29);
		panel.add(lblSistOperativo);
		
		JRadioButton rdbtnWindows = new JRadioButton("Windows");
		rdbtnWindows.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnWindows.setBounds(213, 15, 89, 23);
		panel.add(rdbtnWindows);
		
		JRadioButton rdbtnMac = new JRadioButton("Mac");
		rdbtnMac.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnMac.setBounds(327, 14, 68, 23);
		panel.add(rdbtnMac);
		
		JRadioButton rdbtnLinux = new JRadioButton("Linux");
		rdbtnLinux.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnLinux.setBounds(407, 15, 68, 23);
		panel.add(rdbtnLinux);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.BLACK, 2));
		panel_1.setBounds(23, 95, 500, 146);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblEspecialidad = new JLabel("Elije una especialidad");
		lblEspecialidad.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEspecialidad.setBounds(48, 60, 146, 27);
		panel_1.add(lblEspecialidad);
		
		JCheckBox chckbxProgramacion = new JCheckBox("Programaci\u00F3n");
		chckbxProgramacion.setFont(new Font("Tahoma", Font.PLAIN, 13));
		chckbxProgramacion.setBounds(292, 20, 112, 23);
		panel_1.add(chckbxProgramacion);
		
		JCheckBox chckbxAdmin = new JCheckBox("Administraci\u00F3n");
		chckbxAdmin.setFont(new Font("Tahoma", Font.PLAIN, 13));
		chckbxAdmin.setBounds(292, 62, 112, 23);
		panel_1.add(chckbxAdmin);
		
		JCheckBox chckbxDisenioG = new JCheckBox("Dise\u00F1o Gr\u00E1fico");
		chckbxDisenioG.setFont(new Font("Tahoma", Font.PLAIN, 13));
		chckbxDisenioG.setBounds(294, 105, 110, 23);
		panel_1.add(chckbxDisenioG);
		
		JLabel lblCantHoras = new JLabel("Cantidad de horas en el computador");
		lblCantHoras.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCantHoras.setBounds(92, 267, 216, 16);
		contentPane.add(lblCantHoras);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hString ="hola mundo";
				String jString = " JAVA";
				JOptionPane.showMessageDialog(btnAceptar,hString +jString );
			}
		});
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAceptar.setBounds(233, 300, 89, 23);
		contentPane.add(btnAceptar);
		
		textFieldHoras = new JTextField();
		textFieldHoras.setBounds(341, 266, 122, 20);
		contentPane.add(textFieldHoras);
		textFieldHoras.setColumns(10);
	}

}
