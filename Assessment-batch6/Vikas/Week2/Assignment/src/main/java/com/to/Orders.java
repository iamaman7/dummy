package com.to;

public class Orders {

	private String oid;
	private String items;
	private String price;
	
	
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Orders(String oid, String items, String price) {
		super();
		this.oid = oid;
		this.items = items;
		this.price = price;
	}
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
	
	
}
