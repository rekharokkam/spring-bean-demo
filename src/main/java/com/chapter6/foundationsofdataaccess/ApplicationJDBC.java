package com.chapter6.foundationsofdataaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ApplicationJDBC
{
	public static void main(String[] args)
	{
		Connection connection = null;
		PreparedStatement pstmt = null;
		
		try{
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice?autoReconnect=true&useSSL=false", "spring", "spring");
			
			String sql = "insert into rental_location values (?, ?, ?, ?, ?, ?, ?)";
			pstmt = connection.prepareStatement(sql);
			
			pstmt.setInt(1, 1);
			pstmt.setString(2,  "Gas Station");
			pstmt.setString(3,  "Address1");
			pstmt.setString(4,  "Address2");
			pstmt.setString(5,  "City");
			pstmt.setString(6,  "State");
			pstmt.setString(7,  "PostalCode");
			
			pstmt.execute();
		}catch (SQLException sqlException){
			sqlException.printStackTrace(System.err);
		}finally{
			try
			{
				if (null != pstmt){
					pstmt.close();
				}
				if (null != connection){
					connection.close();
				}
			} catch (SQLException e)
			{
				e.printStackTrace(System.err);
			}
		}
		
	}
}
