package com.dgsh.FollowingDependencyInversiopnPrinciple;

import java.util.Arrays;
import java.util.List;

public class SqlProductRepository implements ProductRepository{
	
	public List<String> allNanme(){
		return Arrays.asList("Durgesh","Rohan");
	}
}
