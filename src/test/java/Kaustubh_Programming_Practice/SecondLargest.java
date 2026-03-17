package Kaustubh_Programming_Practice;

import java.util.Arrays;

public class SecondLargest {
	
	static int[] sortArray(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
		
		return arr;
}
	public static void main(String[] args) {
		int[] arr = { 30, 30,30,30, 20,20,10,10};
		
		
			sortArray(arr);
		

		if (arr.length < 2) {
			System.out.println("Invalid Input");
		}

		int largest = arr[arr.length - 1];
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] != largest) {
				System.out.println("Second Largest: " + arr[i]);
				break;
			}

		}
	}
}