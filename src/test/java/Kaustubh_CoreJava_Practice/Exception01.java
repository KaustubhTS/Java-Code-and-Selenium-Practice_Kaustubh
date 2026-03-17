package Kaustubh_CoreJava_Practice;

import java.io.IOException;

public class Exception01 {
	static int m1()
	{
		int i=0;
		m1();
		return i++;
	}

	public static void main(String[] args) {
		m1();
		
	}

}