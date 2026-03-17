package Kaustubh_Programming_Practice;

public class checkArrayIsSortedOrNot {

	static void sorted(int[] arr) {
		
		boolean flag=false;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					
					flag=true;
					break;


				} else {
					
					flag=false;
				}

			}
		}
		
		if(flag==true)
			System.out.println("Array is sorted");
		else
			System.out.println("Array not sorted.");
	}

	public static void main(String[] args) {
		int[] array = { 1, 3, 5 ,0};

		sorted(array);

	}

}
