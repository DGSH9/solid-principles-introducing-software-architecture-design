package com.dgsh.FollowingInterfaceSegregation.InterfaceImpl;

import com.dgsh.FollowingInterfaceSegregation.Interface.IFax;
import com.dgsh.FollowingInterfaceSegregation.Interface.IPrint;
import com.dgsh.FollowingInterfaceSegregation.Interface.Iscan;

public class XeroxWorkCentre implements IPrint,Iscan,IFax{

	@Override
	public void print() {
		// real print code start...end
		
	}

	@Override
	public void getPriintSpoolDetails() {
		// real printSpoolDetail code start...end
		
	}

	@Override
	public void scan() {
		// real scan code start...end
		
	}

	@Override
	public void scanPhoto() {
		// real scanPhoto code start...end
		
	}

	@Override
	public void fax() {
		// real fax code start...end
		
	}

	@Override
	public void internetFax() {
		// real internetFax code start...end
		
	}

}
