package model.users;

public class GuestUser {
	//1. mainigie
	private long id;
	
	private static long counter = 1;
	
	//2. getters
	public long getId() {
		return id;
	}
	
	//3. setters
	public void setId() {
		id = counter++;
	}
	
	//4. constructors
	public GuestUser() {
		setId();
	}
	//argumenta konstrutkors saja klase nav nepieciesams jo ir tikai id ko automatiski uzstada
	
	//5. tostring
	public String toString() {
		String result = "" + id; //pieliek klat tuksu string kas automatiski partaisa so par string tipu un tad strada
		return result;
	}
	
	//6. other functions
	
	//TODO papildinat velak
}
