package com.taxmanagement.DBConnect;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class DBConnect {

	public static Connection openConnection() {

		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cashflow_management","root", "root");
			return connection;
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void closeConnection(Connection con){
		
		try {
			if(con != null){
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}