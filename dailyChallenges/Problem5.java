package dailyChallenges;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 2;
		int sum=0;
		
		
		  while (num > 0) {
		  
		  int digit = num % 10;
		  
		  sum += digit * digit;
		  
		  num/=10;
		  
		  }
		 	
		System.out.println(sum);
		
		
		
	}

}
