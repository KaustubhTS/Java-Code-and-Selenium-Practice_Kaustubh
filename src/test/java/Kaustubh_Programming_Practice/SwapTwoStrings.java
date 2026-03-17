package Kaustubh_Programming_Practice;

public class SwapTwoStrings {
	
	static void swapTwoStrings(String s1,String s2)
	{
		int s1Length=s1.length();
		int s2Length=s2.length();
		String s= s1+s2;
		int sLength=s.length();
		
		String newS1=s.substring(sLength-s2Length, sLength);
		String newS2=s.substring(0, sLength-s2Length);
		
		System.out.println(newS1+" "+newS2);
		
		
	}
	

	public static void main(String[] args) {
		
		swapTwoStrings("Kau","stubh");
	}

}
