package com.callcentermanagement.connection;

import java.sql.*;


public class DbConFactory 
{
static	Connection con=null;	
public static Connection getCon()
{   	

try{
		    
String url="jdbc:mysql://localhost:3306/call_centre_management";
		    
String username="root";
		    
String password="";
			
Class.forName("com.mysql.jdbc.Driver");
			
con=DriverManager.getConnection(url,username,password);
			
System.out.println("Connection Established");
		
}
		
catch(ClassNotFoundException e){
			
System.out.println(e);
		
}
catch(SQLException a){
	System.out.println(a);
}
		
return con;
}
}




