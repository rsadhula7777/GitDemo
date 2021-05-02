package InterviewProgramJava;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=12345;
		//using algo
		int rev=0;
		
		while(num!=0){
			
			rev=rev*10 + num % 10;
			num =num/10;
		}
		
		System.out.println(rev);
		
		//using string buffer
		int num1=54321;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		
		

	}

}
