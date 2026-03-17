package Kaustubh_Programming_Practice;

public class KthLargest {

	static int quickSelect(int[] arr, int low, int high, int k) {
		int pivot = arr[high];
		int i = low;

		for (int j = low; j < high; j++) {
			if (arr[j] >= pivot) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
			}
		}

		int temp = arr[i];
		arr[i] = arr[high];
		arr[high] = temp;

		if (i == k - 1)
			return arr[i];
		if (i > k - 1)
			return quickSelect(arr, low, i - 1, k);
		return quickSelect(arr, i + 1, high, k);
	}

	public static void main(String[] args) {
		int[] arr = { 7, 10, 4, 3, 20, 15 };
		int k = 4;

		System.out.println(k + "rd largest element: " + quickSelect(arr, 0, arr.length - 1, k));
	}
}
