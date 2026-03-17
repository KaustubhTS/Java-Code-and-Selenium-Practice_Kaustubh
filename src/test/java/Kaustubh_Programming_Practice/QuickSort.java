package Kaustubh_Programming_Practice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class QuickSort {

	public static void quickSort(int[] array, int low, int high) {
		if (low < high) { // Base condition
			int pivotIndex = partition(array, low, high);
			quickSort(array, low, pivotIndex - 1);
			quickSort(array, pivotIndex + 1, high);
		}
	}

	public static int partition(int[] array, int low, int high) {
		int pivot = array[high];
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (array[j] <= pivot) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}

		i++;
		int temp = array[i];
		array[i] = array[high];
		array[high] = temp;
		return i;
	}

	public static void main(String[] args) {
		int[] arr = IntStream.generate(() -> (int) (Math.random() * 100)).limit(100000).toArray();

		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

}