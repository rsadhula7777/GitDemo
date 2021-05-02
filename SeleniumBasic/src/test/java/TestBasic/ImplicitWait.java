package TestBasic;

public class ImplicitWait {
	//IMPLICIT
	//Wait for n number of seconds before throwing error
	//Advantage - Defining it globaly,if delcared 5 seconds & found target in 2 seconds - remaining 3 seconds will be reduced/come out of wait
    //keep on listening to DOM
	
	//Disadvantage:Performance issue not caught
	//EXPLICIT
	//Specific to object
	
	//THREAD.SLEEP
	//Holding test for some time
	
	//Explicit wait can be achieved in 2 ways
	//1.Webdriver wait
	//2.fluent wait
	//To target specific element
	
	//Adv : Wait applied on only targetted elements .So no performance issues
	//Disad:More code
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
