package pp;

import java.sql.DriverManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import com.sun.jndi.ldap.Connection;


public class kk {
	public Connection getConnection(
            String host, 
            String port, 
            String user, 
            String password) throws SQLException {
          return DriverManager.getConnection("jdbc:oracle:thin:@" + host + ":" + port + "/XE", user, password);
    }
   
    public static void main(String[] args) throws SQLException {
        // Establish a JDBC connection
        //
    	System.out.println("testtttt");
        Connection c = new kk().getConnection(
                "localhost",
                "1521",
                "system",
                "system");
        // Execute a query
        //
        Statement stmt =  c.createStatement();
       //  stmt.executeUpdate();
         stmt.executeUpdate("insert into student(name,rollno)values('qggggggkk','qutt')");
         System.out.println("yes");
         System.out.println("jkhgff");
        
        // Process and print the query results
        //
        
    }
}
    