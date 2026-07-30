package Kaustubh_Programming_Practice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class DuplicateCharacters1 {

	static List<Entry<Character, Integer>> duplicateChars(String s) {

		char[] characters = s.toCharArray();

		Map<Character, Integer> map = new HashMap<>();
		for (Character c : characters) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		List<Entry<Character, Integer>> list = map.entrySet().stream().filter(entry -> entry.getValue() > 1)
				.collect(Collectors.toList());

		return list;
	}

	static void duplicateChars1(String s) {
		char[] c1 = s.toCharArray();
		for (int i = 0; i < c1.length; i++) {

			// Skip already processed characters
			boolean alreadyChecked = false;
			for (int k = 0; k < i; k++) {
				if (c1[i] == c1[k]) {
					alreadyChecked = true;
					break;
				}
			}
			if (alreadyChecked)
				continue;

			for (int j = i + 1; j < c1.length; j++) {
				if (c1[i] == c1[j]) {
					System.out.print(c1[i]);
					break;
				}
			}
		}

	}

	static void duplicateCharsStream(String s) {
		s.chars().mapToObj(c -> (char) c)
		.collect(Collectors.groupingBy(c -> c, Collectors.counting())).entrySet()
				.stream().filter(e -> e.getValue() > 1).forEach(e -> System.out.println(e.getKey()));
	}
	
	
	
	
	public static void duplicateCHAR(String str)
	{
		
		char[] ch= str.toCharArray();
		
		
		for(int i =0 ;i<ch.length;i++)
		{
			
			boolean checked = false;
			for(int j =0 ;j< i;j++)
			{
				if(ch[i]==ch[j])
				{
					checked=true;
					break;
				}
				
			}
			
			for(int k=i+1;k<ch.length;k++)
			{
				
				if(ch[i]==ch[k])
				{
					System.out.print(ch[i]);
					break;
				}
			}
		}
		
		
	}
	

	public static void main(String[] args) {

		//System.out.println(duplicateChars("Kaustubhuussyyeerrtt"));
		//System.out.println("For each loop");
		//duplicateChars1("Kaustubhuussyyeerrtt");
		//System.out.println("Stream output");

		//duplicateCharsStream("Kaustubhuussyyeerrtt");
		duplicateCHAR("Kaustubh");
	}

}
