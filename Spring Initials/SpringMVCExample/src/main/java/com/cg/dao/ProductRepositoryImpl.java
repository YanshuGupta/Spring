package com.cg.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.beans.Product;

@Repository
public class ProductRepositoryImpl implements IProductRepository {

	List<Product> products = new ArrayList<Product>();
	public ProductRepositoryImpl() {
		products.add(new Product(100, "Apple", 20.0, 200));
		products.add(new Product(101, "Orange", 10.0, 220));
		products.add(new Product(102, "Pineapple", 50.0, 50));
		products.add(new Product(103, "Grapes", 5.0, 2000));
		products.add(new Product(104, "Banana", 8.0, 100));
	}
	public List<Product> showAll(){		
		return products;
	}

	public void addProduct(Product product) {
		products.add(product);
	}
	public void removeProduct(int productId) {
		
		Iterator<Product> itr = products.iterator();
		while(itr.hasNext()) {
			if(productId == itr.next().getId()) {
				itr.remove();
				break;
			}
		}
	}
	
	
	
}
