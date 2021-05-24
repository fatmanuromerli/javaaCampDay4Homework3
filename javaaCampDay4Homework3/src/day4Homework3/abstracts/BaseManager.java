package day4Homework3.abstracts;


import day4Homework3.entities.Player;

public class BaseManager implements PlayerService{
	@Override
	public void add(Player player) {
		System.out.println("Kullan�c� eklendi : " + player.getFirstName()+ " "+player.getLastName());
	}
	@Override
	public void update(Player player) {
		System.out.println("Kullan�c� g�ncellendi : " + player.getFirstName()+ " "+player.getLastName());
	}
	@Override
	public void delete(Player player) {
		System.out.println("Kullan�c� silindi : " + player.getFirstName()+ " "+player.getLastName());
	}
	
	

}
