package StringPractice;

public class Stringbehaviour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="Kaustubh";
		System.out.println(a);
		int hashCode = System.identityHashCode(a);
		System.out.println(hashCode);
		
		
		
		a="Satpudke";
		System.out.println(a);
		int hashCode1 = System.identityHashCode(a);
		System.out.println(hashCode1);
	
		
	}

}
