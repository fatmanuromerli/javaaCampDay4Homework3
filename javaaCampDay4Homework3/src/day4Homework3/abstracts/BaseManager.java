package day4Homework3.abstracts;


import day4Homework3.entities.Player;

public class BaseManager implements PlayerService{
	@Override
	public void add(Player player) {
		System.out.println("Kullanıcı eklendi : " + player.getFirstName()+ " "+player.getLastName());
	}
	@Override
	public void update(Player player) {
		System.out.println("Kullanıcı güncellendi : " + player.getFirstName()+ " "+player.getLastName());
	}
	@Override
	public void delete(Player player) {
		System.out.println("Kullanıcı silindi : " + player.getFirstName()+ " "+player.getLastName());
	}
	
	

}
