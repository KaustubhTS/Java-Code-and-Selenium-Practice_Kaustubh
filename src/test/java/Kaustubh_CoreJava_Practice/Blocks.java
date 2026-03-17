package Kaustubh_CoreJava_Practice;

class House {
	static {
		System.out.println("Static block H");

	}

	static {
		System.out.println("Static block H 01");
	}

	{
		System.out.println("Instance Block H");
	}
	{
		System.out.println("Instance block H 01");
	}

	House() {

		System.out.println("Constructor H");
	}

	House(int a) {
		System.out.println("Parameterized Constructor H");
	}

} //SBH,SBH01,SB,SB01,IBh,IBH01,CH,IB,IB01,C,IBH,IBH01,CH,IB,IB01,PC

public class Blocks extends House {

	static {
		System.out.println("Static block");

	}

	static {
		System.out.println("Static block 01");
	}

	{
		System.out.println("Instance Block");
	}
	{
		System.out.println("Instance block 01");
	}

	Blocks() {

		System.out.println("Constructor");
	}

	Blocks(int a) {
		System.out.println("Parameterized Constructor.");
	}

	public static void main(String[] args) {
		Blocks obj = new Blocks();
		Blocks obj1 = new Blocks(10);

	}

	// SB ,SB01, IB, IB01, C,IB,IB01,PC

}
