package day4Homework3.adapters;

import day4Homework3.abstracts.PlayerCheckService;
import day4Homework3.entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisIleEdevletSimülasyonu implements PlayerCheckService{
	
	@Override
	public boolean checkIfRealPerson(Player player) {
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		boolean result = false;
		
		try 
		{
			result = proxy.TCKimlikNoDogrula(Long.parseLong(player.getNationalityId()),
					player.getFirstName().toUpperCase(),player.getLastName().toUpperCase(),
					player.getDateOfBirth().getYear());		
		} 
		catch (Exception e) 
		{
			System.out.println("Not a valid person");
		}
		
		return result;
	}


}
