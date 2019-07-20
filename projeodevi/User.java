package projeodevi;
import java.util.ArrayList;
import java.util.Date;

public class User {
	
	private String id;
	private String name;
	private String email;
	private Date birth_date;
	ArrayList<String> notificationBox;
	ArrayList<Post> postList;
	ArrayList<String> timeLine;
	ArrayList<String> listOfFavouritePosts;
	ArrayList<Integer> followedUserList;
	String placeOfResidence;
	ArrayList<String> incomingMessageBox;
	ArrayList<String> outgoingMessageBox;
	ArrayList<String> password;
	
    public User(String id,String name, String email, Date birth_date,String placeOfResidence,ArrayList<String> password) {
    	this.password = password;
    	this.id=id;
    	this.name=name;
    	this.email=email;
    	this.birth_date=birth_date;
    	password = new ArrayList<String>();
    	notificationBox=new ArrayList<String>();
    	postList=new ArrayList<Post>();
    	timeLine=new ArrayList<String>();
    	listOfFavouritePosts=new ArrayList<String>();
    	followedUserList=new ArrayList<Integer>();
    	
    	this.placeOfResidence=placeOfResidence;
    	incomingMessageBox=new ArrayList<String>();
    	outgoingMessageBox=new ArrayList<String>();
    }
    void addUser(int id) {
    	followedUserList.add(id);
    	notificationBox.add(id+" user have been followed.");
    }
    boolean sendMessage(String message,int sendingUserId) {
    	if(followedUserList.contains(sendingUserId)) {
    		outgoingMessageBox.add(message);
    		return true;
    	}else {
    		System.out.println("You cannot send a message to that user. You should follow him/her first.");
    		return false;
    	}
    }
    boolean receiveMessage(String message) {
    	incomingMessageBox.add(message);
    	return true;
    }
    void sharePost(Post post) {
    	postList.add(post);
    }
    void ViewPosts() {
    	for(int i=0;i<postList.size();i++) {
    		System.out.println(postList.get(i).toString());
    	}
    }
    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirth_date() {
		return birth_date;
	}
	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}
	public String getPlaceOfResidence() {
		return placeOfResidence;
	}
	public void setPlaceOfResidence(String placeOfResidence) {
		this.placeOfResidence = placeOfResidence;
	}
	public ArrayList<String> getNotificationBox() {
		return notificationBox;
	}

	public void setNotificationBox(ArrayList<String> notificationBox) {
		this.notificationBox = notificationBox;
	}

	public ArrayList<Post> getPostList() {
		return postList;
	}

	public void setPostList(ArrayList<Post> postList) {
		this.postList = postList;
	}

	public ArrayList<String> getTimeLine() {
		return timeLine;
	}

	public void setTimeLine(ArrayList<String> timeLine) {
		this.timeLine = timeLine;
	}

	public ArrayList<String> getListOfFavouritePosts() {
		return listOfFavouritePosts;
	}

	public void setListOfFavouritePosts(ArrayList<String> listOfFavouritePosts) {
		this.listOfFavouritePosts = listOfFavouritePosts;
	}

	public ArrayList<Integer> getFollowedUserList() {
		return followedUserList;
	}

	public void setFollowedUserList(ArrayList<Integer> followedUserList) {
		this.followedUserList = followedUserList;
	}

	public ArrayList<String> getIncomingMessageBox() {
		return incomingMessageBox;
	}

	public void setIncomingMessageBox(ArrayList<String> incomingMessageBox) {
		this.incomingMessageBox = incomingMessageBox;
	}

	public ArrayList<String> getOutgoingMessageBox() {
		return outgoingMessageBox;
	}

	public void setOutgoingMessageBox(ArrayList<String> outgoingMessageBox) {
		this.outgoingMessageBox = outgoingMessageBox;
	}

	
	
   
    
    
    
    
    
    

}
