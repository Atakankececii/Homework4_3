package Abstract;

import Entities.Customer;
import Entities.Game;

public interface IGameService extends IBaseService<Game> {
	
	void Sell(Game game,Customer customer);
	
}
