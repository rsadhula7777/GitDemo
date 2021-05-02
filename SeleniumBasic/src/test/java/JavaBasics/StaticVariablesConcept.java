package JavaBasics;

public class StaticVariablesConcept {

	// Instance variables
	String name;
	String address;
	static String city; // class variables
	static int i;
    //STATIC BLOCK
	static {

		city = "Bangalore";
		i = 0;

	}

	StaticVariablesConcept(String name, String address) { // local
															// varilabes
		// assigning local var to instance var
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);

	}

	public void getAddress() {

		System.out.println(address + " " + city);
	}

	public static void getCity() {
		// Static method only accept static variable
		System.out.println(city);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticVariablesConcept SVC = new StaticVariablesConcept("Raj", "BTM");
		StaticVariablesConcept SVC1 = new StaticVariablesConcept("Raj1", "BTM1");
		SVC.getAddress();
		SVC1.getAddress();
		StaticVariablesConcept.getCity();
	}

}
