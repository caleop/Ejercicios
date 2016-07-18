package es.certificado.tema8;

import java.util.*;
import java.sql.*;
import javax.swing.*;

public class Modelo {
	private Connection getConexion() {
		String driver = "com.mysql.jdbc.Driver";
		String con = "jdbc:mysql://localhost/biblios?user=userbiblios";
		Connection cn = null;
		try {
			Class.forName(driver);
			cn = DriverManager.getConnection(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cn;
	}

	public Vector getDataVector() {
		Vector libros = null;
		Connection cn = null;
		try {
			libros = new Vector();
			cn = this.getConexion();
			Statement stm = cn.createStatement();
			ResultSet rs = stm.executeQuery("Select * from libros ");
			while (rs.next()) {
				Vector aux = new Vector();
				aux.addElement(rs.getString("ISBN"));
				aux.addElement(rs.getString("Titulo"));
				aux.addElement(rs.getString("Autor"));
				aux.addElement(rs.getString("Precio"));
				libros.add(aux);
			}
			cn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return libros;
	}

	public Vector getNamesVector() {
		Vector nombres = new Vector();
		nombres.add("ISBN");
		nombres.add("Titulo");
		nombres.add("Autor");
		nombres.add("Precio");
		return nombres;
	}
}
