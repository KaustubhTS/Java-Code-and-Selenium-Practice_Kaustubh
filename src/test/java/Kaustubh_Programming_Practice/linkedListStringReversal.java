package Kaustubh_Programming_Practice;

public class linkedListStringReversal {

	public static void pyramid(String s) {

		

        for (int row = 0; row <= s.length()-1; row++) {

            for (int col = 0; col <= row ; col++) {
                System.out.print(s.charAt(row));
            }

            System.out.println();
        }

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pyramid("abcdefghijklmnopqrstuvwxyz");

	}

}
