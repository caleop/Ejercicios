package es.certificado.practica82;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class GestionLista implements ItemListener{
	JVentana jv;
	public GestionLista(JVentana v) {
		jv = v;
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		PersonalTableModel pt;
		Modelo m = new Modelo();
		Tema t = (Tema) jv.jctemas.getSelectedItem();
		pt = new PersonalTableModel(
				m.getResultSetScrollable(t.getIdTema()));
		this.jv.jtlibros.setModel(pt);
		
		
	}
}
