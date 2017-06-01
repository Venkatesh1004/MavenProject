package com.practise.accountdetails.copy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

public class DB {
	public String getPassword(String uname) {

		Connection conn = null;
		String password = null;

		try {
			DBConnection dbconn = new DBConnection();
			conn = dbconn.getDatabaseConnection();
			PreparedStatement pstmt = conn.prepareStatement("select * from user where user_name=? ");
			pstmt.setString(1, uname);
			
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()){
				password = rs.getString("user_password");
			}

		} catch (Exception e) {
			e.printStackTrace();

		}
		return password;

	}

}
