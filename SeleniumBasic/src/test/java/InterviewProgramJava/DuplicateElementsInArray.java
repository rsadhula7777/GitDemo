package InterviewProgramJava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String names[] = { "java", "javascript", "ruby", "c", "java" };

		// 1.compare each element(On*n)

		for (int i = 0; i < names.length; i++) {

			for (int j = i + 1; j < names.length; j++) {

				if (names[i].equals(names[j]))
					System.out.println("Duplicate found " + names[i]);
			}
		}

		// Using HashSet(Stores unique values)-On

		Set<String> store = new HashSet<String>();
		for (String name : names) {

			if (store.add(name) == false) {

				System.out.println("Duplicate element is " + name);
			}
		}

		// HashMap(O2n)

		Map<String, Integer> storeMap = new HashMap<String, Integer>();

		for (String name : names) {

			Integer count = storeMap.get(name);
			if (count == null) {
				storeMap.put(name, 1);

			} else {
				storeMap.put(name, ++count);
			}

		}
		
		//Get the values from the hashmap object
		
		Set<Entry<String, Integer>>entrySet=storeMap.entrySet();
		
		for(Entry<String, Integer>entry:entrySet){
			
			if(entry.getValue()>1){
				System.out.println("Duplicate Element is "+entry.getKey());
			}
		}

	}

}
