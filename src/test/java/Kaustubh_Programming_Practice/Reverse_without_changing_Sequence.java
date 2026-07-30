package Kaustubh_Programming_Practice;

public class Reverse_without_changing_Sequence {

	// [1,2,4,5,6,7] 3 , 10
	// 1 5 4
	// 1 2 7

	public static void main(String[] args) {
		
		int [] arr= {1,3,4,5,6,7,1};
		int target=10;
		
		for (int i=0 ;i<arr.length-1;i++)
		{
			int left =0;
			int right =arr.length-1;
			
			while (left <right)
			{
				if(arr[i]+arr[left]+arr[right]==target)
				{
					System.out.println(arr[i]+" "+arr[left]+" "+arr[right]);
					left ++;
					right --;
					
				}
				
				else if(arr[i]<target)
				{
					left++;
				}
				else {
					right --;
				}
				
			}
			
			
		}
		
		

	}
}
