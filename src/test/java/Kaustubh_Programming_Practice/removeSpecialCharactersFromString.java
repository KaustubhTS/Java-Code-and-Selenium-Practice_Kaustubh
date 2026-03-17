package Kaustubh_Programming_Practice;

public class removeSpecialCharactersFromString {

	
	static void removeSpecialCharacters(String s)
	{
		String s1= s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
		
	}
	
	
	public static void main(String[] args) {
		removeSpecialCharacters("kaustubh@*@*&^%$");

	}

}
