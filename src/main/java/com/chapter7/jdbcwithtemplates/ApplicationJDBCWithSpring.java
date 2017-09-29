package com.chapter7.jdbcwithtemplates;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationJDBCWithSpring
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("applcation-context-jdbc-with-templates.xml");
		DataSource dataSource = context.getBean("dataSource", DataSource.class);
		
		Connection connection = null;
		PreparedStatement pstmt = null;
		
		try{
			//Bean for our datasource
			
			connection = dataSource.getConnection();
			
			String sql = "insert into rental_location (name, address1, address2, city, state, postal_code) values (?, ?, ?, ?, ?, ?)";
			pstmt = connection.prepareStatement(sql);
			
			pstmt.setString(1,  "Gas Station");
			pstmt.setString(2,  "Address1");
			pstmt.setString(3,  "Address2");
			pstmt.setString(4,  "City");
			pstmt.setString(5,  "State");
			pstmt.setString(6,  "PostalCode");
			
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
		
		((ClassPathXmlApplicationContext)context).close();
		
	}
}
