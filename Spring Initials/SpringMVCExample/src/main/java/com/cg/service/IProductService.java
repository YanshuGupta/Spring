package com.cg.service;

import java.util.List;

import com.cg.beans.Product;

public interface IProductService {

	List<Product> showAll();

	void addProduct(Product product);

	void removeProduct(int productId);
}