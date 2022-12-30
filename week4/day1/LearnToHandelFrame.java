package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnToHandelFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.manage().window().maximize();
		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driverChrome.get("https://dev110326.service-now.com/");
		
		//Swithc to frame using id / name (if there is only id or name then only we can use)
		driverChrome.switchTo().frame("gsft_main");
		
		
		
		
		
		
		//interact with WebElement inside the frame
		driverChrome.findElement(By.id("user_name")).sendKeys("admin");
	}

}
