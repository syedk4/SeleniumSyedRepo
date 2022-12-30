package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearMouesHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.manage().window().maximize();
		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driverChrome.get("https://www.snapdeal.com/");
		
		WebElement eleMen = driverChrome.findElement(By.xpath("//span[contains(text(),'Men')]"));
		
		//Step1 create object for Actions class
		
		Actions builder = new Actions(driverChrome);
		
		//Step2 use appropriate method to do the action
		builder.moveToElement(eleMen).perform(); //perform() is mandatory at the end of actions
		
		
		
		
		
		
	}

}
