package JavaBasics;

public class ThisKeywordDemo {
	int a = 2;

	public void getData() {

		int a = 3;

		System.out.println(a);
		//this keyword refers to current object & scope lies in class level
		System.out.println(this.a);//refers to global variable
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisKeywordDemo TKD = new ThisKeywordDemo();
		
		TKD.getData();

	}

}
