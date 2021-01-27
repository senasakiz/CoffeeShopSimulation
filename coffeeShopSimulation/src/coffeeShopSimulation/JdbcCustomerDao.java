package coffeeShopSimulation;

public class JdbcCustomerDao implements ICustomerDao {

	@Override
	public void add(Customer customer) {
		System.out.println("Müþteri sisteme JDBC ile eklendi.");
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Müþteri veritabanýnda JDBC ile güncellendi  .");
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Müþteri sistemden JDBC ile silindi.");
		
	}

}
