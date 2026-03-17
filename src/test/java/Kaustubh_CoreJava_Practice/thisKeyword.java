package Kaustubh_CoreJava_Practice;

public class thisKeyword {
	
	
	void a()
	{
		b(10);
		System.out.println("Method A");
	}
	
	void b(int x)
	{
		
		System.out.println("Method B"+x);
	}

	public static void main(String[] args) {
		thisKeyword obj=new thisKeyword();
		obj.a();

	}

}
