package Kaustubh_Programming_Practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class checkStringContainsOnlyNumbers {

	
	static boolean onlyNumbers(String s)
	{
		
		Pattern p = Pattern.compile("[^0-10]");
        Matcher m = p.matcher(s);

        int count = 0;
       
        while (m.find()) {
            count++;
        }
        
        if(count>=1)
        {
        	return false;
        }
        else 
        	return true;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(onlyNumbers("K"));
	}

}
