package Kaustubh_Programming_Practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class freqOf1CharAndAllChar {

	static void freqOf1Char(String s) {

		char[] c = s.toLowerCase().toCharArray();
		int count = 0;
		for (int i = 0; i < c.length; i++) {

			if (c[i] == 'a') {
				count++;

			}
		}
		System.out.println("Count of 'a' :" + count);

	}

	static void freqOfAllChar(String s) {

		HashMap<Character, Integer> map = new HashMap<>();
		List<Integer> keyList=new ArrayList<Integer>(); 

		for (char ch : s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		System.out.println("Character Frequency:");
		for (char key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
			keyList.add(map.get(key));
			
			
		}
		
		
		keyList.sort(Comparator.reverseOrder());
		System.out.println(keyList.get(0));

	}
	
	
		
	

	public static void main(String[] args) {
		//freqOf1Char("Kaustubha");
		freqOfAllChar("Kaustubhaaaaaaaa");

	}

}
