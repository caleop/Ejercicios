package es.certificado.tema8;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class GestionVentana extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		// obtiene el objeto donde se originó el evento
		Ventana v = (Ventana) e.getSource();
		v.dispose();
	}

}
