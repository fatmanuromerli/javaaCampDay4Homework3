package day4Homework3.abstracts;


import day4Homework3.entities.Player;

public class BaseManager implements PlayerService{
	@Override
	public void add(Player player) {
		System.out.println("Kullanýcý eklendi : " + player.getFirstName()+ " "+player.getLastName());
	}
	@Override
	public void update(Player player) {
		System.out.println("Kullanýcý güncellendi : " + player.getFirstName()+ " "+player.getLastName());
	}
	@Override
	public void delete(Player player) {
		System.out.println("Kullanýcý silindi : " + player.getFirstName()+ " "+player.getLastName());
	}
	
	

}
