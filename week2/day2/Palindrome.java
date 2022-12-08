package week2.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Build a logic to find the given string is palindrome or not

		/*
		 * Pseudo Code
		 * 
		 * a) Declare A String value as"madam"
		 * 
		 * b) Declare another String rev value as "" c) Iterate over the String in
		 * reverse order d) Add the char into rev e) Compare the original String with
		 * the reversed String, if it is same then print palinDrome
		 * 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String
		 */
		String name = "MADAMS";
		String revname = "";
		char[] revchar = name.toCharArray();

		for (int i = revchar.length - 1; i >= 0; i--) {

			revname = revname + revchar[i];
			System.out.print(revchar[i]);

		}

		if (name.equalsIgnoreCase(revname)) {
			System.out.println(" : The word is palindrome");

		} else {
			System.err.print(" : The word is not palindrome");

		}

	}

}
