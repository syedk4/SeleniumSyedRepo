package dailyChallenges;

public class Problem3 {

	public boolean Example1() {

		String s = "A man, a plan, a canal: Panama ";

		// s.split("").toString().toLowerCase();

		s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

		char[] a = s.toCharArray();

		int n = s.length();
		for (int i = a.length - 1; i >= 0; i--) {
			if (s.charAt(i) != s.charAt(n - 1 - i)) {

				System.out.println(s + " :it is not a palindrome");

				return false;

			}

		}

		System.out.println(s + " :it is a palindrome");
		return true;

	}

	public boolean Example2() {

		String s = "race a car";

		// s.split("").toString().toLowerCase();

		s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

		char[] a = s.toCharArray();

		int n = s.length();
		for (int i = a.length - 1; i >= 0; i--) {
			if (s.charAt(i) != s.charAt(n - 1 - i)) {
				System.out.println(s + " :it is not a palindrome");
				return false;
			}

		}

		System.out.println(s + " :it is a palindrome");
		return true;

	}

	public boolean Example3() {

		String s = " ";

		// s.split("").toString().toLowerCase();

		s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

		char[] a = s.toCharArray();

		int n = s.length();
		for (int i = a.length - 1; i >= 0; i--) {
			if (s.charAt(i) != s.charAt(n - 1 - i)) {
				System.out.println(s + " :it is not a palindrome");
				return false;
			}

		}

		System.out.println(s + " :it is a palindrome");
		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Problem3 e1 = new Problem3();

		e1.Example1();
		e1.Example2();
		e1.Example3();

	}

}
