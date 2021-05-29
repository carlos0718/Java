package Peliculas;

import javax.swing.JPanel;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;

public class PanelListarPeliculas extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblPeliculas;
	private JList<Pelicula> list;
	private DefaultListModel<Pelicula> modelList;

	/**
	 * Create the panel.
	 */
	public PanelListarPeliculas() {
		setLayout(null);
		
		lblPeliculas = new JLabel("Pel\u00EDculas");
		lblPeliculas.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPeliculas.setBounds(36, 121, 83, 23);
		add(lblPeliculas);
		
		list = new JList<Pelicula>();
		list.setBounds(129, 29, 273, 212);
		add(list);

	}
	
	public void setDefaultListModel(DefaultListModel<Pelicula> listModel) {
		this.modelList = listModel;
		list.setModel(this.modelList);
	}
}
