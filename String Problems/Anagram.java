import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean isAnagram = false;

		System.out.println("enter the String 1");
		String String1 = s.nextLine();
		System.out.println("enter the String 2");
		String String2 = s.nextLine();
		boolean isVisited[] = new boolean[String2.length()];
		if (String1.length() == String2.length()) {
			for (int i = 0; i < String1.length(); i++) {
				isAnagram = false;
				char c1 = String1.charAt(i);
				for (int j = 0; j < String2.length(); j++) {
					char c2 = String2.charAt(j);

					if (c1 == c2 && !isVisited[j]) {
						isAnagram = true;
						isVisited[j] = true;
						break;
					}

				}
				if (!isAnagram) {
					break;
				}

			}
		}
		if (isAnagram) {
			System.out.println("Anagram");
		} else {
			System.out.println("not anagram");

		}
	}

}
