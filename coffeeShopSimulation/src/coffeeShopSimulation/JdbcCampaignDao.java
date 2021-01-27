package coffeeShopSimulation;

public class JdbcCampaignDao implements ICampaignDao {

	@Override
	public void addCampaign(Customer customer) {
		System.out.println("Kampanya JDBC ile veritabanýna eklendi");
		
	}

	@Override
	public void updateCampaign(Customer customer) {
		System.out.println("Kampanya JDBC ile veritabanýnda güncellendi");
		
	}

	@Override
	public void deleteCampaign(Customer customer) {
		System.out.println("Kampanya JDBC ile veritabanýndan silindi");
		
	}

}
