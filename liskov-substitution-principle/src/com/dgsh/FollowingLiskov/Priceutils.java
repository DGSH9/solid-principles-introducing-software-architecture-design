package com.dgsh.FollowingLiskov;

import java.util.ArrayList;
import java.util.List;

public class Priceutils {
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new InHouseProduct();
	
		List<Product> list1 = new ArrayList<Product>();
		list1.add(p1);
		list1.add(p2);
		list1.add(p3);
		
		for(Product product: list1) {

			System.out.println(product.getDiscount());
		}
	}

}
