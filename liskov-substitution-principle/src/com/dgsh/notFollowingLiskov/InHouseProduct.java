package com.dgsh.notFollowingLiskov;

public class InHouseProduct extends Product{
	
	public void applyExtraDiscount() {
		discount = discount* 1.5;
	}

}
