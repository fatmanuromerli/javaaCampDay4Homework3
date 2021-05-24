package day4Homework3.concrete;

import day4Homework3.abstracts.CampaignService;
import day4Homework3.entities.Campaigns;

public class CampaignManager  implements CampaignService{
	@Override
	public void add(Campaigns campaigns) {
		System.out.println("Kampanya eklendi : " + campaigns.getCampaignName()+ " "+ campaigns.getDiscount());
	}
	@Override
	public void update(Campaigns campaigns) {
		System.out.println("Kampanya güncellendi : " + campaigns.getCampaignName()+ " "+ campaigns.getDiscount());
	}
	@Override
	public void delete(Campaigns campaigns) {
		System.out.println("Kampanya silindi : " + campaigns.getCampaignName()+" "+ campaigns.getDiscount());
	}

}
