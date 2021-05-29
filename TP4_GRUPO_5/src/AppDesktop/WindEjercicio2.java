package AppDesktop;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class WindEjercicio2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldN1;
	private JTextField textFieldN2;
	private JTextField textFieldN3;
	private JTextField textFieldProm;
	private JTextField textFieldCondicion;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					WindEjercicio2 frame = new WindEjercicio2();
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
	public WindEjercicio2() {
		setTitle("Promedio");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(140, 140, 653, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		Border titleBorder = new TitledBorder(new LineBorder(Color.gray),"Notas del Estudiante");
		panel.setBorder(titleBorder);
		panel.setBounds(64, 33, 287, 230);
		
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNota1 = new JLabel("Nota 1:");
		lblNota1.setBounds(26, 40, 49, 19);
		panel.add(lblNota1);
		
		JLabel lblNota2 = new JLabel("Nota 2:");
		lblNota2.setBounds(26, 78, 46, 14);
		panel.add(lblNota2);
		
		JLabel lblNota3 = new JLabel("Nota 3:");
		lblNota3.setBounds(26, 120, 46, 14);
		panel.add(lblNota3);
		
		JLabel lblTps = new JLabel("TPS:");
		lblTps.setBounds(26, 166, 46, 14);
		panel.add(lblTps);
		
		textFieldN1 = new JTextField();
		textFieldN1.setBounds(104, 39, 101, 20);
		panel.add(textFieldN1);
		textFieldN1.setColumns(10);
		
		textFieldN2 = new JTextField();
		textFieldN2.setBounds(104, 75, 101, 20);
		panel.add(textFieldN2);
		textFieldN2.setColumns(10);
		
		textFieldN3 = new JTextField();
		textFieldN3.setText("");
		textFieldN3.setBounds(104, 117, 101, 20);
		panel.add(textFieldN3);
		textFieldN3.setColumns(10);
		
		JComboBox<Object> comboBox = new JComboBox<Object>();
		comboBox.setModel(new DefaultComboBoxModel<Object>(new String[] {"Aprobado", "Desaprobado"}));
		comboBox.setBounds(104, 162, 101, 22);
		panel.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(Color.gray), "Notas del Estudiante", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		panel_1.setBounds(64, 287, 287, 126);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblPromedio = new JLabel("Promedio:");
		lblPromedio.setBounds(20, 36, 70, 21);
		panel_1.add(lblPromedio);
		
		JLabel lblCondicion = new JLabel("Condici\u00F3n:");
		lblCondicion.setBounds(20, 73, 70, 14);
		panel_1.add(lblCondicion);
		
		textFieldProm = new JTextField();
		textFieldProm.setBounds(112, 36, 111, 20);
		panel_1.add(textFieldProm);
		textFieldProm.setColumns(10);
		
		textFieldCondicion = new JTextField();
		textFieldCondicion.setBounds(112, 70, 111, 20);
		panel_1.add(textFieldCondicion);
		textFieldCondicion.setColumns(10);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.setBounds(452, 106, 102, 44);
		contentPane.add(btnCalcular);
		
		JButton btnNuevo = new JButton("NUEVO");
		btnNuevo.setBounds(452, 175, 102, 44);
		contentPane.add(btnNuevo);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setBounds(452, 246, 102, 44);
		contentPane.add(btnSalir);
	}
}
