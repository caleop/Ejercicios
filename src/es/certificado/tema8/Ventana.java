package es.certificado.tema8;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class Ventana extends Frame{
	Button bt;
	TextField tf;
	Label lbl;

	public Ventana(String titulo, int x, int y, int ancho, int alto) {
		super(titulo); // Invoca al constructor de Frame
		this.setBounds(x, y, ancho, alto); // visualiza la ventana
		this.setLayout(null);
		bt = new Button("Mostrar texto");
		bt.setBounds(150, 200, 100, 30);
		tf = new TextField();
		tf.setBounds(150, 70, 100, 30);
		lbl = new Label(".........................");
		lbl.setBounds(150, 130, 100, 30);
		//se pasa el objeto ventana al constructor 
		//de la clase que gestionará el evento ActionEvent
		GestionBoton gb = new GestionBoton(this);
		bt.addActionListener(gb);
		this.add(bt);
		this.add(tf);
		this.add(lbl);
		GestionVentana g = new GestionVentana();
		//asocia el objeto ventana con el escuchador 
		this.addWindowListener(g);
		this.setVisible(true);
	}
}
