package Java8one;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {2,5,3,1,2,4,2,3,6};
		Set<Integer> unique = new HashSet<>();
		
		for (int i = 0; i < nums.length; i++) {
			if(unique.add(nums[i])) {
				
				
			}
		}
		System.out.println(unique);
		
		List<Integer> numbers = Arrays.asList(2,5,3,1,2,4,2,3,6);
		List<Integer> distinct = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println(distinct);
		
	}

}
