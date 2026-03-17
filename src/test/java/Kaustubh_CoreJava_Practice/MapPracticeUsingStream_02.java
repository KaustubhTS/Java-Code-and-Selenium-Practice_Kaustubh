package Kaustubh_CoreJava_Practice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class MapPracticeUsingStream_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "ONE");
		map.put(3, "THREE");
		map.put(4, "FOUR");
		map.put(2, "TWO");
		map.put(5, "FIVE"); 
		
		System.out.println("Key Values using Enhanced For loop");
		
		for(Map.Entry<Integer,String> m : map.entrySet())
		{
			
			System.out.println(m.getKey());
			System.out.println(m.getValue());
			
		}
		
		
		System.out.println("Key Values Using ForEach ");
	map.entrySet().forEach(entry-> System.out.println(entry.getKey()+" "+entry.getValue()));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Key Values Using Stream ");
		
		
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
		.forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
		
		
		
		
		
		
		
		

	}

}
