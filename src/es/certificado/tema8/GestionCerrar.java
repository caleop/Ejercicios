package es.certificado.tema8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestionCerrar implements ActionListener{
	private JVentanaResultado vr;
	public GestionCerrar(JVentanaResultado v) {
		vr = v;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		vr.dispose();
	}
}
