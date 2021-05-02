package InterfaceConcept;

public class IndianTraffic implements CentralTraffic,ContinentTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CentralTraffic ct = new IndianTraffic();
		
		ct.GreenGo();
	
		
		IndianTraffic it = new IndianTraffic();
		
		it.WalkOnRoads();
		it.YellowBeReady();
		
		ContinentTraffic ct1 = new IndianTraffic();
		
		ct1.TrainSymbol();
		
		

	}

	public void GreenGo() {
		// TODO Auto-generated method stub
		System.out.println("GreenGo");

	}

	public void RedStop() {
		// TODO Auto-generated method stub
		System.out.println("RedStop");

	}

	public void YellowBeReady() {
		// TODO Auto-generated method stub
		System.out.println("YellowBeReady");

	}
	//Specific methods of india
	public void WalkOnRoads() {
		// TODO Auto-generated method stub
		System.out.println("WalkOnRoads");

	}

	public void TrainSymbol() {
		// TODO Auto-generated method stub
		
		System.out.println("TrainSymbol");

		
	}

}
