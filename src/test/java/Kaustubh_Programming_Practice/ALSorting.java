package Kaustubh_Programming_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ALSorting {

	public static void main(String[] args) {
		// String [] str = {"Kaustubh","Monu","Sonu","Golu","Ram"}
		List<String> l = new ArrayList<>();
		l.add("kaustubh");
		l.add("Satpudke");
		l.add("Golu");
		l.add("Ram");
		l.add("Shyam");
		System.out.println(l);

		for (int i = 0; i < l.size(); i++) {
			for (int j = i + 1; j < l.size(); j++) {
//				String a =l.get(i);
//				String b =l.get(j);
//				
//				if(a.length()>b.length()) {
//					String temp=a;
//					a=b;
//					b=temp;
//					
				if (l.get(i).compareTo(l.get(j)) > 0) {
					String temp = l.get(i);
					l.set(i, l.get(j));
					l.set(j, temp);

				}
			}
		}
		System.out.println(l);

	}

}
