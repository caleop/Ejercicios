package es.certificado.tema8;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JVentanaBusqueda extends JFrame {
	
	private static final long serialVersionUID = 2965512762477310555L;
	
	JLabel lblIsbn, lblno;
	JTextField txtIsbn;
	JButton btBuscar;
	
	public JVentanaBusqueda(String titulo, int x, int y, int ancho, int alto) {
		super(titulo);
		this.setBounds(x, y, ancho, alto);
		this.getContentPane().setLayout(null);
		lblno= new JLabel("");
		lblno.setBounds(130,200,150,30);
		lblIsbn = new JLabel("Introduzca ISBN");
		lblIsbn.setBounds(80, 100, 100, 30);
		txtIsbn = new JTextField();
		txtIsbn.setBounds(200, 100, 100, 30);
		btBuscar = new JButton("Buscar");
		btBuscar.setBounds(140, 150 , 100, 30);
		btBuscar.addActionListener(new GestionBusqueda(this));
		
		this.getContentPane().add(lblno);
		this.getContentPane().add(lblIsbn);
		this.getContentPane().add(txtIsbn);
		this.getContentPane().add(btBuscar);
		this.setVisible(true);
		
	}
}
