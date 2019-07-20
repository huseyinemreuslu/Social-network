package projeodevi;


public class Message {
	
	private String id;
    private User sender;
    private User receiver;
    private String contentInformation;

    public Message(String id,User sender, User receiver, String contentInformation) {
       this.id=id;
       this.sender=sender;
       this.receiver=receiver;
       this.contentInformation=contentInformation;
     }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public User getReceiver() {
		return receiver;
	}

	public void setReceiver(User receiver) {
		this.receiver = receiver;
	}

	public String getContentInformation() {
		return contentInformation;
	}

	public void setContentInformation(String contentInformation) {
		this.contentInformation = contentInformation;
	}
    
    
}