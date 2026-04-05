package Hashing;

import java.util.HashMap;

public class CountOccuranceOfEachCharacter {

	public static void main(String[] args) {
		String str = "SSDRRRTTYYTYTR";
		
		HashMap<Character, Integer> occurenceMap = new HashMap<>();
		
		for(int i=0; i < str.length() ; i++) {
			
			occurenceMap.put(str.charAt(i), occurenceMap.getOrDefault(str.charAt(i),0)+1);
		}
    
		System.out.println(occurenceMap);
		
		
		//to get the highest occurrence of the Character
		
		char max = str.charAt(0);
		for(Character key : occurenceMap.keySet()) {
			if(occurenceMap.get(key) > occurenceMap.get(max)) {
				max = key;
			}
			
			
		}
		
		System.out.println(max);
	}

}
