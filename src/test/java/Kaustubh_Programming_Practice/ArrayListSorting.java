package Kaustubh_Programming_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListSorting {

	public static void main(String[] args) {
		
		List<String> list =new ArrayList<String>();
		list.add("Shyam");
		list.add("Ram");
		list.add("Satpudke");
		list.add("Kaustubh");
		System.out.println(list.toString());
		
		for(int i=0;i<list.size()-1;i++)
		{
			for(int j=0;j<list.size()-1;j++)
			{
				if(list.get(j).compareTo(list.get(j+1))>0)
				{
					String temp=list.get(j);
					list.set(j,list.get(j+1));
					list.set(j+1,temp);
				}
			}
		}
		
		
		//list.sort(Comparator.reverseOrder());
		System.out.println( list.toString());
		
		
	
	}

}
