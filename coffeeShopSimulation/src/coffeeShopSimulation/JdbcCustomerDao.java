package coffeeShopSimulation;

public class JdbcCustomerDao implements ICustomerDao {

	@Override
	public void add(Customer customer) {
		System.out.println("M��teri sisteme JDBC ile eklendi.");
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("M��teri veritaban�nda JDBC ile g�ncellendi  .");
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("M��teri sistemden JDBC ile silindi.");
		
	}

}
