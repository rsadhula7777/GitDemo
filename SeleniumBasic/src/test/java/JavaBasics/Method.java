package JavaBasics;

public class Method {
	
	public void getData(){
		
		System.out.println("Iam in Method");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Objects - are instances/references of the class
		Method m = new Method();
		//new creates memory
		//m is reference
		//Method left is return type 
		//Method right is classname
		m.getData();
		Class2 c2 = new Class2();
		c2.setData();

	}

}
