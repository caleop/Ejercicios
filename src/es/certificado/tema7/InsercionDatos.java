package es.certificado.tema7;

import java.sql.Statement;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsercionDatos {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String pwd = bf.readLine();
		String user = bf.readLine();
		String dir = bf.readLine();
		String tel = bf.readLine();

		try {
			Connection cn;
			Statement st;
			Class.forName("com.mysql.jdbc.Driver"); // Implicito a partir de Java 6
			cn = DriverManager.getConnection("jdbc:mysql://localhost/tienda?user=root&password=admin");
			st = cn.createStatement();
			String tsql;
			tsql = "Insert into clientes values('";
			tsql += pwd + "','" + user + "','" + dir + "','" + tel + "')";
			st.execute(tsql);
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
