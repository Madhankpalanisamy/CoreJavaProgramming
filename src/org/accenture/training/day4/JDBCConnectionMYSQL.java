package org.accenture.training.day4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;



public class JDBCConnectionMYSQL {

	public static void main(String[] args) throws SQLException {
		System.out.println("MYSQL JDBC Connection");
		
		try {
			//Load the driver class
			Class.forName("com.mysql.jdbc.Driver");
			//Class.forName("com.mysql.jdbc.driver.OracleDriver"); //Orcle
			} 
			catch (ClassNotFoundException drcls) {
			System.out.println("Driver Class Not Connected : "+drcls);
			
		}
		
		System.out.println("Mysql JDBC Driver Connected");
		//Connection Object Creation : Variable
		Connection con=null;
		try {
			//Connection Object Creation
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/madhanDb","root","1996");
			//"jdbc:orcle:thin:@localhost:3306/madhanDb","roor","1996"
			
			/*Statement cstatement = con.createStatement();
			ResultSet eQuery = cstatement.executeQuery("select * from employee");
			while (eQuery.next()) {
				System.out.println(eQuery.getString(1));
				System.out.println(eQuery.getString(2));
				System.out.println(eQuery.getInt(3));
				System.out.println(eQuery.getInt(4));
			}*/
			
			
			System.out.println("Preapre Statement");
			
			PreparedStatement pst = con.prepareStatement("INSERT INTO employee VALUES(?,?,?,?)");
			pst.setString(1, "Venkatesh");
			pst.setString(2, "Kumar");
			pst.setInt(3, 5);
			pst.setInt(4, 25000);
			
			int executeUpdate = pst.executeUpdate();
			System.out.println("Record Inserted Successfully :: "+executeUpdate);
	
		} 
		
			catch (SQLException se) {
			System.out.println("Connection Not Established :: Failed" +se);
			} 
		
		if (con!=null) {
		System.out.println("Connection Established Finally : Super Weldone!!!");
		
		
			
		}else {
			System.out.println("Still Connection Not Established : Your Bad");
			
			
		}
		
		con.close();
	}

}
