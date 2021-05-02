package OOPSConcepts;

public class MethodOverridingChild extends MethodOverridingParent  {

	
	public void SoundSystem() {

		System.out.println("New Sound System");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverridingChild MOC = new MethodOverridingChild();
		
		MOC.SoundSystem();//Method overriding - same name,same param,same signature

	}

}
