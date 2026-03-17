package model;

import java.time.LocalDateTime;

public class Post {
	
	//1. mainigie
	private String msg;
	private LocalDateTime datetime = LocalDateTime.now();
	private int countOfLikes = 0; // TODO parveidot uz sarakstu ar registretiem lietotajiem kas bus atzimejusi patik
	//2. getter
	public String getMsg() {
		return msg;
	}
	public LocalDateTime getDateTime() {
		return datetime;
	}
	public int getCountOfLikes() {
		return countOfLikes;
	}
	//3. setter
	public void setMsg(String inputMsg) {
		if((inputMsg != null) && (!inputMsg.isEmpty()) && (inputMsg.length()<1000)) {
			msg = inputMsg;
		}
		else {
			msg = "Unknown post";
		}
	}
	
	public void setDateTime() {
		datetime = LocalDateTime.now();
	}
	
	public void incrementCountOfLikes() {
		countOfLikes++;
	}
	//4. abi konstruktori
	public Post() { //noklusejuma
		setMsg("Sveiciens");
		//ta ka datetime mainigiais ir inicializets uz date time -locakdatetime.now tad nav jataisa set
		//nav jataisa set count of likes jo vienmer sak ar 0
	}
	
	public Post(String inputMsg) {    //argumenta konstruktors
		setMsg(inputMsg);
		//nav vajazigs
		//nav vajadzigs
	}
	//5. toString
	public String toString() {
		String result = msg + " (" + datetime + "), " + countOfLikes + " patik iezimes.";
		return result;
	}
	
	
	//6.citas funkcijas
	
	
	
	
	
}
