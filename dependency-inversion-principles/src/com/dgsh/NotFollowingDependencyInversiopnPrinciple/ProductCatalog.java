package com.dgsh.NotFollowingDependencyInversiopnPrinciple;

public class ProductCatalog {
	
	public void listALlProduct() {
		//Directly depend
		SqlProductRepository sqlProductRepository = new SqlProductRepository();
		sqlProductRepository.allNanme();
		
	}

}
