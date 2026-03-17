package Kaustubh_Programming_Practice;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortingUsingWhile {

	public static void main(String[] args) {
		int[] a = IntStream.generate(() -> (int)(Math.random() * 100))
                .limit(100000)   
                .toArray();
		
		
		
		int start =0 ;
		int end=a.length-1;
		
		while(start<end)
		{
			int temp= a[start];
			a[start]=a[end];
			a[end]=temp;
			
			start++;
			end--;
		}
		System.out.println(Arrays.toString(a));
	}
  
}
