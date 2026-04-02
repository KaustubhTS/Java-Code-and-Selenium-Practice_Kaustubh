package Kaustubh_Programming_Practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class countOfVowelsAndConsonants {
	
	static void countOfVowelAndConsonants(String s1)
	{
		String s=s1.replaceAll("[^A-Za-z]", "");
		System.out.println(s);
		int StringLength= s.length();

        Pattern p = Pattern.compile("[aeiouAEIOU]");
        Matcher m = p.matcher(s);

        int Vcount = 0;
       
        while (m.find()) {
            Vcount++;
        }
        
        int Ccount=StringLength-Vcount;

        System.out.println("Vowel count = " + Vcount);
        System.out.println("Consonant count= "+ Ccount );
		
		
		
	}
	
	

	public static void main(String[] args) {
		countOfVowelAndConsonants("Kaustubh//");
	}

}
