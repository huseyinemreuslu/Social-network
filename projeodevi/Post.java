package projeodevi;

import java.util.ArrayList;
import java.util.Date;

public class Post {
	
	User sharedBy;
	ArrayList<Integer> idsWhoLiked;
	Date sharedTime;
	String contentInformation;
	
	
	public User getSharedBy() {
		return sharedBy;
	}
	public void setSharedBy(User sharedBy) {
		this.sharedBy = sharedBy;
	}
	public ArrayList<Integer> getIdsWhoLiked() {
		return idsWhoLiked;
	}
	public void setIdsWhoLiked(ArrayList<Integer> idsWhoLiked) {
		this.idsWhoLiked = idsWhoLiked;
	}
	public Date getSharedTime() {
		return sharedTime;
	}
	public void setSharedTime(Date sharedTime) {
		this.sharedTime = sharedTime;
	}
	public String getContentInformation() {
		return contentInformation;
	}
	public void setContentInformation(String contentInformation) {
		this.contentInformation = contentInformation;
	}
	@Override
	public String toString() {
		return "Post [sharedBy=" + sharedBy.getId() + ", idsWhoLiked=" + idsWhoLiked.toString() + ", sharedTime=" + sharedTime
				+ ", contentInformation=" + contentInformation + "]";
	}
	
	
	

}
