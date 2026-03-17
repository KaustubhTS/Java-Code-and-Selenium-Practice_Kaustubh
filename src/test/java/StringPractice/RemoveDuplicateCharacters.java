package StringPractice;

public class RemoveDuplicateCharacters {

	static String removeDuplicates(String str) {

		char[] ch = str.toLowerCase().toCharArray();

		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < ch.length; i++) {
			boolean duplicate = false;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					duplicate = true;
					break;

				}
			}
			if (!duplicate) {
				sb.append(ch[i]);
			}
		}

		return sb.toString();

	}

	public static void main(String[] args) {

		System.out.println(removeDuplicates("Kaustubh"));

	}
}
