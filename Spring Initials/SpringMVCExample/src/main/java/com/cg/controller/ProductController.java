package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.beans.Product;
import com.cg.service.IProductService;

@Controller
public class ProductController {
	
	@Autowired
	IProductService productService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		List<Product> products = productService.showAll();
		model.addAttribute("products", products);
		return "show_all";
	}
	
	@RequestMapping(value="/addP", method=RequestMethod.GET)
	public String addP(Model model) {
		return "add_product";
	}
	
	@RequestMapping(value="/addProduct", method=RequestMethod.POST)
	public String addProduct(Product product) {
		productService.addProduct(product);
		return "redirect:/";
	}
	
	@RequestMapping(value="/remove/{productId}", method=RequestMethod.POST)
	public String removeProduct(@PathVariable int productId) {
		productService.removeProduct(productId);
		return "redirect:/";
	}
	
}
