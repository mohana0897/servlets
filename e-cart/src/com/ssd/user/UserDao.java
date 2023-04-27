package com.ssd.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDao {

	
	
	private Connection con;
	private Statement stmt;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public boolean userCreated(UserDto user) {
		
		boolean isCreated=false;
		
		con=DbConnection.getCon();
		
		try {
			ps=con.prepareStatement("insert into users (name, email, password) values (?,?,?)");
			
			if(user!=null) {
				
				UserDto dto= new UserDto();
				isCreated=true;
				
				ps.setString(1, dto.getName());
				ps.setString(2, dto.getEmail());
				ps.setString(3, dto.getPassword());
				ps.executeUpdate();
				
				
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isCreated;
		
	}
	
	public UserDto getUser(String email, String pswd) {
		
		con=DbConnection.getCon();
		String query= "select * from users where email=" + "'"+ email+ "'"+ "and password = " +"'"+pswd+ "'";
				UserDto user=null;
		
		try {
			stmt=con.createStatement();
			
			rs=stmt.executeQuery(query);
			
			while(rs.next()) {
				
				user=new UserDto(rs.getInt(1),
										rs.getString(2),
										rs.getString(3));
				
				
				
				
			}
			
			
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
		
		

		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
