package pp;




import java.sql.*;  
class MysqlCon{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/dbTest","root","Vijay@123");  
//here sonoo is database name, root is username and password  
Statement stmt=con.createStatement();  
stmt.executeUpdate("insert into student values('a','a','a','a','a')");

ResultSet rs=stmt.executeQuery("select * from Student");  
while(rs.next())  
System.out.println(rs.getString(2)+"  "+rs.getString(3));  
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  