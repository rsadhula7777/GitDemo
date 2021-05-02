package OOPSConcepts;

public class ChildEmirates extends ParentClassAbstractionConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildEmirates ce = new ChildEmirates();
		ce.bodyColor();
		ce.engine();
		ce.safetyGuidelines();
		//ParentClassAbstractionConcept pcac = new ParentClassAbstractionConcept();
		//We cannot create object for class which is marked as abstract
	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		
	System.out.println("Green color on body");
		
	}

}
