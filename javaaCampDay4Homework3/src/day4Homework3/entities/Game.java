package day4Homework3.entities;

public class Game {
	private int id;
	private String gameName;
	private String gameKod;
	private double gamePrice;
	
	
	public Game() {
		
	}
	public Game(int id,String gameName,String gameKod, double gamePrice) {
		this();
		this.id = id;
		this.gameName = gameName;
		this.gameKod = gameKod;
		this.gamePrice = gamePrice;
		
	}
	public double getGamePrice() {
		return gamePrice;
	}
	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getGameKod() {
		return gameName.substring(0,4)+ id;
	}
	public void setGameKod(String gameKod) {
		this.gameKod = gameKod;
	}

}
