package Kaustubh_Programming_Practice;

public class ReplaceString {
	
	static String replace(String s)
	{
		
		String s2= s.replaceAll("Nikita", "Nikita Ganvir");
		
		return s2;
		
	}

	public static void main(String[] args) {
		System.out.println(replace(" Kaustubh and Nikita"));

	}

}
