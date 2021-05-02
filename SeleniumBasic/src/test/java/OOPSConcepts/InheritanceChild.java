package OOPSConcepts;

public class InheritanceChild extends InheritanceParent {

	public void newEngine() {

		System.out.println("New Generation Engine");
	}

	public void color() {

		System.out.println(color);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InheritanceChild IC = new InheritanceChild();
		
		IC.brake();
		IC.color();
		IC.SoundSystem();
		IC.newEngine();
		
		

	}

}
