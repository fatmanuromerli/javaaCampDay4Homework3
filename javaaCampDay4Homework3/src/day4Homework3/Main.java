package day4Homework3;
import java.time.LocalDate;

import day4Homework3.abstracts.BaseManager;
import day4Homework3.abstracts.CampaignService;
import day4Homework3.abstracts.PlayerService;
import day4Homework3.abstracts.PlayerCheckService;
import day4Homework3.abstracts.GameService;
import day4Homework3.abstracts.SaleService;
import day4Homework3.adapters.MernisIleEdevletSimülasyonu;
import day4Homework3.concrete.CampaignManager;
import day4Homework3.concrete.GameManager;
import day4Homework3.concrete.PlayerManager;
import day4Homework3.concrete.SaleManager;
import day4Homework3.entities.Campaigns;
import day4Homework3.entities.Game;
import day4Homework3.entities.Player;
import day4Homework3.entities.Sales;




public class Main {

	public static void main(String[] args) {
		BaseManager playerManager=new PlayerManager(new MernisIleEdevletSimülasyonu());
		playerManager.add(new Player(1,"Fatmanur", "Ömerli", "686820845586",LocalDate.of(2001, 4, 23)));// gerçek tc gerekir
		
		Player player = new Player();
		player.setFirstName("Fatmanur");
		player.setLastName("Ömerli");
		
		Campaigns campaign = new Campaigns();
		campaign.setCampaignName("Bahar kampanyasý");
		campaign.setRaise(30);
		
		Game game = new Game();
		game.setGameName("valorant");
		game.setId(1);
		game.getGameKod();
		
		
		GameManager gameManager=new GameManager();
		gameManager.add(new Game(1,"valorant",game.getGameKod(),500));
		gameManager.update(new Game(1,"valorant",game.getGameKod(),500));
		
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.delete(campaign);
		
		SaleManager saleManager = new SaleManager();// bu kýsmý ayrý yazmamýn sebebi BaseManager dizisi içinde 3 kez çýktý veriyor
		saleManager.salesAdd(player, game);
		saleManager.sales(player, game);
		
		}
		
		
		
		
		


}


