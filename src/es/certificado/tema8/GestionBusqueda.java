package es.certificado.tema8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import es.certificado.tema7.Libro;

public class GestionBusqueda implements ActionListener{
	private JVentanaBusqueda vb;
	
	public GestionBusqueda(JVentanaBusqueda v) {
		vb = v;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		AccesoDatosLibro ac = new AccesoDatosLibro("biblios");
		Libro lb = ac.getLibro(vb.txtIsbn.getText());
		
		if (lb != null) {
			vb.lblno.setText("");
			JVentanaResultado vr = 
				new JVentanaResultado("Resultado de la búsqueda", 500, 80, 400, 500, lb);
			vr.setVisible(true);
		} else {
			vb.lblno.setText("Libro no encontrado");
		}
	}

}
