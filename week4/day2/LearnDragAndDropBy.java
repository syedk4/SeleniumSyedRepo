package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnDragAndDropBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notification");
		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.manage().window().maximize();
		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driverChrome.get("https://jquerycom/sortable/");
		
		driverChrome.switchTo().frame(0);
		
		//locate the source element
		WebElement item1 = driverChrome.findElement(By.xpath("///li[text()='Item 1']"));
		WebElement item4 = driverChrome.findElement(By.xpath("///li[text()='Item 4']"));
		/*
		 * //locate the target element WebElement targetElement =
		 * driverChrome.findElement(By.xpath("//p[text()='Drag here']"));
		 */
		
		Actions builder = new Actions(driverChrome);
		
		//ilder.dragAndDropBy(SourceElement, 0, 0);
		
		
	}

}
