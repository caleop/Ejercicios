package es.certificado.practica82;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JVentana extends JFrame {
	JTable jtlibros;
	JComboBox jctemas;
	public JVentana() {
		super("Tabla de libros");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.setBounds(100, 100, 450, 250);
		jtlibros = new JTable();
		JScrollPane scrollPane = new JScrollPane(jtlibros);
		Modelo m = new Modelo();
		jctemas = new JComboBox(m.getTemas());
		GestionLista gl = new GestionLista(this);
		jctemas.addItemListener(gl);
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout());
		jp.add(new JLabel("Seleccione Tema "));
		jp.add(jctemas);
		this.getContentPane().add(scrollPane, BorderLayout.CENTER);
		this.getContentPane().add(jp, BorderLayout.NORTH);
		this.setVisible(true);
	}
}
