package es.certificado.tema7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BuscaDatos {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("Introduzca el usuario: ");
		String user = bf.readLine();
		System.out.println("Introduzca la password: ");
		String pw = bf.readLine();
		try {
			Connection cn;
			Statement st;
			ResultSet rs;
			Class.forName("com.mysql.jdbc.Driver"); // Implicito a partir de Java 6
			cn = DriverManager.getConnection("jdbc:mysql://localhost/tienda?user=root&password=admin");
			st = cn.createStatement();
			String tsql;
			tsql = "select user, password from clientes ";
			tsql += "where user='" + user;
			tsql += "' and password='" + pw +"'";
			rs = st.executeQuery(tsql);
			
			if (rs.next()) {
				System.out.println("Usuario válido");
			} else {
				System.out.println("Usuario no válido");
			}
			
			cn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("estado: "+e.getSQLState());
			System.out.println("código de error: "+
					e.getErrorCode());
			e.printStackTrace();
		}
	}
}
