package coffeeShopSimulation;

public class CampaignManager implements ICampaignManager {
	Campaign campaign;
	ICampaignDao campaignDao;
	
	public CampaignManager(Campaign campaign, ICampaignDao campaignDao) {
		super();
		this.campaign = campaign;
		this.campaignDao = campaignDao;
	}
	
	
	@Override
	public void addCampaign(Customer customer) {
		campaign.campaignAdd(customer);
		
	}
	@Override
	public void updateCampaign(Customer customer) {
		campaignDao.updateCampaign(customer);
		
	}
	@Override
	public void deleteCampaign(Customer customer) {
		campaignDao.deleteCampaign(customer);
		
	}

}
