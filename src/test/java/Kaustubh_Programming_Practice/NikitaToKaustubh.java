package Kaustubh_Programming_Practice;

import java.util.Scanner;

public class NikitaToKaustubh {

	public static String String_Conversion() {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		str = sc.next();

		if (str.equalsIgnoreCase("Nikita")) {
			return "Kaustubh";
		} else {
			return str;
		}

	}

	public static String ReplaceNikitaInString() {
		String str1;
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the String : ");
		str1 = sc1.nextLine();

		return str1.replaceAll("Nikita", "Kaustubh");

	}

	public static void main(String[] args) {

		// System.out.println(String_Conversion());
		System.out.println(ReplaceNikitaInString());

	}

}
