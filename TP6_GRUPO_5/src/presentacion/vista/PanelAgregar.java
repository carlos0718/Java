package presentacion.vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PanelAgregar extends JPanel {


	private static final long serialVersionUID = 1L;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JTextField textFieldDni;
	private JButton btnAceptar;


	public PanelAgregar() {
		setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(76, 41, 46, 14);
		add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(76, 83, 46, 14);
		add(lblApellido);
		
		JLabel lblDni = new JLabel("Dni");
		lblDni.setBounds(76, 122, 46, 14);
		add(lblDni);
		
		textFieldNombre = new JTextField();
		textFieldNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {		
				
				if(e.getKeyChar()>=33 && e.getKeyChar()<=64
						|| e.getKeyChar() >= 91 && e.getKeyChar() <= 96	
						|| e.getKeyChar() >= 123 && e.getKeyChar() <= 208
						|| e.getKeyChar() >= 210 && e.getKeyChar() <= 240
						|| e.getKeyChar() >= 242 && e.getKeyChar() <= 255	) {
						
						e.consume();
					}
			}
		});
		textFieldNombre.setBounds(142, 38, 141, 20);
		add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldApellido = new JTextField();
		textFieldApellido.addKeyListener(new KeyAdapter() {
			@Override
            public void keyTyped(KeyEvent e) {
				
				if(e.getKeyChar()>=33 && e.getKeyChar()<=64
					|| e.getKeyChar() >= 91 && e.getKeyChar() <= 96	
					|| e.getKeyChar() >= 123 && e.getKeyChar() <= 208
					|| e.getKeyChar() >= 210 && e.getKeyChar() <= 240
					|| e.getKeyChar() >= 242 && e.getKeyChar() <= 255	) {
					
					e.consume();
				}
			}
		});
		textFieldApellido.setColumns(10);
		textFieldApellido.setBounds(142, 80, 141, 20);
		add(textFieldApellido);
		
		textFieldDni = new JTextField();
		textFieldDni.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				char c = e.getKeyChar();
				
				if(!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE) {
					
					e.consume();
				}
			}
		});
		textFieldDni.setColumns(10);
		textFieldDni.setBounds(142, 119, 141, 20);
		add(textFieldDni);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(70, 164, 161, 23);
		add(btnAceptar);
	}


	public JTextField getTextFieldNombre() {
		return textFieldNombre;
	}


	public void setTextFieldNombre(JTextField textFieldNombre) {
		this.textFieldNombre = textFieldNombre;
	}


	public JTextField getTextFieldApellido() {
		return textFieldApellido;
	}


	public void setTextFieldApellido(JTextField textFieldApellido) {
		this.textFieldApellido = textFieldApellido;
	}


	public JTextField getTextFieldDni() {
		return textFieldDni;
	}


	public void setTextFieldDni(JTextField textFieldDni) {
		this.textFieldDni = textFieldDni;
	}


	public JButton getBtnAceptar() {
		return btnAceptar;
	}


	public void setBtnAceptar(JButton btnAceptar) {
		this.btnAceptar = btnAceptar;
	}

	
}
