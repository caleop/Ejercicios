package es.certificado.tema8;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
public class Manejador implements ListSelectionListener {
	//JVentana es la subclase JFrame donde se encuentra 
	//el objeto JList 
	JVentana vent;
	public Manejador(JVentana vent) {
		this.vent = vent;
		}
	public void valueChanged(ListSelectionEvent e) {
		String texto;
		//jl es la referencia al objeto JList
		//definido como dato miembro en JVentana 
		//texto = vent.d.getSelectedValue().toString();
		//jlbl es la referencia al objeto JLabel
		//definido como dato miembro en JVentana 
		//vent.jlbl.setText(texto); 
	}
}