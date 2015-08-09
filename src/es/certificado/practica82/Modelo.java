package es.certificado.practica82;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

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
	
	public ResultSet getResultSetScrollable(int idTema) {
		ResultSet rs = null;
		Connection cn = null;
		 try {
			cn = this.getConexion();
			Statement smt;
			smt = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
									ResultSet.CONCUR_READ_ONLY);
			String sql = "select ISBN, Titulo, Autor, Precio from libros "
					+ "where IdTema = " + idTema;
			rs = smt.executeQuery(sql);
					 									
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs; 
	}
	
	public Vector getTemas() {
		Vector temas = null;
		Connection cn = null;
		try {
			temas = new Vector();
			temas.add(new Tema(-1, "---Seleccionar tema---"));
			cn = this.getConexion();
			Statement stm = cn.createStatement();
			ResultSet rs = stm.executeQuery("select * from temas ");
			while (rs.next()) {
				temas.add(new Tema(rs.getInt("IdTema"), rs.getString("Tema")));
			}
			cn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return temas;
	}
}
