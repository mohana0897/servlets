package com.ssd.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssd.product.ProductDto;
import com.ssd.service.ProductService;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/productservlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	List<ProductDto> productList=new ArrayList<ProductDto>();
	
	ProductService ps=new ProductService();
	
	productList=ps.productList();
	
	request.getSession().setAttribute("productList", productList);
	
	request.getRequestDispatcher("landing.jsp");
	}

}
