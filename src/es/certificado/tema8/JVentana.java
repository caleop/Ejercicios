package es.certificado.tema8;

import java.awt.GridLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class JVentana extends JFrame{
	JButton bt;
	JTextField tf;
	JLabel lbl;
	
	public JVentana(String titulo, int x, int y, int ancho, int alto) {
		super(titulo);
		this.setBounds(x, y, ancho, alto);
		this.setLayout(new GridLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		/*bt = new JButton("Mostrar texto");
		bt.setBounds(150, 200, 130, 30);
		tf = new JTextField();
		tf.setBounds(150, 70, 100, 30);
		lbl = new JLabel("..................");
		lbl.setBounds(150, 130, 100, 30);
		JGestionBoton gb = new JGestionBoton(this);
		bt.addActionListener(gb);
		this.getContentPane().add(bt);
		this.getContentPane().add(tf);
		this.getContentPane().add(lbl);*/
		JPanel panel = new JPanel();
		panel.setLayout(null); 
		DefaultListModel dl = new DefaultListModel();
		dl.addElement("lunes");
		dl.addElement("martes");
		dl.addElement("miércoles");
		dl.addElement("jueves");
		dl.addElement("viernes");
		dl.addElement("sábado");
		dl.addElement("domingo");
		JList dias = new JList(dl);
		dias.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION); 
		JScrollPane jp = new JScrollPane(dias);
		jp.setBounds(10,30,200,110); 
		panel.add(jp);
		this.add(panel);
		this.setVisible(true);
	}
}
