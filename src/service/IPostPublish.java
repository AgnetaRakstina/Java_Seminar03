package service;


import model.enums.PostType;


public interface IPostPublish { //interface class, visas funkcijas ir publiskas un abstraktas
	
	public abstract void createAndPublishPost(String inputMsg, PostType inputPostType); //pievieopt vel post page title ka string 
	
	
	
}
