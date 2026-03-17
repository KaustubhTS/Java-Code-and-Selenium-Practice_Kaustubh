package Kaustubh_Programming_Practice;

public class CountNumberCharactersAndEachWord {
	static int count = 0;

	static int numberOfCharacters(String s) {
		String s1 = s.replaceAll("\\s", "");

		for (int i = 0; i < s1.length(); i++) {

			count++;
		}

		return count;
	}

	static int countNoOfWords(String s1) {

		String[] s2 = s1.split(" ");

		return s2.length;
	}
	
	
	static String subString(String s1) {

		//String sub= s1.substring(5);
		String sub=s1.substring(5,s1.length());

		return sub;
	}
	
	
	
	

	public static void main(String[] args) {

		System.out.println("Number of Characters " + numberOfCharacters("I am Kaustubh"));
		System.out.println("Number of Characters " + countNoOfWords("I am Kaustubh"));
		System.out.println("SubString " + subString("I am Kaustubh Satpudke Loves Nikita"));
	}

}
