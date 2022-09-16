package com.dgsh.FollowingDependencyInversiopnPrinciple;

public class Productfacory {
	public static ProductRepository create() {
		return new SqlProductRepository();
	}

}
