package Kaustubh_CoreJava_Practice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map_Practice_usingStream {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "ONE");
		map.put(3, "THREE");
		map.put(4, "FOUR");
		map.put(2, "TWO");
		map.put(5, "FIVE"); 

		System.out.println("Original Map");
		map.entrySet().forEach(entry->System.out.println(entry.getKey()+ " " +entry.getValue()));

		map.forEach((key, value) -> System.out.println(key + "--> " + value));

		System.out.println("Map with Natural sorting order based on Keys");

		map.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));

		System.out.println("Map with Reverse sorting order based on Keys");

		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
				.forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));

		System.out.println("Natural sorting order based on values");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));

		System.out.println("Reverse sorting order based on values");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));

		Map<String, HashMap<String, Integer>> Cart = new TreeMap();
		// Inner Map
		HashMap<String, Integer> items_quantity = new HashMap<>();
		items_quantity.put("Mobile", 2);
		items_quantity.put("Laptop", 3);
		items_quantity.put("Tablet", 4);

		HashMap<String, Integer> items_quantity1 = new HashMap<>();
		items_quantity1.put("Distemper", 5);
		items_quantity1.put("Putty", 6);
		items_quantity1.put("Colour Pencil", 7);

		// items_quantity.clear();

		Cart.put("Kaustubh", items_quantity);
		Cart.put("Nikita", items_quantity1);

		System.out.println(Cart.keySet());
		System.out.println(Cart.values());

		Cart.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));

	}

}
