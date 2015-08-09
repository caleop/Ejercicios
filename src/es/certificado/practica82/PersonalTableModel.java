package es.certificado.practica82;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.table.AbstractTableModel;

public class PersonalTableModel extends AbstractTableModel {
	ResultSet rs;

	public PersonalTableModel() {

	}

	public PersonalTableModel(ResultSet rs) {
		this.rs = rs;
	}

	public Object getValueAt(int ri, int ci) {
		Object ob = null;
		try {
			rs.absolute(ri + 1);
			ob = rs.getObject(ci + 1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ob;
	}

	public int getRowCount() {
		int total = 0;
		try {
			rs.last();
			total = rs.getRow();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return total;
	}
	
	
	public int getColumnCount() {
		int total = 0;
		try {
			ResultSetMetaData rsmd = rs.getMetaData();
			total = rsmd.getColumnCount();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return total;
	}

	public Class<?> getColumnClass(int ci) {
		Class<?> c = null;
		try {
			ResultSetMetaData rsmd = rs.getMetaData();
			String name = rsmd.getColumnClassName(ci + 1);
			c = Class.forName(name);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
	}

	public String getColumnName(int ci) {
		String name = null;
		try {
			ResultSetMetaData rsmd = rs.getMetaData();
			name = rsmd.getColumnName(ci + 1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return name;
	}

	
}
