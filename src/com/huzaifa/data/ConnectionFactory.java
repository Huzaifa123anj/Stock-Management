package com.huzaifa.data;
import java.sql.*;
public class ConnectionFactory {
	public static Connection getCon() throws Exception
	{
		Connection con = null;
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stockmanagment","root","root");
		return con;
	}

}
