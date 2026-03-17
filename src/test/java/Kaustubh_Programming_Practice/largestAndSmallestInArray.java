package Kaustubh_Programming_Practice;

public class largestAndSmallestInArray {

	static void largestAndSmallest(int[] arr) {
		int smallest = arr[0];
		int largest = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
			if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		System.out.println(smallest);
		System.out.println(largest);

	}

	public static void main(String[] args) {

		int[] array = { 0, 9, 8, 2 };
		largestAndSmallest(array);

	}

}
