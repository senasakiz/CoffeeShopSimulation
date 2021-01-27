package coffeeShopSimulation;

public class JdbcCampaignDao implements ICampaignDao {

	@Override
	public void addCampaign(Customer customer) {
		System.out.println("Kampanya JDBC ile veritaban�na eklendi");
		
	}

	@Override
	public void updateCampaign(Customer customer) {
		System.out.println("Kampanya JDBC ile veritaban�nda g�ncellendi");
		
	}

	@Override
	public void deleteCampaign(Customer customer) {
		System.out.println("Kampanya JDBC ile veritaban�ndan silindi");
		
	}

}
