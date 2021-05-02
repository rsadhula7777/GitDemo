package JavaBasics;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		
		System.out.println(sdf.format(date));
		System.out.println(sdf1.format(date));
		System.out.println(date.toString());
		
		
		
		
		

	}

}
