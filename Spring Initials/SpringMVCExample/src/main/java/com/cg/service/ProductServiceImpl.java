package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.beans.Product;
import com.cg.dao.IProductRepository;

@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	IProductRepository productRepository;
	
	public List<Product> showAll() {
		
		return productRepository.showAll();
	}

	public void addProduct(Product product) {
		
		productRepository.addProduct(product);
	}

	public void removeProduct(int productId) {
		
		productRepository.removeProduct(productId);
	}
	
}
