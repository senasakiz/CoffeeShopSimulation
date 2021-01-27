package coffeeShopSimulation;

public class CustomerManager implements ICustomerManager{
	

	ICustomerDao customerDao;
	CoffeeShopCustomer coffeeShopCustomer;
	Campaign campaign;
	
	public CustomerManager(ICustomerDao customerDao, CoffeeShopCustomer coffeeShopCustomer) {
		super();
		this.customerDao = customerDao;
		this.coffeeShopCustomer = coffeeShopCustomer;
	}

	@Override
	public void add(Customer customer) {
		coffeeShopCustomer.identityControl(customer);
		
		
	}

	@Override
	public void update(Customer customer) {
		customerDao.update(customer);
		
	}

	@Override
	public void delete(Customer customer) {
		customerDao.delete(customer);
		
	}

}
