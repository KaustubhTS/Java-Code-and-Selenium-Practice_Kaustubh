package Kaustubh_Programming_Practice;

abstract class Base {
	void show() {
		System.out.println("Base show");
	}
}

class Derived extends Base {
}

public class Main {
	public static void main(String[] args) {
		Derived d = new Derived();
		d.show();
	}
}
