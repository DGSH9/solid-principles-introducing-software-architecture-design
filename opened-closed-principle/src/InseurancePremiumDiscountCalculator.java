
public class InseurancePremiumDiscountCalculator {
	
	//not following opened closed
//	public int calculatePremiumDiscountPercent(HealthInsuranceCustomerprofile customer) {
//		if(customer.isLoyalCustomer()) {
//			return 20;
//		}
//		return 0;
//	}
//	
//	public int calculatePremiumDiscountPercent(VehicleInsuranceCustomerprofile customer) {
//		if(customer.isLoyalCustomer()) {
//			return 20;
//		}
//		return 0;
//	}
	
	//opened closed principle
	public int calculatePremiumDiscountPercent(Customerprofile customerprofile) {
		if(customerprofile.isLoyalCustomer()) {
			return 20;
		}
		return 0;
	}
	
	
	
}
