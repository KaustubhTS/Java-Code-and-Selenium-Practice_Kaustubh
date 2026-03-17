package Kaustubh_CoreJava_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayListPractice {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		a.add("Kaustubh");
		a.add("Saurabh");

		Iterator<String> itr = a.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
			if (itr.next().equals("Kaustubh"))

			{
				itr.remove();

			}
		}
		

		System.out.println(Collections.binarySearch(a, "Kaustubh"));

		System.out.println("List using for each loop");

		List<String> names = List.of("Kaustubh", "Nikita", "Satpudke1", "Ganvir1");
		List<String> result = new ArrayList<>();

		for (String name : names) {
			if (name.length() > 6) {
				result.add(name.toUpperCase());
			}
		}

		System.out.println(result);

		System.out.println("List using Stream");

		List<String> result1 = names.stream()
				.filter(name -> name.length() > 6)
				.map(String::toUpperCase).sorted()
				.toList();

		System.out.println(result1);
		
		Map<Integer,String> map=names.stream()
		.collect(Collectors.toMap(String::length, n->n));
		
		System.out.println(map);
		
		
		Object[] randomNumbers=Stream.generate(Math::random)
		.map(num->num*100)
		.filter(num-> num<10)
		.limit(50)
		.toArray();
		
		System.out.println(Arrays.toString(randomNumbers));

		
		
		
	}

}
