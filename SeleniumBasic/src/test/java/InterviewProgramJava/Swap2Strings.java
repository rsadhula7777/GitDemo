package InterviewProgramJava;

public class Swap2Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a ="Hello";
		String b ="World";
		
		System.out.println("Before Swapping");
		
		System.out.println(a);
		System.out.println(b);
		
		//1.Append a & b
		
		a=a+b;
		
		//2.Store initial string a in string b
		
		b=a.substring(0,a.length()-b.length());//Hello
		
		
		//3.Store initial string b in String a
		
		a=a.substring(b.length());
		
		System.out.println("The value of a & b after swap");
		
		System.out.println(a);
		System.out.println(b);

	}

}

