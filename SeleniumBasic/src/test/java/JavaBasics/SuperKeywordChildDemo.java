package JavaBasics;

public class SuperKeywordChildDemo extends SuperKeywordParentDemo {

	String name = "QACLICKAKACDEMY";
	
	public SuperKeywordChildDemo(){
		
		super();//this should be always be in first line
		
		System.out.println("child class constructor");
	}

	public void getString() {

		System.out.println(name);
		System.out.println(super.name);
	}

	public void getData() {
        super.getData();
		System.out.println("Iam child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperKeywordChildDemo SKCD = new SuperKeywordChildDemo();
		SKCD.getString();
		SKCD.getData();

	}

}
