package coffeeShopSimulation;

public class SalesManager implements ISalesManager {
	

	CoffeeShopCustomer coffeeShopCustomer;
	
	public SalesManager(CoffeeShopCustomer coffeeShopCustomer) {
		super();
		this.coffeeShopCustomer = coffeeShopCustomer;
	}

	@Override
	public void sellCoffe(Customer customer) {
		coffeeShopCustomer.sellCoffee(customer);
		
	}

}
