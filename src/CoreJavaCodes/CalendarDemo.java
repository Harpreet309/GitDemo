package CoreJavaCodes;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY/DD/MM");
		System.out.println(sdf.format(cal.getTime()));
		System.out.println(cal.DECEMBER);
		System.out.println(cal.after(sdf.format(cal.getTime())));

	}

}
