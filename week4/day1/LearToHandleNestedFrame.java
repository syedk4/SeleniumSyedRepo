package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearToHandleNestedFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.manage().window().maximize();
		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driverChrome.get("https://leafground.com/frame.xhtml");
		
		//Get into the Outer frame first
		driverChrome.switchTo().frame(2);
		
			
		//get into the inner frame; first iframe inside the 3rd iframe
		
		driverChrome.switchTo().frame(0);
				
		
		//Interact with WebElement inside the inner frame
		driverChrome.findElement(By.id("Click")).click();
	}

}
