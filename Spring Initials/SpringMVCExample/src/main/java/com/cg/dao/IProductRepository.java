package com.cg.dao;

import java.util.List;

import com.cg.beans.Product;

public interface IProductRepository {

	List<Product> showAll();
	
	void addProduct(Product product);

	void removeProduct(int productId);

}