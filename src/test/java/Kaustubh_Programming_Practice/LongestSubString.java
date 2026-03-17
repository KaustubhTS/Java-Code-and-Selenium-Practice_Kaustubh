package Kaustubh_Programming_Practice;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubString {

	static int longestSubStringUsingSet(String s) {
		int left = 0, right = 0, start = 0, maxlength = 0;

		HashSet<Character> set = new HashSet<Character>();
		while (right < s.length()) {
			if (!set.contains(s.charAt(right))) {
				set.add(s.charAt(right));
				if (right - left + 1 > maxlength) {

					start = left;
				}
				maxlength = Math.max(maxlength, right - left + 1);

				right++;

			} else {
				set.remove(s.charAt(left));
				left++;
			}
		}
		System.out.println("Longest Substring is : " + s.substring(start, start + maxlength));
		return maxlength;
	}

	static void longestSubString(String s) {

		String longestSubString = null;
		int longestSubStringLength = 0;
		//String a = "KauKta";
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		char[] arr = s.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];// 
			if (!map.containsKey(ch)) {
				map.put(ch, i);// (K,0),(a,1),(u,2),(s,3)
			} else {
				i = map.get(ch);// 0
				map.clear();// ()

			}

			if (map.size() > longestSubStringLength) {
				longestSubStringLength = map.size();//4
				longestSubString = map.keySet().toString();// Kaus
			}
		}

		System.out.println("Longest sub String is: " + longestSubString);

		System.out.println("Longest sub String length is: " + longestSubStringLength);

	}

	public static void main(String[] args) {

		//System.out.println("Length of Longest String: " + longestSubStringUsingSet("Kaustubhyuc"));

		 //longestSubString("KauKta");
		 longestSubString("Kaustubhyuc");

	}

}
