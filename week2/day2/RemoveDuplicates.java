package week2.day2;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Pseudo code
		 * 
		 * a) Use the declared String text as input String text =
		 * "We learn java basics as part of java sessions in java week1";
		 *  b) Initialize an integer variable as count
		 *  c) Split the String into array and iterate over it
		 *  d) Initialize another loop to check whether the word is there in the array
		 *  e) if it is available then increase and count by 1. 
		 *  f) if the count > 1 then replace the word as ""
		 * 
		 * 
		 * g) Displaying the String without duplicate words
		 */

		// Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";

		// Initialize an integer variable as count
		int count =0;

		// Split the String into array and iterate over it

		String[] countwords = text.split(" ");

		for (int i = 0; i < countwords.length; i++) {
			
			
			
			for (int j =i+1; j < countwords.length; j++) {

				if (countwords[i].equals(countwords[j])) {

					count++;
					
					countwords[j] = "0";
					
				}

				// System.out.print(countwords);
			}

			if (count >=0 && countwords[i] != "0") {
				
				
				System.out.print(countwords[i]+" ");
				
			}
				
		}
		
	}

}
