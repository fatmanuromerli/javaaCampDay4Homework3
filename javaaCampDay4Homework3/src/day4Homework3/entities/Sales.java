package day4Homework3.entities;

public class Sales {
	private String onlineSales;
	private Player player;
	private Game game;
	
	public Sales() {}
	
	public Sales(String onlineSales,Player player,Game game) {
		super();
		this.onlineSales = onlineSales;
		this.player = player;
		this.game = game;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public String getOnlineSales() {
		return onlineSales;
	}

	public void setOnlineSales(String onlineSales) {
		this.onlineSales = onlineSales;
	}

}
