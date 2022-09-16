import java.util.Random;

public class HealthInsuranceCustomerprofile implements Customerprofile{
	public boolean isLoyalCustomer() {
		return new Random().nextBoolean();
	}
}
