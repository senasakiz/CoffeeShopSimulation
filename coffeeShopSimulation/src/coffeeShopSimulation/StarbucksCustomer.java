package coffeeShopSimulation;

public class StarbucksCustomer extends CoffeeShopCustomer {

	@Override
	public void identityControl(Customer customer) {
		System.out.println("Starbucks müþterisi için e-devlet kontrolü yapýldý");
		
	}

	@Override
	public void sellCoffee(Customer customer) {
		System.out.println("Starbucks müþterisi kahve satýn aldý");
		
	}

}
