package com.mycompany.app;

import java.io.IOException;
import java.sql.*;
//import com.github.shyiko.mysql.binlog.BinaryLogClient;

public class App 
{
    public static void main( String[] args ) throws IllegalStateException, IOException
    {

       // BinaryLogClient client = new BinaryLogClient("localhost", 3306, "root", "root");
        //client.connect();
        Connection mycon;
        try {
            mycon = DriverManager.getConnection("jdbc:mysql://localhost/ix_development", "root", "root");
            
			Statement mystmt=mycon.createStatement();
			ResultSet myrs = mystmt.executeQuery("select * from account_pictures where id=3");
			while(myrs.next()) {
				System.out.println(myrs.getString("filename"));
				
			}
			System.out.print("Conexão feita");
        } catch (SQLException e) {
            System.out.print(e);
        }
        
    }
}
