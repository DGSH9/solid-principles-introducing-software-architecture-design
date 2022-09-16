package com.dgsh.FollowingDependencyInversiopnPrinciple;

public class ProductCatalog {
	
	public void listALlProduct() {
		//following the dependency inversion
		ProductRepository productRepository = new Productfacory().create();
		productRepository.allNanme();		
		
	}

}
