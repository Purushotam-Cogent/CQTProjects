package com.cqt;

public class Customer {
	
	private int cid;
	private String name;
	private float sell_cost;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int cid, String name, float sell_cost) {
		super();
		this.cid = cid;
		this.name = name;
		this.sell_cost = sell_cost;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSell_cost() {
		return sell_cost;
	}

	public void setSell_cost(float sell_cost) {
		this.sell_cost = sell_cost;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", sell_cost=" + sell_cost + "]";
	}
	
	

}
