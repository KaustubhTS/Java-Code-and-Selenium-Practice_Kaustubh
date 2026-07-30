package Kaustubh_Programming_Practice;

public class patternProg {

	public static void straightPatternStart() {

		for (int i = 10; i >= 1; i--) {

			// spaces
			for (int k = 1; k <= 10 - i; k++) {
				System.out.print(" ");
			}

			for (int j = 1; j < i; j++)

			{
				System.out.print("*");

			}
			System.out.println();

		}

	}

	public static void main(String[] args) {
		straightPatternStart();

	}

}
