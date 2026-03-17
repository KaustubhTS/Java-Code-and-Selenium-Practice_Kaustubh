package Kaustubh_Programming_Practice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SortingArray {

	public static void main(String[] args) {
		int[] arr = IntStream.generate(() -> (int) (Math.random() * 100)).limit(100000).toArray();

		// Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}

		System.out.println(Arrays.toString(arr));

	}

}
