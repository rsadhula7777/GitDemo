package CollectionFrameWork;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Accept duplicate values
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Raj1");
		al.add("Raj2");
		al.add("Raj4");
		al.add("Raj5");
		System.out.println(al);
		al.add(0, "Raj3");
		System.out.println(al);
		
		al.remove(1);
		System.out.println(al);
		
		//al.removeAll(al);
		al.get(1);
		System.out.println(al.get(1));
		
		System.out.println(al.contains("test"));
		
		
		System.out.println(al.indexOf("Raj2"));
		
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		
		

	}

}
