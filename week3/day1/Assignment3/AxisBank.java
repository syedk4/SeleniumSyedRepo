package week3.day1.Assignment3;

public class AxisBank extends BankInfo {

	@Override
	public void deposit() {

		System.out.println("Deposited 15000");
	}


	
	
	  public static void main(String[] args) { // TODO Auto-generated method stub
	  
	  AxisBank abdep = new AxisBank();
	  
	  abdep.saving(); abdep.fixed(); abdep.deposit(); 
	  
	  }
	 
	
}
