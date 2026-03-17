package ExceptionHandling;

import java.io.IOException;

public class P1_BasicCatch {

	 public static void main(String[] args) {
	        try {
	            parse();
	        } catch (IllegalStateException e) {
	            System.out.println("Caught: " + e.getClass().getSimpleName()
	                               + ", cause=" + e.getCause().getClass().getSimpleName());
	        }
	    }
	    static void parse() {
	        try {
	            Integer.parseInt("NaN");
	        } catch (NumberFormatException e) {
	            throw new IllegalStateException("Parsing failed", e);
	        }
	    }
}

//Output
/*
 Caught: P1_BasicCatch
 After try-catch
 
 Result 1
 NumberFormatException
 
  
 */
