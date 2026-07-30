package Kaustubh_Programming_Practice;

public class shiftZerosToRight {

	// [1,0,3,0,5,0,7]
	// [1,3,5,7,0,0,0]

	public static void shiftZeros(int[] arr) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

				j++;
			}

		}

		for (int num : arr) {
			System.out.print(num + " ");
		}

	}

	public static void main(String[] args) {

		int[] arr = { 1, 0, 3, 0, 5, 0, 7 };

		shiftZeros(arr);
	}

}
