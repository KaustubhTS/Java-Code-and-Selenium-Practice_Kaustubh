package Kaustubh_Programming_Practice;

abstract class Base {
	void show() {
		System.out.println("Base show");
	}
}

class Derived extends Base {
	void show() {
		System.out.println("Derieved show");
	}
}

public class Main {
	public static void main(String[] args) {
		Derived d = new Derived();
		d.show();
	}
}
