package OOPSConcepts;

public class MethodOverloading {
//Argument type should be different
	//Data type should be different
	public void test1() {

		System.out.println();
	}

	public void test2(int a) {

		System.out.println(a);
	}

	public void test3(int a, int b) {

		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading MO = new MethodOverloading();
		
		MO.test1();
		MO.test2(10);
		MO.test3(5, 7);

	}

}
