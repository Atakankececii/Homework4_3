package Concrete;

import Abstract.ICampaignService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class CampaignManager implements ICampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() +" adl� kampanya sisteme eklendi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName()+" adl� kampanya g�ncellendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName()+" adl� kampanya sistemden silindi.");
		
	}

	@Override
	public void SellWithCampaign(Campaign campaign, Game game, Customer customer) {
		System.out.println(customer.getFirstName()+" adl� kullan�c�m�z "+ campaign.getName()+" kampanyas� sayesinde almak istedi�iniz "
				+ "oyunun fiyat�nda" +(campaign.getDiscountRate()*game.getUnitPrice()/100)+"liral�k bir indirim olmu�tur."+"\n");
				
		
	}

	@Override
	public void show(Campaign campaign) {
		System.out.println("G�r�nt�lemek istedi�iniz kampanyan�n ad�:"+campaign.getName()+"\n"
				+"Kampanyan�n sa�lad��� indirim oran�:"+campaign.getDiscountRate());
		
	}

}
