package Kaustubh_Programming_Practice;

public class palindromeUsingTwoPointerApproach {

	static void checkPalindrome(String s) {
		int left = 0;
		int right = s.length() - 1;
		int flag=1;

		while (left <= right) {
			if (s.charAt(left) != (s.charAt(right))) {

				System.out.println("String is not palindrome");
				flag=0;
				break;

			}
			left++;
			right--;
		}
		
		if(flag==1) {
		System.out.println("Palindrome");
		}

	}

	public static void main(String[] args) {

		checkPalindrome("aaaaabaaaaa");

	}

}
