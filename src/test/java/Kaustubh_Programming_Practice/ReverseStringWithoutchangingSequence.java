package Kaustubh_Programming_Practice;

public class ReverseStringWithoutchangingSequence {

	
	static void revString(String s)
	{
		String [] s1= s.split(" ");
		String r="";
		StringBuilder result = new StringBuilder();
		
		for(String w:s1)
		{
			//Logic 1:
//			char[] ch = w.toCharArray();
//            String rev = "";
//            for (int i = ch.length - 1; i >= 0; i--) {
//                rev += ch[i];
//            }
//            r += rev + " ";
			
			
			//Logic 2:
			StringBuilder sb = new StringBuilder(w);
		    result.append(sb.reverse()).append(" ");
			
			
		}
		
		System.out.println(result.toString());
		
	}
	public static void main(String[] args) {
		revString("kaustubh Satpudke");

	}

}
