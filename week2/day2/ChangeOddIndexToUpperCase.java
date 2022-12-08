package week2.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaring the string variable
		String test = "changeme";

		// Converting string to Character Array
		char[] charArray = test.toCharArray();

		// Traverse through each character using loop
		for (int i = 0; i < charArray.length; i++) {

			// Finding the odd index within the loop
			if (i % 2 != 0) {
				charArray[i] = Character.toUpperCase(charArray[i]);
				// charArray[i] = Character.toUpperCase(charArray);

			}

		}
		System.out.print(charArray);
	}

}
