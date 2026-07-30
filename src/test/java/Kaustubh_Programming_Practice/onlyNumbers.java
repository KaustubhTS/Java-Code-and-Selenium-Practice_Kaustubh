package Kaustubh_Programming_Practice;

public class onlyNumbers {

	public static boolean onlyNum(String s) {
		boolean flag = true;
		for (int i = 0; i < s.length(); i++) {

			if (Character.isAlphabetic(s.charAt(i))) {
				flag = false;

			}

		}

		if (flag) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {

		System.out.println(onlyNum("1"));
	}

}
