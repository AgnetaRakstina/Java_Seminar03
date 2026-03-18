package model.users;

import java.security.MessageDigest;

public class RegiesteredUser extends GuestUser { //lai viss kas bija guest useram butu ari seit
	//1. mainigie
	private String username;
	private String password;
	private String title; //privatajam lietotajam vards un uzvards, biznesa lietotajam - kompanijas nosaukums
	
	
	
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
	//regex maska parole panemts no : 
	public void setPassword(String inputPassword) { //TODO parbaudit != null, not empty, masku
		if(inputPassword != null && !inputPassword.isEmpty() && inputPassword.matches("/^(?=.")) {
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
	
	
	//5. toString
	
	
	//6. parejas funkcijas
	
	
}
