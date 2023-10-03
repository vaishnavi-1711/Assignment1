package com.ts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
       Class.forName("com.mysql.cj.jdbc.Driver");
       String url="jdbc:mysql://localhost:3306/student";
       String username="root";
       String password="1812";
      Connection connection = DriverManager.getConnection(url,username,password);
       Statement  st =  connection.createStatement();
       ResultSet rs = st.executeQuery("SELECT * FROM student");
     //  ResultSet rs = st.executeQuery("select * from student where roll_no=3");
       while(rs.next()) {
    	   System.out.println(rs.getInt("roll_no")+" "+rs.getString("name")+" "+rs.getString("address"));
       }
      connection.close();
    }
}
