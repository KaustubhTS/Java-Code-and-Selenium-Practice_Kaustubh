package Kaustubh_Programming_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateCharacters {
	

	static String  DuplicateChar(String str)
	{
		int count =0;
		char[] a=str.toCharArray();
		String result="";
		
		for (int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					result=result+a[j];
					count ++;
					break;
				}
			}
		}
		
		return result;
		
	}
	 static void removeDupCharByUsingStringBuilder(String str){
         StringBuilder s1 = new StringBuilder();
         str.chars().distinct().forEach(c->s1.append((char)c));
     System.out.println(s1);
 }
	 
	 
	
	public static void main(String[] args) {
		
		//System.out.println(DuplicateChar("helllllllllooo"));
		removeDupCharByUsingStringBuilder("helllllllllooo");
		
	}

}
