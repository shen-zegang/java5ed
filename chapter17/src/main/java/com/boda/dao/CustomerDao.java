package com.boda.dao;

import com.boda.domain.Customer;

import java.sql.SQLException;

public interface CustomerDao extends Dao {
	public void addCustomer(Customer customer)throws SQLException;
	public void updateCustomer(Customer customer)throws SQLException;
	public void deleteCustomer(int customerId)throws SQLException;
	public Customer getCustomer(int customerId)throws SQLException;
}
