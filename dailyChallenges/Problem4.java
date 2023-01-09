package dailyChallenges;

import java.util.Iterator;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {4,1,2,1,2,4,3};
		int single = 0;
		
		/*
		 * for (int i : nums) {
		 * 
		 * single ^= i;
		 * 
		 * 
		 * } System.out.println(single);
		 */
		for (int i = 0; i < nums.length; i++) {
			
			 single ^= nums[i];
			
					
		}
		
		System.out.println(single);
	}

}
