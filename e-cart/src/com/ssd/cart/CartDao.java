package com.ssd.cart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ssd.user.DbConnection;

public class CartDao {

	private Connection conn;
	private Statement stmt;
	private PreparedStatement ps;
	private ResultSet rs;

	public List<CartDto> getAllCartProducts(List<CartDto> oldlist) {

		conn = DbConnection.getCon();

		List<CartDto> productsInCartList = new ArrayList<CartDto>();

		for (CartDto dto : oldlist) {

			String query = "select * from cart where id=" + dto.getId();

			try {
				stmt = conn.createStatement();

				rs = stmt.executeQuery(query);

				while (rs.next()) {

					CartDto dto1 = new CartDto();

					// id, name, category, price, image

					dto1.setId(rs.getInt(1));
					dto1.setName(rs.getString(2));
					dto1.setCategory(rs.getString(3));
					dto1.setQuantity(dto.getQuantity());
					double price = dto.getQuantity() * rs.getDouble(4);

					dto1.setPrice(price);

					
					productsInCartList.add(dto1);
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return productsInCartList;

	}

}
