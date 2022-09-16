import java.util.Random;

public class HomeInsuranceProfile implements Customerprofile{

	public boolean isLoyalCustomer() {
		return new Random().nextBoolean();
	}

}
