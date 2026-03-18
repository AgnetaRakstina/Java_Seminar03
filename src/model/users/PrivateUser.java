package model.users;

import java.util.ArrayList;

import model.Post;
import model.enums.PostType;

public class PrivateUser extends RegiesteredUser {
	
	//1. mainigie
	private ArrayList<Post> allPrivatePosts = new ArrayList<Post>();
	private ArrayList<Post> allPublicPosts = new ArrayList<Post>();
	private ArrayList<RegiesteredUser> allMyFollowers = new ArrayList<RegiesteredUser>();
	
	//2. getters
	public ArrayList<Post> getAllPrivatePosts() {
		return allPrivatePosts;
	}
	
	public ArrayList<Post> getAllPublicPosts() {
		return allPublicPosts;
	}
	
	public ArrayList<RegiesteredUser> getAllMyFollowers() {
		return allMyFollowers;
	}
	//3. setters
	//nav vajadzigi
	
	//4. abi konstruktori
	public PrivateUser() {
		super(); // tiek izsaukts regiestered user bezargumenta konstrutkors
	}
	public PrivateUser(String inputUsername, String inputPassword) {
		super(inputUsername, inputPassword); //izsauksies regiestered user 
	}
		
	//5. toString()
	public String toString() {
		String result = super.toString() + " sludinajujmi:\n-> " + allPrivatePosts + "\n ->" + allPublicPosts + ";\nSekotaji ->" + allMyFollowers;
		return result;
	}
	
	//6. citas funkcijas
	
	
	@Override
	public void createAndPublishPost(String inputMsg, PostType inputPostType) {
		//veikt input parametru parbaudi
		if(inputPostType.equals(PostType.privateType)) {
			allPrivatePosts.add(new Post(inputMsg));
		}
		else if (inputPostType.equals(PostType.publicType)) {
			allPublicPosts.add(new Post(inputMsg));
		}
	}
	
	public void followPrivateUser(RegiesteredUser inputUser) {
		//TODO veikt input parametru parbaudi
		if(!allMyFollowers.contains(inputUser)) {
			allMyFollowers.add(inputUser);
		}
	}
	

	
	
	
	
	
	
	
	
	
}
