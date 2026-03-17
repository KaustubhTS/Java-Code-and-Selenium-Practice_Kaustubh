package LambdaAndFunctionalInterfaces;

import java.util.*;

public class ComparatorLambdaDemo {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("banana", "apple", "pear", "orange", "kiwi");

        // Sort strings by length using lambda
        List<String> byLength = new ArrayList<>(fruits);
        byLength.sort((a, b) -> Integer.compare(a.length(), b.length()));
        System.out.println("byLength: " + byLength);

        // Sort strings by natural order using method reference
        List<String> byNatural = new ArrayList<>(fruits);
        byNatural.sort(String::compareTo);
        System.out.println("byNatural: " + byNatural);

        // Sort Person list by name, then by age
        List<Person> people = Arrays.asList(
            new Person("Greg", 40),
            new Person("Anna", 28),
            new Person("Bob", 28),
            new Person("Anna", 22)
        );

        List<Person> sorted = new ArrayList<>(people);
        sorted.sort(Comparator.comparing(Person::getName).thenComparing(Person::getAge));
        System.out.println("sorted people: " + sorted);
    }
}