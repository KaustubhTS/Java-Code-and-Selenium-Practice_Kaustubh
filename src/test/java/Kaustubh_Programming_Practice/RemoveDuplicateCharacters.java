package Kaustubh_Programming_Practice;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateCharacters {
	
	
	static Set<Character> RemoveDuplicateCharacters (String str)
	{
		char[] ch=str.toCharArray();
		
		List<Character> l=new ArrayList<Character> ();
		for(char c: ch)
		{
			l.add(c);
		}
		
		System.out.println("Original Value: " + l);
		
		Set <Character> set=new LinkedHashSet<Character> (); 
		for (char c : ch) {
            set.add(c);   
        }
		
		
		
		
		return set;
	}
	
	

	public static void main(String[] args) {
		System.out.println("Duplicates Removed: "+RemoveDuplicateCharacters("Kaustubh"));

	}

}
