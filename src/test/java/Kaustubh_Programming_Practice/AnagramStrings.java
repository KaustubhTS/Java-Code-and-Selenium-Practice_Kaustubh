package Kaustubh_Programming_Practice;

import java.util.Arrays;

public class AnagramStrings {
	
	static boolean anagrams(String s,String s1)
	{
		char [] a =s.toLowerCase().toCharArray();
		char [] b =s1.toLowerCase().toCharArray();
		
		
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		
		
		
		return Arrays.equals(a, b);
	}

	public static void main(String[] args) {
		
		System.out.println(anagrams("Listen", "silent"));

	}

}
