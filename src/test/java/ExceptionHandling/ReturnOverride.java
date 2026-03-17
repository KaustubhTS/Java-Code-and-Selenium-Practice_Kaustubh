package ExceptionHandling;

public class ReturnOverride {
	static void f() {
		try {
			
			System.out.println(10/0);
		}
		finally {
			
			String s=null;
			System.out.println(s.length());
		}
		
		
	}

	public static void main(String[] args) {
		f();
	}

}
