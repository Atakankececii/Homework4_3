package Concrete;

import Abstract.IGameService;
import Entities.Customer;
import Entities.Game;

public class GameManager implements IGameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName()+" adlý oyun sisteme eklendi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyunun özellikleri güncellendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName()+" adlý oyun sistemden silindi.");
		
	}

	@Override
	public void Sell(Game game, Customer customer) {
		System.out.println("Oyunu satýn aldýn "+customer.getFirstName()+"\n"+"Satýn aldýðýn oyunun adý:"+game.getUnitPrice()
		+"\n"+"Oyunun ücreti:"+game.getUnitPrice());
		
	}

	@Override
	public void show(Game game) {
		System.out.println("Görüntülemek istediðiniz oyununu adý:"+game.getGameName()+"\n"
	+"Oyunun fiyatý:"+game.getUnitPrice());
		
	}

}
