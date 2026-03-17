package LambdaAndFunctionalInterfaces;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLambdaDemo {
	public static void main(String[] args) {
	
List<Person> people = Arrays.asList(
            new Person("Alice", 30),
            new Person("Bob", 22),
            new Person("Charlie", 25),
            new Person("Diana", 35),
            new Person("Eve", 28)
        );

        // Filter: find people older than 25
        List<Person> olderThan25 = people.stream()
            .filter(p -> p.getAge() > 25)
            .collect(Collectors.toList());
        System.out.println("olderThan25: " + olderThan25);

        // Map: get names
        List<String> names = people.stream()
            .map(Person::getName)
            .collect(Collectors.toList());
        System.out.println("names: " + names);

        // Reduce: sum of ages
        int totalAge = people.stream()
            .map(Person::getAge)
            .reduce(0, Integer::sum);
        System.out.println("totalAge: " + totalAge);

        // Sort by age ascending
        List<Person> sortedByAge = people.stream()
            .sorted(Comparator.comparingInt(Person::getAge))
            .collect(Collectors.toList());
        System.out.println("sortedByAge: " + sortedByAge);
        
        
    }
}