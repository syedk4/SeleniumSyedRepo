package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnToDoDragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notification");
		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.manage().window().maximize();
		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driverChrome.get("https://leafground.com/drag.xhtml");
		
		//locate the source element
		WebElement SourceElement = driverChrome.findElement(By.xpath("//p[text()='Drag to target']"));
		//locate the target element
		WebElement targetElement = driverChrome.findElement(By.xpath("//p[text()='Drag here']"));
		
		Actions builder = new Actions(driverChrome);
		
		builder.dragAndDrop(SourceElement, targetElement).perform();
		
		
	}

}
