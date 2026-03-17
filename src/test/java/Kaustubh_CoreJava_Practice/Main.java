package Kaustubh_CoreJava_Practice;

public class Main {

	public static void main(String[] args) {
		 MathOperation addition = (a, b) -> a + b;
	        MathOperation subtraction = (a, b) -> a - b;

	        System.out.println("Addition: " + addition.operate(8, 3));
	        System.out.println("Subtraction: " + subtraction.operate(8, 3));

	}

}
