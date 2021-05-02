package CollectionFrameWork;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //No Duplicates
		//No sequential order
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Raj1");
		hs.add("Raj2");
		hs.add("Raj3");
		hs.add("Raj4");
		hs.add("Raj5");
		
		System.out.println(hs);
	//	hs.remove("Raj1");
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		System.out.println(hs);
		
		
		//Iterator is an interface helps to taverse each & every object present in the set
		
		Iterator<String>itr=hs.iterator();
		while(itr.hasNext()){
			
			System.out.println(itr.next());
		}
		
	}

}
