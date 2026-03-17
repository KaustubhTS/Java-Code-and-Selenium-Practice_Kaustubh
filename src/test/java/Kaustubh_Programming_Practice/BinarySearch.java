package Kaustubh_Programming_Practice;

import java.util.Arrays;

public class BinarySearch {

	public static int binarySearch(int[] arr, int element) {
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == element) {
				return mid;
			} else if (arr[mid] < element) {
				low = mid + 1;

			} else {
				high = mid - 1;
			}
		}
		return -1;

	}

	public static int binarySearchCharacters(String str, char element) {

		char[] arr = str.toCharArray();

		System.out.println("Original String :" + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("String after Sorting : " + Arrays.toString(arr));
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == element) {

				return mid;

			} else if (arr[mid] < element) {
				low = mid + 1;

			} else {
				high = mid - 1;
			}
		}
		return -1;

	}

	public static void main(String[] args) {



		int outputChar = binarySearchCharacters("Kaustubhuuuuuuuuuu", 'u');

		if (outputChar == -1) {
			System.out.println("Element not present");
		} else {
			System.out.println("Element is present at Index : " + outputChar);
		}

	}

}
