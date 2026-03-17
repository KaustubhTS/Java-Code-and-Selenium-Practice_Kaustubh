package LambdaAndFunctionalInterfaces;

public class LambdaExample {
    public static void main(String[] args) {
        // addition
        Operation add = (x, y) -> x + y;
        System.out.println("add(4,5) = " + add.apply(4, 5));

        // subtraction
        Operation sub = (x, y) -> x - y;
        System.out.println("sub(9,3) = " + sub.apply(9, 3));

        // multiplication (block body)
        Operation mul = (x, y) -> {
            int r = x * y;
            return r;
        };
        System.out.println("mul(7,6) = " + mul.apply(7, 6));

        // division with guard
        Operation div = (x, y) -> y == 0 ? 0 : x / y;
        System.out.println("div(20,4) = " + div.apply(20, 4));
        System.out.println("div(5,0) = " + div.apply(5, 0));

        // method reference
        Operation max = Math::max;
        System.out.println("max(10,20) = " + max.apply(10, 20));

        // inline usage
        System.out.println("inline: 7-2 = " + Operation.execute(7, 2, (a, b) -> a - b));

        // effectively final capture
        int factor = 3;
        Operation scaled = (a, b) -> (a + b) * factor;
        System.out.println("scaled(2,3) with factor 3 = " + scaled.apply(2, 3));
    }
}
