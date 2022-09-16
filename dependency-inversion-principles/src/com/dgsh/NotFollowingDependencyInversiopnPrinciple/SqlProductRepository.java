package com.dgsh.NotFollowingDependencyInversiopnPrinciple;

import java.util.Arrays;
import java.util.List;

public class SqlProductRepository {
	
	public List<String> allNanme(){
		return Arrays.asList("Durgesh","Rohan");
	}
}
