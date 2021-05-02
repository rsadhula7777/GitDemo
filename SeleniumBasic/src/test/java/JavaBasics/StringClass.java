package JavaBasics;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.String literal 2.Creating object of string
		
		String a =" RajuSelenium";//Literal - if object is already present in string pool - it wont create new one but it points to the existing one
		//String ab = new String("Raj");//By creating object - It will create forcefully since we created object for it
		
		System.out.println(a.charAt(2));
		System.out.println(a.indexOf("R"));
		System.out.println(a.substring(4,11));
		System.out.println(a.substring(4));
		System.out.println(a.concat("Raj Teaches"));
		System.out.println(a.length());
		System.out.println(a.trim());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		
		String arr[]=a.split("u");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		System.out.println(a.replace("e", "a"));

	}

}
