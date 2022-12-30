package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnToComeOutOfTheFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.manage().window().maximize();
		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driverChrome.get("https://leafground.com/frame.xhtml");
		
		driverChrome.switchTo().defaultContent();
		
		
		String text = driverChrome.findElement(By.xpath("//h5[contains(text(),'Click Me')]")).getText();
		System.out.println(text);

	}

}
