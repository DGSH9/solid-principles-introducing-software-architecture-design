import java.util.Random;

public class VehicleInsuranceCustomerprofile implements Customerprofile{
	public boolean isLoyalCustomer() {
		return new Random().nextBoolean();
	}
}
