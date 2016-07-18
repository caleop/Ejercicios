package es.certificado.tema8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestionBoton implements ActionListener {
	Ventana vent;

	public GestionBoton(Ventana v) {
		vent = v;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// recupera el contenido del TextField
		String s = vent.tf.getText();
		// asigna su valor al control Label
		vent.lbl.setText(s);
	}
}
