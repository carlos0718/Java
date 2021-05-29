package Peliculas;

import java.awt.Font;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.awt.event.ActionEvent;

public class PanelAgregarPeliculas extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JLabel lblMuestraID;
	private JComboBox<Generos> comboBox;
	private Pelicula pelicula;
	private DefaultListModel<Pelicula> modelList;

	public PanelAgregarPeliculas() {

		setLayout(null);

		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblId.setBounds(51, 28, 46, 14);
		add(lblId);
		pelicula = new Pelicula();
		
		lblMuestraID = new JLabel(String.valueOf(pelicula.getID()));//
		lblMuestraID.setBounds(170, 28, 46, 14);
		add(lblMuestraID);

		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(51, 53, 74, 23);
		add(lblNewLabel);

		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGenero.setBounds(51, 87, 74, 17);
		add(lblGenero);

		textField = new JTextField();
		textField.setBounds(168, 56, 163, 20);
		add(textField);
		textField.setColumns(10);

		comboBox = new JComboBox<Generos>();
		comboBox.setBounds(170, 87, 163, 20);
		add(comboBox);
		comboBox.addItem(new Generos("Seleccione un genero"));
		comboBox.addItem(new Generos("Terror"));
		comboBox.addItem(new Generos("Accion"));
		comboBox.addItem(new Generos("Suspenso"));
		comboBox.addItem(new Generos("Romantica"));
		
		JButton btnAceptar = new JButton("ACEPTAR");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pelicula = new Pelicula();
				ArrayList<DefaultListModel<Pelicula>> arrList = new ArrayList<DefaultListModel<Pelicula>>();
				
				if (!textField.getText().isEmpty() && (comboBox.getSelectedIndex() != 0)) {
					
					System.out.println("pelicula.getID() "+ pelicula.getID());
					
					pelicula.setNombre(textField.getText());
					pelicula.setGeneros((Generos) comboBox.getSelectedItem());
					modelList.addElement(pelicula);
					sortModel(modelList);
					arrList.add(modelList);
					//modelList.addElement(Collections.sort(arrList));
					
					
					System.out.println("peliculas: "+ pelicula);
				} else {

					JOptionPane.showMessageDialog(null,
							"ERRO: No se agregó pelicula a la lista.\n Nombre está en blanco.\n o no seleccionó una Categoría");
				}
				textField.setText("");
				comboBox.setSelectedIndex(0);
				System.out.println("modelList"+modelList);
			}
		});
		
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAceptar.setBounds(144, 133, 116, 23);
		add(btnAceptar);
	}
	
	public void setDefaultListModel(DefaultListModel<Pelicula> listModelRecibido) {
		this.modelList = listModelRecibido;
	}
	
	@SuppressWarnings("unused")
	private void sortModel(DefaultListModel<Pelicula> model) {
		ArrayList<Pelicula> list = new ArrayList<Pelicula>();
	    for (int i = 0; i < model.size(); i++) {
	        list.add((Pelicula)model.get(i));
	    }
	    Collections.sort(list);
	    model.removeAllElements();
	    for (Pelicula s : list) {
	        model.addElement(s);
	    }
	}

}
