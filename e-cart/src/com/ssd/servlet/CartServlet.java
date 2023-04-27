package com.ssd.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssd.cart.CartDto;

/**
 * Servlet implementation class CartServlet
 */
@WebServlet("/add-to-cart")
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CartServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
	

		List<CartDto> cartList =(List<CartDto>) request.getSession().getAttribute("oldlist");

		
		String id = request.getParameter("id");

		int Id = Integer.parseInt(id);

		if (cartList != null && cartList.size() > 0) {

			for (CartDto dto : cartList) {

				if (dto.getId() == Id) {

					response.sendRedirect("cartAlreadyExist.jsp");
					return;

				}

				CartDto dto1 = new CartDto();

				dto1.setId(Id);
				dto1.setQuantity(1);
				cartList.add(dto1);

			}

		} else {

			CartDto dto1 = new CartDto();

			dto1.setId(Id);
			dto1.setQuantity(1);
			cartList.add(dto1);

		}
		
		request.getSession().setAttribute("oldlist", cartList);

	}

}
