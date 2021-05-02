package InterviewProgramJava;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Rajashekar";
//Using for loop method
		int len = s.length();

		String rev = "";

		for (int i = len - 1; i >= 0; i--) {

			rev = rev + s.charAt(i);

		}

		System.out.println(rev);
		
		//Using String Buffer
		
		StringBuffer sf = new StringBuffer("Selenium");
		sf.reverse();
		System.out.println(sf);
		

	}

}
