package AppDesktop;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WindowsMain extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public WindowsMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTP4 = new JLabel(" TP N\u00B0 4");
		lblTP4.setBounds(41, 28, 93, 14);
		contentPane.add(lblTP4);
		
		JButton btnEjercicio1 = new JButton("Ejercicio 1");
		btnEjercicio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WindEjercicio1 frameEjercicio1 = new WindEjercicio1();
				frameEjercicio1.setVisible(true);
			}
		});
		btnEjercicio1.setBounds(150, 75, 102, 23);
		contentPane.add(btnEjercicio1);
		
		JButton btnEjercicio2 = new JButton("Ejercicio 2");
		btnEjercicio2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WindEjercicio2 frame = new WindEjercicio2();
				frame.setVisible(true);
			}
		});
		btnEjercicio2.setBounds(150, 128, 102, 23);
		contentPane.add(btnEjercicio2);
		
		JButton btnEjercicio3 = new JButton("Ejercicio 3");
		btnEjercicio3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WindEjercicio3 frame = new WindEjercicio3();
				frame.setVisible(true);
			}
		});
		btnEjercicio3.setBounds(150, 184, 102, 23);
		contentPane.add(btnEjercicio3);
	}
}
