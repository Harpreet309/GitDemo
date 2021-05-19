
package CoreJavaCodes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d = new Date();
		
		System.out.println(d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");
		
		SimpleDateFormat sd = new SimpleDateFormat("YYYY/MM/DD  hh:mm:ss ");
		
		System.out.println(sdf.format(d));
		
		System.out.println(sd.format(d));		
		
		
	}

}
