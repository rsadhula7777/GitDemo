package InterviewProgramJava;

public class SwapTwoVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=5;
		int y=10;
		
		/*int z;
		
		z=x;
		x=y;
		y=z;
		System.out.println(x);
		System.out.println(y);*/
		
		//Without using third variable(+ operator)
		
		/*x=x+y;//15
		y=x-y;//5
		x=x-y;//10
		System.out.println(x);
		System.out.println(y);*/
		
		//Without using third variable(* operator)
		
		x=x*y;
		y=x/y;
		x=x/y;
		
		System.out.println(x);
		System.out.println(y);

	}

}
