package CollectionFrameWork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(0, "Raju");
		hm.put(1, "Suchi");
		hm.put(2, "Thanvi");
		hm.put(3, "Veda");
		
		System.out.println(hm.get(1));
		
		hm.remove(3);
		System.out.println(hm);
		//converting into set
		Set sm=hm.entrySet();
		
		Iterator itr=sm.iterator();
		
		while(itr.hasNext()){
			
			Map.Entry mp=(Map.Entry) itr.next();
			
			//Map Entry used to display in key value format
			
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		

	}

}
