package Kaustubh_Programming_Practice;

public class DuplicatesInArray1 {

	public static void duplicates(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			// skip processed

			boolean flag = false;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					flag = true;
					break;
				}
			}

			if (flag) {
				continue;
			}

			for (int k = i + 1; k < arr.length; k++) {
				if (arr[i] == arr[k]) {
					System.out.println(arr[i]);
					break;
				}
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 2, 3, 4, 4, 4, 4, 5 };
		duplicates(arr);
	}

}
