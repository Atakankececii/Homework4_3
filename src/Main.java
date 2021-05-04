import java.time.LocalDate;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.CustomerManager;
import Concrete.GameManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer(1,"Atakan","Keçeci","123456789",LocalDate.of(1999,1,18));
		Game game1 = new Game(1,"Battlefield 1",189);
		Campaign campaign1 = new Campaign(1,"Anneler günü indirimi",20);
		
		CustomerManager customerManager = new CustomerManager(new MernisServiceAdapter());
		GameManager gameManager = new GameManager();
		CampaignManager campaignManager = new CampaignManager();
		//customerManager.add(customer1);
		//customerManager.delete(customer1);
		//customerManager.update(customer1);
		
		
		gameManager.Sell(game1, customer1);
		
		campaignManager.SellWithCampaign(campaign1, game1, customer1);
		
		
		
		
		
		
	}

}
