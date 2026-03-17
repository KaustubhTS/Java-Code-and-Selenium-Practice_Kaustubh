package Kaustubh_Programming_Practice;

public class MissingElementinArray {

	public static void missingElements(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {
			if (!(array[i] == array[i + 1] - 1)) {
				System.out.println(array[i] + 1);
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, 4, 5, 7 , 9,11};
		missingElements(arr);

	}

}
