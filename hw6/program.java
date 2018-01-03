package hw6;
import java.sql.*;


public class program {
	public static void SQLError (Exception e)   //Our function for handling SQL errors
	 {
		System.out.println("ORACLE error detected:");
		e.printStackTrace();	
	 }
	
	 public static void main (String args[])  //The main function
	 {
		 try { 
			  //connection 
			  String driverName = "oracle.jdbc.driver.OracleDriver";	
			  Class.forName(driverName);
			  
		       System.out.println("Connecting   to Oracle...");  

		       String url = "jdbc:oracle:thin:@apollo.ite.gmu.edu:1521:ite10g";
		       Connection conn = DriverManager.getConnection(url,"bdang4","Spring2017");

		       System.out.println("Connected!");
		 
	       	conn.close();  // Close our connection.
		 }
	      catch (Exception e) {SQLError(e);} //if any error occurred in the try..catch block, call the SQLError function

	 }
}
