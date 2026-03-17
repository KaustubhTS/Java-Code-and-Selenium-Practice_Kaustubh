package Kaustubh_Programming_Practice;

public class DuplicatesInArray {

	static void duplicates(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(j);
				}
			}
		}

	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 3, 4, 5 };
		duplicates(array);

	}

}
