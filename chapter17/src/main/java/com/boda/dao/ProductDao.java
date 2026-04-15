package com.boda.dao;

import com.boda.domain.Product;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ProductDao extends Dao {
	public void addProduct(Product product) throws SQLException;

	public void updateProduct(Product product) throws SQLException;

	public void deleteProduct(int productId) throws SQLException;

	public Product findProduct(int productId) throws SQLException;

	public ArrayList<Product> findAllProduct() throws SQLException;
}
