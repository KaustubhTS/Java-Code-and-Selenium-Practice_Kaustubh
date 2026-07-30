package Kaustubh_Programming_Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;






public class frequencyOfCharacters {

	public static void arraySum(int [] arr)
	{
		
		int target=10;
		 Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			int left =i+1;
			int right= arr.length-1;
			
			while (left <right)
			{
				if(arr[i]+arr[left]+arr[right]==10)
				{
					
					System.out.println(arr[i]+" "+arr[left]+" "+arr[right]);
					left++;
					right--;
				}
				
				else if(arr[i]+arr[left]+arr[right]<target)
				{
					left ++;
				}
				else 
				{
					right --;
				}
				
			}
			
		}


	}
	
	
	
	
	public static String longestSubString(String str) {

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		int longestSubStringLength = 0;
		String longestSubString = null;

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (!map.containsKey(c)) {
				map.put(c, i);
			}

			else {
				i = map.get(c);
				map.clear();
			}
		}

		if (map.size() > longestSubStringLength) {
			longestSubStringLength = map.size();
			longestSubString = map.keySet().toString();
		}

		return longestSubString;

	}

	public static void freqOfchar(String str) {

		char[] ch = str.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (Character c : ch) {

			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		System.out.println(map);

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {

			System.out.println("Key " + entry.getKey() + " Value " + entry.getValue());
		}

	}

	public static void main(String[] args) {
		// freqOfchar("Kaustubh");
		System.out.println(longestSubString("KAUSTUBH"));
		int [] arr= {12,2,1,4,-5,-6,-3,-2,4,2,1,0};
		arraySum(arr);
	}

}
