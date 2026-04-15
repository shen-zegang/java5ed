package com.boda.dao;

import com.boda.domain.Product;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDaoImpl implements ProductDao {
	 // 添加商品方法
   public void addProduct(Product product) throws SQLException{
		var sql = "INSERT INTO products VALUES(?,?,?,?,?)";
		try(var conn = getConnection();
			var pstmt = conn.prepareStatement(sql)){
			pstmt.setInt(1, product.id());
			pstmt.setString(2, product.pname());
			pstmt.setString(3, product.brand());
			pstmt.setDouble(4, product.price());
			pstmt.setInt(5, product.stock());
			pstmt.executeUpdate();
		}catch(SQLException se){
			se.printStackTrace();
		}
  }
	// 修改商品方法
	public void updateProduct(Product product) throws SQLException{
	   var sql = "UPDATE products SET id =?, pname=?," +
	   		         "brand = ?,price = ?,stock=?";
	   try(var conn = getConnection();
			var pstmt = conn.prepareStatement(sql);
	   ){
			pstmt.setInt(1, product.id());
			pstmt.setString(2, product.pname());
			pstmt.setString(3, product.brand());
			pstmt.setDouble(4, product.price());
			pstmt.setInt(5, product.stock());
			pstmt.executeUpdate();
	   }catch(SQLException se){
		  se.printStackTrace();
	   }
	}   
	// 删除商品方法
  public void deleteProduct(int productId)throws SQLException{
		var sql = "DELETE FROM products WHERE id =?";
		try(var conn = getConnection();
			var pstmt = conn.prepareStatement(sql)){
			pstmt.setInt(1, productId);
			pstmt.executeUpdate();
	   }catch(SQLException se){
		  se.printStackTrace();
	   }		
	}
	// 查询商品方法
	public Product findProduct(int productId)throws SQLException{
		var sql = "SELECT * FROM products WHERE id =?";
		ResultSet resultSet = null;
		Product product = null;
		try(var conn = getConnection();
				var pstmt = conn.prepareStatement(sql)){
			pstmt.setInt(1, productId);
			resultSet = pstmt.executeQuery();
			if(resultSet.next()){
			   product = new Product(
				  resultSet.getInt(1),resultSet.getString(2),
				  resultSet.getString(3),resultSet.getDouble(4),
				  resultSet.getInt(5));
			}
	   }catch(SQLException se){
		  se.printStackTrace();
	   }		
		return product;
	}
	// 查询所有商品方法
	public ArrayList<Product> findAllProduct()throws SQLException{
		var sql = "SELECT * FROM products";
		ResultSet resultSet = null;
		var products = new ArrayList<Product>();
		Product product = null;
		try(var conn = getConnection();
				var pstmt = conn.prepareStatement(sql)){
			resultSet = pstmt.executeQuery();
			while(resultSet.next()){
			   product = new Product(
				   resultSet.getInt(1),resultSet.getString(2),
				   resultSet.getString(3),resultSet.getDouble(4),
				   resultSet.getInt(5));
			   products.add(product);
			}
	   }catch(SQLException se){
		  se.printStackTrace();
	   }	
		return products;
	}
}

