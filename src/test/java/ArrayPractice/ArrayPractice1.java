package ArrayPractice;

import java.util.*;

//adding this comment to practice git commit and push from eclipse. 
//This is a simple Java class with various array manipulation methods that are commonly asked in coding interviews.
//Each method is designed to solve a specific problem, and the main method demonstrates how to use them with example arrays.
public class ArrayPractice1 {

	public static void main(String[] args) {
		// Examples / quick demos for each interview problem
		int[] arr1 = {1, 2, 3, 4, 5};
		System.out.print("Original arr1: "); printArray(arr1);
		reverseInPlace(arr1);
		System.out.print("Reversed arr1: "); printArray(arr1);

		int[] arr2 = {3, 5, 2, 9, 1, 9};
		int[] mm = findMaxMin(arr2);
		System.out.println("arr2 max=" + mm[0] + ", min=" + mm[1]);

		int[] arr3 = {1, 2, 4, 5, 6}; // missing 3 from 1..6
		System.out.println("Missing number (1..n) in arr3: " + findMissingNumber(arr3, 6));

		int[] arr4 = {1, 2, 3, 2, 4, 5, 1};
		System.out.println("Duplicates in arr4: " + findDuplicates(arr4));

		int[] arr5 = {2, 7, 11, 15};
		int target = 9;
		int[] tw = twoSumIndices(arr5, target);
		System.out.println("Two-sum indices for target " + target + ": " + Arrays.toString(tw));

		int[] arr6 = {1, 2, 3, 4, 5};
		rotateRight(arr6, 2);
		System.out.print("Rotate right by 2: "); printArray(arr6);

		int[] arr7 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		System.out.println("Max subarray sum (Kadane) of arr7: " + kadaneMaxSubarray(arr7));

		int[] a = {1,3,5};
		int[] b = {2,4,6,8};
		int[] merged = mergeSortedArrays(a, b);
		System.out.print("Merged sorted arrays: "); printArray(merged);
	}

	// Utility: print an array
	private static void printArray(int[] arr) {
		if (arr == null) {
			System.out.println("null");
			return;
		}
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
		}
		System.out.println("]");
	}

	// 1) Reverse an array in-place
	public static void reverseInPlace(int[] arr) {
		if (arr == null) return;
		int i = 0, j = arr.length - 1;
		while (i < j) {
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
			i++; j--;
		}
	}

	// 2) Find max and min in one pass. Returns int[]{max, min}. If empty, returns null.
	public static int[] findMaxMin(int[] arr) {
		if (arr == null || arr.length == 0) return null;
		int max = arr[0], min = arr[0];
		for (int v : arr) {
			if (v > max) max = v;
			if (v < min) min = v;
		}
		return new int[]{max, min};
	}

	// 3) Find missing number from 1..n when array contains n-1 distinct numbers
	public static int findMissingNumber(int[] arr, int n) {
		if (arr == null) return -1;
		long expected = (long) n * (n + 1) / 2;
		long actual = 0;
		for (int v : arr) actual += v;
		long miss = expected - actual;
		return (miss <= 0 || miss > n) ? -1 : (int) miss;
	}

	// 4) Find duplicates (any value appearing more than once)
	public static Set<Integer> findDuplicates(int[] arr) {
		Set<Integer> seen = new HashSet<>();
		Set<Integer> dup = new LinkedHashSet<>();
		if (arr == null) return dup;
		for (int v : arr) {
			if (!seen.add(v)) dup.add(v);
		}
		return dup;
	}

	// 5) Two Sum: return indices of two numbers that add up to target, or {-1,-1}
	public static int[] twoSumIndices(int[] arr, int target) {
		if (arr == null) return new int[]{-1, -1};
		Map<Integer, Integer> map = new HashMap<>(); // value -> index
		for (int i = 0; i < arr.length; i++) {
			int complement = target - arr[i];
			if (map.containsKey(complement)) {
				return new int[]{map.get(complement), i};
			}
			map.put(arr[i], i);
		}
		return new int[]{-1, -1};
	}

	// 6) Rotate array right by k (in-place)
	public static void rotateRight(int[] arr, int k) {
		if (arr == null || arr.length == 0) return;
		k = k % arr.length;
		if (k < 0) k += arr.length;
		reverseRange(arr, 0, arr.length - 1);
		reverseRange(arr, 0, k - 1);
		reverseRange(arr, k, arr.length - 1);
	}

	private static void reverseRange(int[] arr, int i, int j) {
		while (i < j) {
			int tmp = arr[i]; arr[i] = arr[j]; arr[j] = tmp; i++; j--;
		}
	}

	// 7) Kadane's algorithm: maximum subarray sum
	public static int kadaneMaxSubarray(int[] arr) {
		if (arr == null || arr.length == 0) return 0;
		int maxSoFar = arr[0];
		int curr = arr[0];
		for (int i = 1; i < arr.length; i++) {
			curr = Math.max(arr[i], curr + arr[i]);
			maxSoFar = Math.max(maxSoFar, curr);
		}
		return maxSoFar;
	}

	// 8) Merge two sorted arrays into a new sorted array
	public static int[] mergeSortedArrays(int[] a, int[] b) {
		if (a == null) return b == null ? new int[0] : Arrays.copyOf(b, b.length);
		if (b == null) return Arrays.copyOf(a, a.length);
		int i = 0, j = 0, k = 0;
		int[] out = new int[a.length + b.length];
		while (i < a.length && j < b.length) {
			if (a[i] <= b[j]) out[k++] = a[i++]; else out[k++] = b[j++];
		}
		while (i < a.length) out[k++] = a[i++];
		while (j < b.length) out[k++] = b[j++];
		return out;
	}
	
	//Please write few Xpath strategies for me:
	//1) Absolute Xpath: /html/body/div[1]/div[2]/div[1]/h1
	//2) Relative Xpath: //h1[@id='main-title']
	//3) Using contains(): //div[contains(@class, 'header')]
	//4) Using starts-with(): //input[starts-with(@name, 'user')]
	//5) Using text(): //button[text()='Submit']
	
	//Similarly give me few CSS selector strategies:
	
	//1) By ID: #main-title
	//2) By class: .header
	//3) By attribute: input[name='username']
	//4) By pseudo-class: div:first-child
	//5) By descendant: div.header h1
		
	
	
	
	
		
	

}