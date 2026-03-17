package Kaustubh_CoreJava_Practice;
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car is starting");
    }
}

public class Demo {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
    }
}