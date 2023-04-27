package com.ssd.service;

import java.util.List;

import com.ssd.product.ProductDao;
import com.ssd.product.ProductDto;

public class ProductService {

	ProductDao dao;
	
	public ProductService() {
		
		dao=new ProductDao();
	}
	
	public List<ProductDto> productList(){
		
		return dao.productList();
		
		
	}
	
}
