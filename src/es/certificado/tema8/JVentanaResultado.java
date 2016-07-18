package es.certificado.tema8;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import es.certificado.tema7.Libro;

public class JVentanaResultado extends JFrame {
	
	private static final long serialVersionUID = -5531838508836154570L;
	
	JLabel lblIsbnResul, lblTituloResul, lblAutorResul, lblPrecioResul;
	JTextField txtIsbnResul, txtTituloResul, txtAutorResul, txtPrecioResul;
	JButton btCerrar;
	
	public JVentanaResultado(String titulo, int x, int y, int ancho, int alto, Libro lb) {
		super(titulo);
		this.setBounds(x, y, ancho, alto);
		this.getContentPane().setLayout(null);
		lblIsbnResul = new JLabel("ISBN");
		lblIsbnResul.setBounds(80, 80, 100, 30);
		lblTituloResul = new JLabel("Titulo");
		lblTituloResul.setBounds(80, 120, 100, 30);
		lblAutorResul = new JLabel("Autor");
		lblAutorResul.setBounds(80, 160, 100, 30);
		lblPrecioResul = new JLabel("Precio");
		lblPrecioResul.setBounds(80, 200, 100, 30);
		txtIsbnResul = new JTextField(lb.getIsbn());
		txtIsbnResul.setBounds(140, 80, 150, 30);
		txtTituloResul = new JTextField(lb.getTitulo());
		txtTituloResul.setBounds(140, 120, 150, 30);
		txtAutorResul = new JTextField(lb.getAutor());
		txtAutorResul.setBounds(140, 160, 150, 30);
		txtPrecioResul = new JTextField(
				String.valueOf(lb.getPrecio()));
		txtPrecioResul.setBounds(140, 200, 150, 30);
		
		
		btCerrar = new JButton("Cerrar");
		btCerrar.setBounds(110, 300, 100, 30);
		btCerrar.addActionListener(new GestionCerrar(this));
	
		
		this.getContentPane().add(lblIsbnResul);
		this.getContentPane().add(lblTituloResul);
		this.getContentPane().add(lblAutorResul);
		this.getContentPane().add(lblPrecioResul);
		this.getContentPane().add(txtIsbnResul);
		this.getContentPane().add(txtTituloResul);
		this.getContentPane().add(txtAutorResul);
		this.getContentPane().add(txtPrecioResul);
		this.getContentPane().add(btCerrar);
		this.setVisible(true);
	}
}
