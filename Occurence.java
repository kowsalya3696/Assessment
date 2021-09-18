package Week3Assessment;

import java.util.HashMap;
import java.util.Map;

public class Occurence {
	
	public static void main(String[] args) {
		
		 String input = "Java";

		 HashMap<Character, Integer> Occurence = new HashMap<Character, Integer>();
	          char[] charArray = input.toCharArray();
	     
	      for (char c : charArray){
	         if (Occurence.containsKey(c)){
	        	 Occurence.put(c, Occurence.get(c) + 1);
	         }else{
	        	 Occurence.put(c, 1);
	         }
	      }
	 
	      for (Map.Entry value : Occurence.entrySet()){
	         System.out.println("Occurance of "+value.getKey() + " is " + value.getValue());
	      }
	   }
		  
	}
	  
	