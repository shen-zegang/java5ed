package com.boda.dao;

import com.boda.domain.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDaoImpl implements CustomerDao {
	 // 添加客户方法
	public void addCustomer(Customer customer)throws SQLException{
		String sql = "INSERT INTO customers VALUES(?,?,?,?)";
		try(Connection conn = getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setInt(1, customer.id());
			pstmt.setString(2, customer.name());
			pstmt.setString(3, customer.email());
			pstmt.setDouble(4, customer.balance());
			pstmt.executeUpdate();
		}catch(SQLException se){
			se.printStackTrace();
		}	
	}
	// 修改客户方法
	public void updateCustomer(Customer customer)throws SQLException{
	   String sql = "UPDATE customers SET id =?, name=?," +
	   		         "email = ?,balance = ?";
	   try(Connection conn = getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
	   ){
			pstmt.setInt(1, customer.id());
			pstmt.setString(2, customer.name());
			pstmt.setString(3, customer.email());
			pstmt.setDouble(4, customer.balance());
			pstmt.executeUpdate();
	   }catch(SQLException se){
		  se.printStackTrace();
	   }	
	}
	// 删除客户方法
	public void deleteCustomer(int customerId)throws SQLException{
		String sql = "DELETE FROM customers WHERE id =?";
		try(Connection conn = getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setInt(1, customerId);
			pstmt.executeUpdate();
		}catch(SQLException se){
		  se.printStackTrace();
		}		
	}
	// 查询客户
	public Customer getCustomer(int customerId)throws SQLException{
		String sql = "SELECT * FROM customers WHERE id =?";
		ResultSet resultSet = null;
		Customer customer = null;
		try(Connection conn = getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setInt(1, customerId);
			resultSet = pstmt.executeQuery();
			if(resultSet.next()){
				customer = new Customer(
				  resultSet.getInt(1),resultSet.getString(2),
				  resultSet.getString(3),resultSet.getDouble(4));
			}
	   }catch(SQLException se){
		  se.printStackTrace();
	   }		
		return customer;		
   }
}

