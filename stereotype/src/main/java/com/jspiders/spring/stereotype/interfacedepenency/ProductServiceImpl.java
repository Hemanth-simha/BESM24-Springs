package com.jspiders.spring.stereotype.interfacedepenency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("productServiceImpl")
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private Product product;
	
	@Override
	public void displayProducts() {
		 int totalProducts= product.getProducts();
		 System.out.println("Products per page : "+totalProducts/5);
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
