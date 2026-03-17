package ExceptionHandling;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;

public class throwKeyword {

	static void Issue() {
		try {
			throw new NullPointerException("Kaustubh");
		} catch (NullPointerException e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Issue();
		} catch (NullPointerException e) {
			System.out.println("My Main method");
		}
	}

}
