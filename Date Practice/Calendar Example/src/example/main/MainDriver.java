package example.main;

import java.sql.Date;
import java.util.Calendar;

public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Make calendar
		Calendar cal = Calendar.getInstance();
    	cal.set(2000, 0-1, 1);
    	cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DATE));
    	Date startDate = new Date(cal.getTimeInMillis());
    	System.out.println("Start Date: " + startDate);
    	cal.add(Calendar.MONTH, 1);
    	Date endDate = new Date(cal.getTimeInMillis());
    	System.out.println("End Date: " + endDate);
	}

}
