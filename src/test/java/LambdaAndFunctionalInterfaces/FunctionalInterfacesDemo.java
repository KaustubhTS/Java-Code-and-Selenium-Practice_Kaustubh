package LambdaAndFunctionalInterfaces;

import java.util.function.*;

public class FunctionalInterfacesDemo {
    public static void main(String[] args) {
        // Predicate: test a condition
        Predicate<String> isNotEmpty = s -> s != null && !s.isEmpty();
        System.out.println("isNotEmpty('hello') = " + isNotEmpty.test("hello"));

        // Function: transform a value
        Function<String, Integer> length = String::length;
        System.out.println("length('lambda') = " + length.apply("lambda"));

        // Consumer: consume a value (side-effect)
        Consumer<String> printer = s -> System.out.println("Consumed: " + s);
        printer.accept("Printing from Consumer");

        // Supplier: provide a value
        Supplier<Double> randomSupplier = Math::random;
        System.out.println("randomSupplier = " + randomSupplier.get());

        // UnaryOperator / BinaryOperator
        UnaryOperator<Integer> square = x -> x * x;
        System.out.println("square(5) = " + square.apply(5));

        BinaryOperator<Integer> add = Integer::sum;
        System.out.println("add(3,7) = " + add.apply(3, 7));

        // BiFunction: combine two inputs to produce a result
        BiFunction<String, String, String> concat = (a, b) -> a + "-" + b;
        System.out.println("concat('A','B') = " + concat.apply("A", "B"));
    }
}