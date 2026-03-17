package Kaustubh_Programming_Practice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class firstAndLastOccuranceOfElementInArray {

	public static int[] findFirstAndLast(int[] arr, int element) {
		int first = -1;
		int last = -1;
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == element) {
				first = mid;
				high = mid - 1;
			} else if (arr[mid] < element) {
				low = mid + 1;

			} else {
				high = mid - 1;
			}
		}

		low = 0;
		high = arr.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == element) {
				last = mid;
				low = mid + 1;
			} else if (arr[mid] < element) {
				low = mid + 1;

			} else {
				high = mid - 1;
			}
		}

		return new int[] { first, last };

	}
	
	public static int[] findFirstAndLast(String str, char element) {
		
		char[] arr=str.toCharArray();
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		int first = -1;
		int last = -1;
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == element) {
				first = mid;   // java (0,3) 3/2=1  element v
				high = mid - 1;   // 
			} else if (arr[mid] < element) {
				low = mid + 1;

			} else {
				high = mid - 1;
			}
		}

		low = 0;
		high = arr.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == element) {
				last = mid;
				low = mid + 1;
			} else if (arr[mid] < element) {
				low = mid + 1;

			} else {
				high = mid - 1;
			}
		}

		return new int[] { first, last };

	}

	public static void main(String[] args) {
//		int[] array = IntStream.generate(() -> (int) (Math.random() * 100)).limit(1000000).toArray();
//		Arrays.sort(array);
//
//		System.out.println(Arrays.toString(array));
//
//		int[] output = findFirstAndLast(array, 0);
//		System.out.println("Fist and Last Index are :" + Arrays.toString(output));
		
		int[] output=findFirstAndLast("Kaustubhuuuuuuuuuu",'u');
		System.out.println("Fist and Last Index are :" + Arrays.toString(output));

	}

}
