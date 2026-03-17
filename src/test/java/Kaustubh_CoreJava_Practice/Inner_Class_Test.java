package Kaustubh_CoreJava_Practice;

 class M1 {

	

	public void m1() {
		System.out.println("Method m1 class M1");
	}

	
	
	public static  class M2 extends M1 { //Static Inner class.

		public void m1() {
			System.out.println("Method m1 class M2");
		}
		
		

	}

}

public class Inner_Class_Test {

	public static void main(String[] args) {
//		M1 outer = new M1();
//		
//		M1.M2 m =outer.new M2();
//		m.m1();
		
		M1.M2 m = new M1.M2();  // ✔ Correct for static inner class
        m.m1();                 // Calls overridden method
        System.out.println();
	}

}