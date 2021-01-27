package coffeeShopSimulation;

public class JdbcCampaignDao implements ICampaignDao {

	@Override
	public void addCampaign(Customer customer) {
		System.out.println("Kampanya JDBC ile veritabanına eklendi");
		
	}

	@Override
	public void updateCampaign(Customer customer) {
		System.out.println("Kampanya JDBC ile veritabanında güncellendi");
		
	}

	@Override
	public void deleteCampaign(Customer customer) {
		System.out.println("Kampanya JDBC ile veritabanından silindi");
		
	}

}
