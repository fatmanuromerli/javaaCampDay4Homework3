package day4Homework3.concrete;


import day4Homework3.abstracts.GameService;
import day4Homework3.entities.Game;

public class GameManager implements GameService{
	@Override
	public void add(Game game) {
		System.out.println("Oyun eklendi : " + game.getGameName()+ " "+" oyun kodu : ," + game.getGameKod());
	}
	@Override
	public void update(Game game) {
		System.out.println("Oyun güncellendi : " + game.getGameName()+ " "+" oyun kodu : ," + game.getGameKod());
	}
	@Override
	public void delete(Game game) {
		System.out.println("Oyun silindi : " + game.getGameName()+ " "+" oyun kodu : ," + game.getGameKod());
	}


}
