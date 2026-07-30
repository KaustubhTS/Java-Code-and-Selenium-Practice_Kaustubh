package Kaustubh_Programming_Practice;


	import java.util.ArrayList;
	import java.util.List;

	public class sumOfNumberEquals10InArray {

	    public static void findCombinations(int[] arr, int target,
	                                        int index,
	                                        List<Integer> current) {

	        if (target == 0) {
	            System.out.println(current);
	            return;
	        }

	        if (target < 0 || index >= arr.length) {
	            return;
	        }

	        // Include current element
	        current.add(arr[index]);
	        findCombinations(arr, target - arr[index],
	                         index + 1, current);

	        // Backtrack
	        current.remove(current.size() - 1);

	        // Exclude current element
	        findCombinations(arr, target,
	                         index + 1, current);
	    }

	    public static void main(String[] args) {

	        int[] arr = {2, 3, 5, 6, 8, 4, 7};

	        findCombinations(arr, 10, 0,
	                         new ArrayList<>());
	    }
	}