package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnToHandleFrameusingIDorName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.manage().window().maximize();
		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driverChrome.get("https://leafground.com/alert.xhtml");
		
		//index for frames -  starts with 0 (4 frames -> 0,1,2,3)
		
		
		//Switch o
		driverChrome.switchTo().frame(0);
		
		
		//interact with WebElement inside the frame
		driverChrome.findElement(By.id("user_name")).sendKeys("admin");
		
		
	}

}
