package InterviewProgramJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		findDuplicateWords("Hey java is java best language is java");

	}

	public static void findDuplicateWords(String inputString){
		
		//Split
		String []words=inputString.split(" ");
		
		//Create hashmap
		
		Map<String,Integer>wcount = new HashMap<String,Integer>();
		
		//To check each word in given array
		
		for(String word:words){
			
			//if word is present :
			
			if(wcount.containsKey(word)){
				wcount.put(word.toLowerCase(), wcount.get(word)+1);
			}else{
				wcount.put(word, 1);
				
			}
				
		}
		
		//Extracting all keys of map - wordCount
		
		Set<String>wordsInString=wcount.keySet();
		
		//LOOp through all the words in wordcount
		for(String word:wordsInString){
			if (wcount.get(word)>1){
				System.out.println(word + " : "+ wcount.get(word));
			}
		}
		
	}
}
