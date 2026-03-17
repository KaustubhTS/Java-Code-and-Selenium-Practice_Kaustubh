package Kaustubh_Programming_Practice;

public class MaxSumOfWindowInArray {

	public static int maxSum(int[] arr, int k) {

		int windowSum = 0; 

		// Step 1: Calculate sum of first window
		for (int i = 0; i < k; i++) {
			windowSum += arr[i];
		}
		int maxS=0;
		int maxSum = windowSum; // initialize with first window sum

		// Step 2: Slide the window
		for (int i = k; i < arr.length; i++) {
			windowSum = windowSum + arr[i] - arr[i - k];

//			if (windowSum > maxSum) {
//				maxSum = windowSum;
//			}
			
			 maxS=Math.max(maxSum, windowSum);
		}

		return maxS;
	}

	public static void main(String[] args) {
		int[] array = { 3, 2, 1, 5, -1, -4, -6 };
		System.out.println(maxSum(array, 5));
	}
}
