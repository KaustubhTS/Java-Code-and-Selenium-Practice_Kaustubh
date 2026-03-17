package Kaustubh_Programming_Practice;

import java.util.Scanner;

public class Fibinocci_Series {

	public static int fib_Series(int n) {
		if (n <= 1)
			return n;

		else
			return fib_Series(n - 1) + fib_Series(n - 2);

	}

	public static void main(String[] args) {
		

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sequence Number");
		int SeqCount = sc.nextInt();

		for (int i = 0; i <= SeqCount; i++) {
			System.out.print(fib_Series(i) + " ");
		}

	}

}
