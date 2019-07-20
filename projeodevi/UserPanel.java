package projeodevi;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class UserPanel {
	public static void main(String[] args) {
		
		Date date = new Date();
		ArrayList<User> users = new ArrayList<User>();
		
		User user1 = new User("Waqa","Emre","emreuslureal@gmail.com",date,"Manisa");
		User user2 = new User("gugukkusu","Selma","selmacetin@gmail.com",date,"Bursa");
		User user4 = new User("kelasd","Günok","Mgunok@gmail.com",date,"Manisa");
		User user5 = new User("tursucuk","mustafa","mresat@hotmail.com",date,"Iðdýr");
		User user6 = new User("fpoes","Kaya","kayabeyd@gmail.com",date,"Manisa");
		User user8 = new User("zeplinnn","Sasha","sashanolan@gmail.com",date,"Moscow");
		
		users.add(user1);
		users.add(user2);
		users.add(user4);
		users.add(user5);
		//users.add(user6);
		//users.add(user8);
		
		user1.receiveMessage("hello world");
		

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Your username: "+user1.getId());
		for(int i ;i)
		System.out.println("Welcome "+user1.getId()+" , please choose a operation which you want;");
		int op = 0 ;
		while(op != -1) {
			System.out.println("1. Show inbox");
			System.out.println("2. Show outbox");
			System.out.println("3. Send message");
			System.out.println("4. Share post");
			System.out.println("5. Show timeline");
			System.out.println("6. Show contact list");
			System.out.println("7. Show Notification");
			System.out.println("8. Follow people");
			System.out.print("(Exit for press -1)Your choice: ");
			op = scan.nextInt();
			switch(op) {
			    
			        case 1:
			    	     System.out.println("*INBOX*");
			    	     System.out.println(user1.incomingMessageBox.toString());
			        	 
			        	break;
			        	
			        case 2:
			        	System.out.println("*OUTBOX");
			        	System.out.println(user1.getOutgoingMessageBox().toString());
			            break;
			            
			        case 3:
			        	String gir;
			        	System.out.println("Send Message");
			        	System.out.println("Choose the person whom you want to send message;");
			        	for(int i=0;i<users.size();i++) {
			        		System.out.println(i+". "+users.get(i));
			        	}
			        	System.out.println("Your choice: ");
			        	int choices = scan.nextInt();
			        	switch(choices) {
			        	 	case 1:
			        	 		System.out.println("Enter your message: ");
			        	 		gir = scan.next();
			        	 		user1.sendMessage(gir,user2.hashCode());
			        	 		break;
			        	 	case 2:
			        	 		System.out.println("Enter your message: ");
			        	 		gir = scan.next();
			        	 		user1.sendMessage(gir,user4.hashCode());
			        	 		break;
			        	 	case 3:
			        	 		System.out.println("Enter your message: ");
			        	 		gir = scan.next();
			        	 		user1.sendMessage(gir,user5.hashCode());
			        	
			        	}
			        	
			        	//user1.sendMessage(message, sendingUserId)
			        	
			        	break;
			        	
			        case 4:
			        	
			        	System.out.println("Share post");
			        	
			        	Post post = new Post();
			        	post.setSharedBy(user1);
			        	post.setSharedTime(new Date());
			        	post.setContentInformation("Bugun komik bir olay basima geldi");

			        	user1.sharePost(post);
			        	
			        	break;
			        	
			        case 5:
			        	System.out.println("*Timeline*");
			        	System.out.println(user1.getTimeLine().toString());
			        	
			        	break;
			        	
			        case 6:
			        	System.out.println("*Contact List");
			        	
			        	
			        	
			        	break;
			        	
			        case 7:
			        	System.out.println("*Notification*");
			        	System.out.println(user1.getNotificationBox().toString());
			        	
			        	break;
			        	
			        case 8:
			        	System.out.println("*Follow People*");
			        	//System.out.println(user1.followedUserList.toString);
			        	System.out.println("1. "+user2.getId());
			        	System.out.println("2. "+user4.getId());
			        	System.out.println("3. "+user5.getId());
			        	
			        	
			        	break;
			    	default:
			    		if(op != -1) {
			    		System.out.println("No Match exist from operation");
			    		}
			    		
			    		break;
			    	
			}
			System.out.println("**************\n\n\n\n\n");
			
		}
		
		
		
		Administrator admin = new Administrator();
		admin.process(users);

	}

}



