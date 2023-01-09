package dailyChallenges;

import java.util.Iterator;

import org.checkerframework.checker.units.qual.s;

public class Problem1 {

	/*
	 * public int lengthOfLastWord(String s) {
	 * 
	 * 
	 * String[] words = s.split(" "); return words.length == 0 ? 0 :
	 * words[words.length - 1].length(); }
	 */
		public void Example1() {
			
			 String s =  "Hello World"; 
			  
			 System.out.println("Original words are: " + s);
			  
			  String[] x = s.split(" ");
			  
			  int length = x[x.length-1].length();
			  System.out.print("The last word is: "+x[x.length-1]);
			  System.out.println(" and length of the last word in Example 1 is: " + length);
			
		}
		
		
		public void Example2() {
			
			 String s =  "   fly me   to   the moon  "; 
			  
			  System.out.println("Original words are: " + s);
			  
			  String[] x = s.split(" ");
			  
			  int length = x[x.length-1].length();
			  System.out.print("The last word is: "+x[x.length-1]);
			  System.out.println(" and length of the last word in Example 2 is: " + length);
			
		}
		
		
		public void Example3() {
			
			 String s =  "luffy is still joyboy"; 
			  
			 System.out.println("Original words are: " + s);
			  
			  String[] x = s.split(" ");
			  
			  int length = x[x.length-1].length();
			  System.out.print("The last word is: "+x[x.length-1]);
			  System.out.println(" and length of the last word in Example 3 is: " + length);
			
		}
		
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Given a string s consisting of words and spaces, return the length of the
		 * last word in the string. 
		 * A word is a maximal substring consisting of non-space characters only.
		 * 
		 */
		Problem1 result = new Problem1();
		
		result.Example1();
		result.Example2();
		result.Example3();
		 
	
		
	}

}
