package model.users;

import java.util.ArrayList;

import model.Page;
import model.enums.PostType;


public class BusinessUser extends RegiesteredUser{
	
	//1. mainigie
	private ArrayList<Page> allPages = new ArrayList<Page>();
	
	
	//2. getters
	public ArrayList<Page> getAllPags() {
		return allPages;
	}
	
	//3. setters
	
	
	//4. konstruktors
	public BusinessUser() {
		setId();
		setUsername("ziedi");
		setPassword("123456");
	}
	
	public BusinessUser(String inputUsername, String inputPassword) {
		super(inputUsername, inputPassword);
		
	}
	
	//to string
	public String toString() {
		return super.toString() + " -> " + allPages;
	}
	
	
	@Override
	public void createPublishPost(String inputMsg, PostType inputPostType) {
		Random rand = new random();
		allPages.get(rand.nextInt(0, allPages.size())).getAllPostsInPage().add(new Post(inputMsg));
	}
	
}
