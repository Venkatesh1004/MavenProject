package com.practise.accountdetails.copy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class DBConnection {

	public Connection getDatabaseConnection() {
		Connection conn = null;
		try {
			ResourceBundle rs = ResourceBundle.getBundle("dbParameters");
			String driver = rs.getString("DB_DRIVER");
			String url = rs.getString("DB_URL");
			String username = rs.getString("DB_USER");
			String password = rs.getString("DB_PASSWORD");

			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {

			e.printStackTrace();
		}
		return conn;
	}
}


