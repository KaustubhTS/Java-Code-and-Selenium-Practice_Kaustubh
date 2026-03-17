package Kaustubh_CoreJava_Practice;

public class Class_Interface_Test implements Interface_Practice {

	public void m1() {
		System.out.println("Class method 1");

	}

	public void m2() {
		
		System.out.println("Class method 01");

	}
	
	static void m3()
	{

		System.out.println("Class overidded method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class_Interface_Test a= new Class_Interface_Test();
		a.m3();
		Interface_Practice.m3();
		
	}

}
