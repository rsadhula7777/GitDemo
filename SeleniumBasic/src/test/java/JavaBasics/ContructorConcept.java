package JavaBasics;

public class ContructorConcept {
	
	public ContructorConcept(){
		
		System.out.println("Iam Constructor");
	}
	
	public void getData(){
		
		System.out.println("Iam Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Constructor - Executes block of code when object is created
		//Name of contructor is same as class name
		//Will not return any value
		//Compliler will call default(implicit) constructor if you dont define constructor
		
		ContructorConcept CC = new ContructorConcept();
		
	}

}
