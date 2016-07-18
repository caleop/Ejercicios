package es.certificado.tema8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JGestionBoton implements ActionListener{
	JVentana jvent;
	
	public JGestionBoton(JVentana v) {
		jvent = v;
	}

	@Override
	public void actionPerformed(ActionEvent paramActionEvent) {
		String s = jvent.tf.getText();
		jvent.lbl.setText(s);
		
	}
	
}
