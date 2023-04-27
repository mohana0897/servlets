package com.ssd.cart;

import com.ssd.product.ProductDto;

public class CartDto extends ProductDto {
//cid, pid, quantity, userid
	
	private int cid;
	private int quantity;
	private String userid;
	
	
	
	public CartDto() {
		
	}
	
	public CartDto(int cid, int quantity, String userid) {
		super();
		this.cid = cid;
		this.quantity = quantity;
		this.userid = userid;
	}




	public int getCid() {
		return cid;
	}




	public void setCid(int cid) {
		this.cid = cid;
	}




	public int getQuantity() {
		return quantity;
	}




	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}




	public String getUserid() {
		return userid;
	}




	public void setUserid(String userid) {
		this.userid = userid;
	}




	@Override
	public String toString() {
		return "CartDto [cid=" + cid + ", quantity=" + quantity + ", userid=" + userid + "]";
	}
	
	
	
	
	
	
}
