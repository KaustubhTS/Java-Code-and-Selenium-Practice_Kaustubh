package Kaustubh_Programming_Practice;

import java.util.HashMap;
import java.util.Map;

public class StrFindCharOccurances {
	public static void findDuplicates_byFreqArray(String s1)
	{
		//When to Use -> 
		/*
		 * 
		 */
		System.out.println("Duplicate characters with occurrences from Str001 :" +s1);
		int freq[]=new int[256];
		//char ch;
		//a=65, A=97
		for(char ch : s1.toCharArray())
		{
			freq[ch]++;
			System.out.println("Freq ocf ch"+freq[ch]);
		}
		
		/*
		 * It uses i iteration here to count the occurrences 
		 * Using for loop char occurrences will not give the count of char occurrences
		 * 
		 * 
		 */
		for(int i=0;i<freq.length;i++)
		//for(char ch:s1.toCharArray())
		{
			if(freq[i]>0)
				System.out.println("Char : "+(char)i+" Freq : "+freq[i]);
				//System.out.println("Char : "+ch+" && Freq : "+freq[ch]);
		}
	}
	
	public void findDuplinOccurances_byArray()
	{
		/*
		 * Use - 1]Fixed size of elements 2.When good performance is required
		 */
		  String str = "abccd";//programming
	        char[] arr = str.toCharArray();

	        System.out.println("Duplicate characters with occurrences from Str002 :" +str);

	        for (int i = 0; i < arr.length; i++) {

	            // Skip already visited characters
	            if (arr[i] == '0') {
	                continue;
	            }

	            int count = 1;

	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] == arr[j]) {
	                    count++;
	                    arr[j] = '0'; // mark as visited
	                }
	            }

	            if (count > 0) {
	                System.out.println(arr[i] + " -> " + count);
	            }
	        }
	}
	
	public static void findDuplinOccurances_byHashMap()
	{
		//
		/*1.If String is Dynamic 2.Object dealing 3.Longer Strings
		 * 
		 */
		String str="Java";
		System.out.println("Duplicate characters with occurrences from Str003 :" +str);
		HashMap<Character,Integer> hmap=new HashMap<Character,Integer>() ;
		
		for(char ch: str.toCharArray())
		{
			hmap.put(ch,hmap.getOrDefault(ch,0)+1);
		}
		
		for(Map.Entry<Character, Integer> key:hmap.entrySet())
		{
			
			if(key.getValue()>1)
			{
				System.out.println("Char : "+key.getKey()+" || Value : "+key.getValue());
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java";//"Programming";
		
		//findDuplicates_byFreqArray(str);
		
	//	obj.findDuplinOccurances_byArray();
		
		findDuplinOccurances_byHashMap();
		
	}
}