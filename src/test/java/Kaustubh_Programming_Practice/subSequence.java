package Kaustubh_Programming_Practice;

public class subSequence {

	static boolean subSequence(String s1,String s2) //s1=abc s2=adbc
	{
		for(int i=0;i<s1.length();i++)
		{
			for (int j=0;j<s2.length();j++)
			{
				if(!(s1.charAt(i)==s2.charAt(j)))
				{
					return false;
				}
			}
		}
		
		
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(subSequence("abc","aaaabcdddd"));

	}

}
