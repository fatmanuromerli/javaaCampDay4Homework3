package day4Homework3.concrete;


import day4Homework3.entities.Player;
import day4Homework3.entities.Game;
import day4Homework3.abstracts.SaleService;

public class SaleManager implements SaleService{
	@Override
	public void salesAdd(Player player, Game game) {
		System.out.println("Sat�� kullan�c� taraf�ndan istendi : "+player.getFirstName() +" oyun ad� : ,"+  game.getGameName() + " oyun kodu : " + game.getGameKod());
		
	}
	@Override
	public void sales(Player player, Game game) {
		System.out.println("Sat�� yap�ld� : "+player.getFirstName() +" oyun ad� : "+  game.getGameName() + " oyun kodu : ," + game.getGameKod());
	}
	

}
