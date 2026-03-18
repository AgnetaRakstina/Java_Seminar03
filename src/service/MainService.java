package service;

import java.util.ArrayList;
import java.util.Arrays;

import model.enums.PostType;
import model.users.GuestUser; 
import model.users.PrivateUser; 
import model.users.RegiesteredUser;


public class MainService {
	
	private static ArrayList<GuestUser> allUsers = new ArrayList<GuestUser>();
	
	
	public static void main(String[] args) {
		
		//izveidot sarakstu prieks visiem lietotajiem
		GuestUser u1 = new GuestUser();
		allUsers.add(u1);
		
		
		//izveidot guestUser objektu un ielikt saraksta
		PrivateUser u2 = new PrivateUser();
		PrivateUser u3 = new PrivateUser("janis.berzins", "12qwAS!@");
		allUsers.addAll(Arrays.asList(u1, u2, u3));
		System.out.println(allUsers);
		
		try {
			
			if(u2.login("karina.skirmante", "123")) {
		
				u2.createAndPublishPost("Sveiciens JAVA nodarbiba", PostType.publicType);
				u2.createAndPublishPost("Man loti patik JAVA", PostType.publicType);
				u2.createAndPublishPost("Man sodien ir dzimsanas diena", PostType.privateType);
				System.out.println("==========================================");
				u2.followPrivateUser(u3);
				System.out.println(allUsers);
			}
			else {
				System.out.println("Nav pareizs lietotajvards un/vai parole");
			}
		}
		catch (Exception e) {
			
		}
		
		
		//izveidot private user divus objektus un ievietot saraksta
		
		
		
		//izveidot katram private user objektam 2 postus
		
		
		
		//izprintejam visus lietotajus
		
		
		
	}
	
	public static ArrayList<GuestUser> getAllUsers() {
		return allUsers;
	}
	
	
	
	
}
