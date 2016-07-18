package es.certificado.tema7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DatosLibro {
	String dsn;

	public DatosLibro(String dsn) {
		this.dsn = dsn;
	}

	
	public Connection getConexion() {
		Connection cn = null;

		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost/" + dsn + "?user=userbiblios");
			 
			
			
		} catch (SQLException e) {
		
			System.out.println("estado: " + e.getSQLState());
			System.out.println("codigo de error:" + e.getErrorCode());
			e.printStackTrace();
	
		} finally {
			return cn;
		}		
	}
	
	public boolean existe(String isbn) {
		Connection cn = getConexion();
		Statement st = null;
		ResultSet rs = null;
		boolean estado = false;
		
		try {
			st = cn.createStatement();
			String sql = "select isbn from libros where isbn = '" + isbn + "'";
			rs = st.executeQuery(sql);
			
			if (rs.next()) {
				estado = true;
			}
			cn.close();
		} catch (SQLException e) {
			System.out.println("estado: "+ e.getSQLState());
			System.out.println("codigo de error:"+ e.getErrorCode());
			e.printStackTrace();
		} finally {
			return estado;
		}
		
	}
	
	public Libro getLibro(String isbn) {
		Connection cn = getConexion();
		Statement st = null;
		ResultSet rs = null;
		Libro libro = null;
		
		try {
			st = cn.createStatement();
			String sql = "select * from libros where isbn = '" + isbn + "'";
			rs = st.executeQuery(sql);
			
			if (rs.next()) {
				libro = new Libro();
				libro.setIsbn(rs.getString("ISBN"));
				libro.setTitulo(rs.getString("Titulo"));
				libro.setAutor(rs.getString("Autor"));
				libro.setPrecio(rs.getFloat("Precio"));
			}
			
			cn.close();
		} catch (SQLException e) {
			System.out.println("estado: " + e.getSQLState());
			System.out.println("codigo de error: " + e.getErrorCode());
			e.printStackTrace();
		} finally {
			return libro;
		}
	}
}
