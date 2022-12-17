package week3.day1.Assignment5;

public class Automation extends MultipleLangauge implements Language,TestTool  {

	
	
	@Override
	public void ruby() {
		System.out.println("Netflix still uses Ruby");
	}

	public void java() {
		
		System.out.println("Learning Automation in Java language");
	}
	
	public void Selenium() {
		
		System.out.println("Using Selenium Test tool");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Automation callAbs = new Automation(); 
		
		callAbs.java();
		callAbs.Selenium();
		callAbs.python();
		callAbs.ruby();
	}

}
