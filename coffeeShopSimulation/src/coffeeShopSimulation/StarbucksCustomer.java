package coffeeShopSimulation;

public class StarbucksCustomer extends CoffeeShopCustomer {

	@Override
	public void identityControl(Customer customer) {
		System.out.println("Starbucks m��terisi i�in e-devlet kontrol� yap�ld�");
		
	}

	@Override
	public void sellCoffee(Customer customer) {
		System.out.println("Starbucks m��terisi kahve sat�n ald�");
		
	}

}
