package com.cqt.service;

import java.util.ArrayList;

import com.cqt.dto.Customer;

public interface CustomerService {

	public int save(Customer cobj);
	public int update(Customer cobj);
	public int delete(int id);
	public Customer findById(int id);
	public ArrayList<Customer> findAll();

}
