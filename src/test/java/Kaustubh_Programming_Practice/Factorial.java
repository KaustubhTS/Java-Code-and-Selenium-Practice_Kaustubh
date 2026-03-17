package Kaustubh_Programming_Practice;

public class Factorial {

	public static int factOfNumber(int num) {
		if (num == 0) {
			return 1;
		}

		else
			return num*(factOfNumber(num - 1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factOfNumber(5));

	}

}
