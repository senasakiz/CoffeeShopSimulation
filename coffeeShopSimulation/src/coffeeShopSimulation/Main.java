package coffeeShopSimulation;

public class Main {

	public static void main(String[] args) {
		Customer customer=new Customer();
		customer.setId(1);
		customer.setFistName("Sena");
		customer.setLastName("Sakýz");
		customer.setTcNo("22222206682");
		
		
		CustomerManager customerManager= new CustomerManager(new JdbcCustomerDao(),new NeroCustomer());
		
		customerManager.add(customer);
		
		SalesManager salesManager=new SalesManager(new NeroCustomer());
		
		salesManager.sellCoffe(customer);
		
		CampaignManager campaignManager=new CampaignManager(new NeroCampaign(), new JdbcCampaignDao());
		
		campaignManager.addCampaign(customer);
		
		
		
		

	}

}
