package Kaustubh_CoreJava_Practice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class MapPractice_Basic {

	public static void main(String[] args) {
		
		Map<String,String> m1 =new HashMap<String,String>();
		m1.put("Kaustubh","Satpudke");
		m1.put("Nikita", "Ganvir");
		m1.put("Kaustubh1", "Nikita");
		m1.put("Nikita1", "Kaustubh");
		
		m1.put("Kaustubh2","Satpudke");
		m1.put("Nikita2", "Ganvir");
		m1.put("Kaustubh3", "Nikita");
		m1.put("Nikita2", "Kaustubh");
		
		System.out.println(m1);
		System.out.println(m1.keySet());
		System.out.println(m1.values());
		
		for(String m : m1.keySet())
		{
			System.out.println("Key "+m);
		}
		
		for(String m :m1.values())
		{
			System.out.println("Value: "+m);
		}
		
		for(Entry<String,String> m2 :m1.entrySet())
		{
			System.out.println(m2.getKey()+" "+ m2.getValue() );
			
		}
		
		System.out.println("Get  Values if Key is Nikita");
		
		for(Entry <String,String> m3 :m1.entrySet())
		{
			if(m3.getKey().equals("Nikita"))
			{
				System.out.println("Values for Nikita : "+ m3.getValue());
			}
			
			
		}
		
		
		System.out.println("Get all the Keys if value is Nikita");
		
		for(Entry<String,String> m4 :m1.entrySet())
		{
			if(m4.getValue().equals("Nikita"))
			{
				System.out.println(m4.getKey());
			}
		}
		
		
		List<String> l1 =m1.keySet().stream().collect(Collectors.toList());
		System.out.println("List of keys"+l1);
		
		List<String>l2=m1.values().stream().collect(Collectors.toList());
		System.out.println("List of Values :"+ l2);
		
		List<Entry<String,String>> entryList=m1.entrySet().stream().collect(Collectors.toList());
		System.out.println(entryList);
		
		
		m1.forEach((key,value)->System.out.println(key+"----->>>>> "+ value.equals("Nikita")));
		
	
		
		
		
		
	}

}
