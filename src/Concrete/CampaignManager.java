package Concrete;

import Abstract.ICampaignService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class CampaignManager implements ICampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() +" adlý kampanya sisteme eklendi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName()+" adlý kampanya güncellendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName()+" adlý kampanya sistemden silindi.");
		
	}

	@Override
	public void SellWithCampaign(Campaign campaign, Game game, Customer customer) {
		System.out.println(customer.getFirstName()+" adlý kullanýcýmýz "+ campaign.getName()+" kampanyasý sayesinde almak istediðiniz "
				+ "oyunun fiyatýnda" +(campaign.getDiscountRate()*game.getUnitPrice()/100)+"liralýk bir indirim olmuþtur."+"\n");
				
		
	}

	@Override
	public void show(Campaign campaign) {
		System.out.println("Görüntülemek istediðiniz kampanyanýn adý:"+campaign.getName()+"\n"
				+"Kampanyanýn saðladýðý indirim oraný:"+campaign.getDiscountRate());
		
	}

}
