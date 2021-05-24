package day4Homework3.concrete;


import day4Homework3.abstracts.BaseManager;
import day4Homework3.abstracts.PlayerCheckService;
import day4Homework3.abstracts.PlayerService;
import day4Homework3.entities.Player;

public class PlayerManager extends BaseManager implements PlayerService{
	
	PlayerCheckService playerCheckService;


	public PlayerManager(PlayerCheckService playerCheckService) {
		super();
		this.playerCheckService = playerCheckService;
	}

	@Override
	public void add(Player player) {
		if (playerCheckService.checkIfRealPerson(player)) {
			super.add(player);
		}
		else
		{
			System.out.println("Baþarýsýz! Lütfen bilgilerinizi kontrol ediniz!");
		}
	}
	@Override
	public void update(Player player) {
		super.update(player);
	}
	@Override
	public void delete(Player player) {
		super.delete(player);
	}
}
