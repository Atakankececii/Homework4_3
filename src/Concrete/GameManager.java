package Concrete;

import Abstract.IGameService;
import Entities.Customer;
import Entities.Game;

public class GameManager implements IGameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName()+" adl� oyun sisteme eklendi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyunun �zellikleri g�ncellendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName()+" adl� oyun sistemden silindi.");
		
	}

	@Override
	public void Sell(Game game, Customer customer) {
		System.out.println("Oyunu sat�n ald�n "+customer.getFirstName()+"\n"+"Sat�n ald���n oyunun ad�:"+game.getUnitPrice()
		+"\n"+"Oyunun �creti:"+game.getUnitPrice());
		
	}

	@Override
	public void show(Game game) {
		System.out.println("G�r�nt�lemek istedi�iniz oyununu ad�:"+game.getGameName()+"\n"
	+"Oyunun fiyat�:"+game.getUnitPrice());
		
	}

}
