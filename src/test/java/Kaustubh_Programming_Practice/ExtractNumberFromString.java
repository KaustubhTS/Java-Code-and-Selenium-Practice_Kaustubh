package Kaustubh_Programming_Practice;

public class ExtractNumberFromString {

	static void extractNumber(String s) {

		String[] numbers = s.split("\\D+");
		int sum = 0;

		for (String num : numbers) {

			if (!num.isEmpty()) {
				System.out.print(num);

			}

		}

	}

	static void extractNumber01(String s) {

		String a = s.replaceAll("[^0-9]", "");
		System.out.println(a);

		int b = Integer.parseInt(a);

		System.out.println(b);

	}

	public static void main(String[] args) {

		extractNumber01("Kaustubh1234kN12@@$$123");
	}

}
