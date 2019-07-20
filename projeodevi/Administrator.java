package projeodevi;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Administrator {
	
	Date currentDate;
	Date currentDateAfter30;
	
	final private int upComingDay=30;
	
	void process(ArrayList<User> users) {
		currentDate=new Date();
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(currentDate);
		cal.add(Calendar.DATE, upComingDay); // add 30 days
		currentDateAfter30 = cal.getTime();
		
		
		for(int i=0;i<users.size();i++) {
			
			if(users.get(i).getBirth_date().after(currentDate) && users.get(i).getBirth_date().before(currentDateAfter30)) {
				//dogum gunune 30 gunden az kaldigini gosterir.
				users.get(i).getNotificationBox().add("Happy Birthday!!");
				
			}
			
		}
		

	}
	
	

}
