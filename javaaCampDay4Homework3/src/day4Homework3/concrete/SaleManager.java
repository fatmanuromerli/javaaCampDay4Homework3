package day4Homework3.concrete;


import day4Homework3.entities.Player;
import day4Homework3.entities.Game;
import day4Homework3.abstracts.SaleService;

public class SaleManager implements SaleService{
	@Override
	public void salesAdd(Player player, Game game) {
		System.out.println("Satýþ kullanýcý tarafýndan istendi : "+player.getFirstName() +" oyun adý : ,"+  game.getGameName() + " oyun kodu : " + game.getGameKod());
		
	}
	@Override
	public void sales(Player player, Game game) {
		System.out.println("Satýþ yapýldý : "+player.getFirstName() +" oyun adý : "+  game.getGameName() + " oyun kodu : ," + game.getGameKod());
	}
	

}
