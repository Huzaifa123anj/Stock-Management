package com.huzaifa.data;
import java.sql.*;

import com.huzaifa.model.User;

public class UserDAOImpl implements UserDAO
{

	@Override
	public void addUser(User user) throws Exception {

		Connection con=null;
		PreparedStatement ps=null;
		
		try {
		   con=ConnectionFactory.getCon();	
		   ps=con.prepareStatement("insert users values(?,?,?,?,?,?)");
		   ps.setString(1, user.getUserId());
		   ps.setString(2, user.getPassword());
		   ps.setString(3, user.getFirstName());
		   ps.setString(4, user.getLastName());
		   ps.setString(5, user.getAddress());
		   ps.setString(6, user.getCity());
		   
		   ps.executeUpdate();
		}
		finally {
			con.close();
		}
	}

	@Override
	public User getUser(String userId) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		User user;
		//it only used to select query
		ResultSet rs=null;
		try
		{
			con=ConnectionFactory.getCon();	
			ps=con.prepareStatement("select * from users where user_id=?");
			ps.setString(1,userId);
			rs=ps.executeQuery();
			
			if(rs.next()) {
				String password=rs.getString(2);
				String firstName=rs.getString(3);
				String lastName=rs.getString(4);
				String address=rs.getString(5);
				String city=rs.getString(6);
				user= new User(userId, password, firstName, lastName, address, city);
				
			}
			else {
				throw new Exception("Invalid User Id");
			}
		}
		finally
		{
			con.close();
		}
		return user;
	}
     
}
