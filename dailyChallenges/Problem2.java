package dailyChallenges;

public class Problem2 {
	
	static int floorSqrt(int x)
    {       
        if (x<1)
            return x;
 
        
        int i = 1;
 
        while (i*i <= x) {
            i++;
            
        }
        return i - 1;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Problem2 squareroot = new Problem2();
		
		System.out.println(squareroot.floorSqrt(16));
		
		
		
	}		

}
