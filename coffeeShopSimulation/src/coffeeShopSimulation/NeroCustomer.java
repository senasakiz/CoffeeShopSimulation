package coffeeShopSimulation;

public class NeroCustomer extends CoffeeShopCustomer {


	@Override
	public void sellCoffee(Customer customer) {
		System.out.println("Nero m��terisi i�in kahve sat�ld�");
		
	}

	@Override
	public void identityControl(Customer customer) {
		System.out.println("Nero m��terisi i�in sms do�rulamas� yap�ld�");
		
	}

}
