package day4Homework3.entities;

public class Campaigns {
	int discount;
	int raise;
	String campaignName;
	
	
	public Campaigns() {
		
	}
	
	
	public Campaigns(int discount, int raise ,String campaignName) {
		this();
		this.discount = discount;
		this.raise = raise;
		this.campaignName = campaignName;
	}
		
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getRaise() {
		return raise;
	}
	public void setRaise(int raise) {
		this.raise = raise;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

}
