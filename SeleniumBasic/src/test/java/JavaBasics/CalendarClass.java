package JavaBasics;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		System.out.println(sdf1.format(cal.getTime()));

		System.out.println(cal.get(Calendar.DAY_OF_MONTH));

	}

}
