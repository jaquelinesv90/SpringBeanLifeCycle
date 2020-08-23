package com.model;

import java.math.BigDecimal;
   
public class Product {
	 
	private String name;
	private BigDecimal totalValue;
	
	public Product() {}
	
	public Product(String name,BigDecimal totalValue) {
		super();
		this.name = name;
		this.totalValue = totalValue;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(BigDecimal totalValue) {
		this.totalValue = totalValue;
	}
	
}
