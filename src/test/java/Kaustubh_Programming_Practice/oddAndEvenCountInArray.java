package Kaustubh_Programming_Practice;

public class oddAndEvenCountInArray {

	static void oddEvenCount(int[] arr) {
		int evenCount = 0;
		int oddCount = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		System.out.println("Even Number Count : " + evenCount);
		System.out.println("Odd Number Count : " + oddCount);
	}

	public static void main(String[] args) {

		int[] arr = { 10, 25, 30, 47, 50, 65, 80, 99 };
		oddEvenCount(arr);
	}

}
