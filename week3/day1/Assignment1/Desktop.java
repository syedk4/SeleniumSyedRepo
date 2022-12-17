package week3.day1.Assignment1;

public class Desktop extends Computer {

	public void desktopSize() {
		
		System.out.println("32 inches ");
	}
	
	public static void main(String[] args) {
		
		Desktop call = new Desktop();
		
		call.computerModel();
		call.desktopSize();
		
		
	}
	
	
}
