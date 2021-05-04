package Abstract;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public interface ICampaignService extends IBaseService<Campaign> {
	  	
	    void SellWithCampaign(Campaign campaign,Game game,Customer customer);
}
