package es.certificado.tema8;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class PrincipalModelo {
	public static void main(String[] args) {
		JFrame jventana = new JFrame("Tabla de libros");
		jventana.setBounds(100, 100, 300, 200);
		jventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Modelo m = new Modelo();
		JTable jlibros = new JTable(m.getDataVector(), m.getNamesVector());
		JScrollPane js = new JScrollPane(jlibros);
		jventana.getContentPane().add(js);
		jventana.setVisible(true);
	}
}
