package InterviewProgramJava;

public class RemoveJunkSpecialCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="!$@!$@ Raju @!#@!";
		
		//Use regular expression[^a-zA-Z0-9]
		
	  s=s.replaceAll("[^a-zA-Z0-9]", "");
	  
	  System.out.println(s);
		
		
		
		

	}

}
