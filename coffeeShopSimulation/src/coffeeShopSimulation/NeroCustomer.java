package coffeeShopSimulation;

public class NeroCustomer extends CoffeeShopCustomer {


	@Override
	public void sellCoffee(Customer customer) {
		System.out.println("Nero müþterisi için kahve satýldý");
		
	}

	@Override
	public void identityControl(Customer customer) {
		System.out.println("Nero müþterisi için sms doðrulamasý yapýldý");
		
	}

}
