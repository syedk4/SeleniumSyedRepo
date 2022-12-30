package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnToLocateMultipleElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notification--");
		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.manage().window().maximize();
		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driverChrome.get("http://leaftaps.com/opentaps/control/main");
		
		
		List<WebElement> multipleElements = driverChrome.findElements(By.className("inpuLogin"));
		
		for (WebElement eacEle : multipleElements) {
			
			String attribute = eacEle.getAttribute("name");
			System.out.println(eacEle);
		}
		
		
	}

}
