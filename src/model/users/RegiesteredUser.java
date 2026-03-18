package model.users;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import service.IPostPublish;
import service.MainService; 

public abstract class RegiesteredUser extends GuestUser implements IPostPublish { //lai viss kas bija guest useram butu ari seit
	//1. mainigie
	private String username;
	private String password;

	
	
	//2. getteri
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	
	//3. setteri
	public void setUsername(String inputUsername) {
		if(inputUsername != null &&  !inputUsername.isEmpty() && inputUsername.matches("[A-Za-z0-9]{4,20}")) {
			username = inputUsername;
		}
		else {
			username = "DefaultUser";
		}
	}
	//Regex maska parolei no : https://uibakery.io/regex-library/password
	public void setPassword(String inputPassword) { //TODO parbaudit != null, not empty, masku
		if(inputPassword != null && !inputPassword.isEmpty() && inputPassword.matches("/^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$/")) {
			try {
				MessageDigest md = MessageDigest.getInstance("MD5");
				md.update(password.getBytes());
				password = md.digest().toString();
			}
			catch (Exception e) {
				password = "0000";
			}
		}
		else {
			password = "0000";
		}
		
	}
	

	//4. abi konstrutkori
	public RegiesteredUser() {
		super(); //izsaucas guestuser ezagrumenta konstruktors
		setUsername("karina.skirmante");
		setPassword("As1@aaaa");
	}
	
	public RegiesteredUser(String inputUsername, String inputPassword) {
		super();
		setUsername(inputUsername);
		setPassword(inputPassword);
	}
	
	//5. toString
	public String toString() {
		String result = id + ": " + username + " " + password;
		return result;
	}
	
	//6. parejas funkcijas
	public boolean login(String inputUsername, String inputPassword) throws NoSuchAlgorithmException {
		for(GuestUser tempU : MainService.getAllUsers()) {
			if(tempU instanceof RegiesteredUser) { //noskaidro vai lietotajs gadijuma nav registrest lietotajs
				RegiesteredUser tempRU = (RegiesteredUser) tempU;
				
				MessageDigest md = MessageDigest.getInstance("MD5");
				md.update(inputPassword.getBytes());
				String inputPasswordEncoded = md.digest().toString();
				
				
				if(tempRU.getUsername().equals(inputUsername) 
						&& tempRU.getPassword().equals(inputPasswordEncoded)) {
					return true;
				}
			}
		}
		return false;
	}
	
}
