package com.ssd.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ssd.user.DbConnection;



public class ProductDao {
	
	
	private Connection conn;
	private Statement stmt;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public List<ProductDto> productList(){
		
		conn=DbConnection.getCon();
		
		List<ProductDto> allProductList=new ArrayList<ProductDto>();
		
		String query="select * from products";
		
		try {
			stmt=conn.createStatement();
			
			rs=stmt.executeQuery(query);
			
			
			while(rs.next()) {
				
				//id, name, category, price, image

				
				ProductDto dto=new ProductDto(rs.getInt(1),
												rs.getString(2),
												rs.getString(3),
												rs.getDouble(4),
												rs.getString(5));
				
				
				
				allProductList.add(dto);
				
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return allProductList;
		
		
		
		
	}

}
