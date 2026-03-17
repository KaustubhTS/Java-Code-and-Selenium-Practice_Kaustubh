package Kaustubh_Programming_Practice;

import java.util.Arrays;

public class RotatedArray {
		   static void reverse(int []arr,int left,int right){
	
		        System.out.println("1");
		        while(left<right){
		        	System.out.println("2");
		            int temp = arr[left];
		            arr[left]=arr[right];
		            arr[right]=temp;
		            left++;
		            right--;
		        }
		        System.out.println("3");
		        System.out.println(Arrays.toString(arr));
		        System.out.println("4");
		    }
		   		static void rotateArray(int[] arr,int k) {
		   			int n=arr.length;
		   			reverse(arr,0,n-1);
		   			reverse(arr,0,k-1);
		   			reverse(arr,k,n-1);
		   		}
		   
		      public static void main(String[] args) {
		          int [] arr = {1,5,6,3}; //3156 6315 5631
		          
		          rotateArray(arr,3);


		      }
		}

