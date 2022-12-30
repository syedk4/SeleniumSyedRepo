package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindTheNumberOfHyperLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notification--");
		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.manage().window().maximize();
		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driverChrome.get("https://www.facebook.com");
		
		List<WebElement> allLinks = driverChrome.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
				
		for (WebElement eachLink : allLinks) {
			String text = eachLink.getText();
			System.out.println(text);
			
			String attribute = eachLink.getAttribute("href");
			System.out.println(attribute);
			
			
		}
		
	}

}
