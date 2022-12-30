package week4.day2.Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.manage().window().maximize();
		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driverChrome.get("https://www.snapdeal.com/");
		Actions builder = new Actions(driverChrome);
		
		//Go to Mens Fashion
		WebElement mensFashion = driverChrome.findElement(By.xpath("//span[contains(text(),'Men')][1]"));
		builder.moveToElement(mensFashion).perform();
		// Go to Sports Shoes
		driverChrome.findElement(By.xpath("//span[contains(text(),'Sports Shoes')]")).click();
		
		//Get the count of the sports shoes
		WebElement countSportShoes = driverChrome.findElement(By.xpath("//span[@class='category-name category-count']"));
		System.out.println("Count of Sport Shoes: "+countSportShoes.getText());
		//Click Training shoes
		driverChrome.findElement(By.xpath("//div[contains(text(),'Training Shoes')]")).click();
		//Sort by Low to High
		driverChrome.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']")).click(); //li[@class='search-li'][2]
		driverChrome.findElement(By.xpath("//li[@class='search-li'][1]")).click();
		
		// Check if the items displayed are sorted correctly
		List<WebElement> listSort = driverChrome.findElements(By.xpath("//input[@id='sortVal']/following::span[@class='lfloat product-price']")); 
			  for (WebElement webElement : listSort) {
			  
			  String text = webElement.getText();
			  
			  System.out.println(text);
			  
			  }
			 //Select the price range (900-1200)
		WebElement sourceRight = driverChrome.findElement(By.xpath("//a[@class='price-slider-scroll right-handle ui-slider-handle ui-state-default ui-corner-all hashAdded']"));
		WebElement targetLeft = driverChrome.findElement(By.xpath("//a[@class='price-slider-scroll left-handle ui-slider-handle ui-state-default ui-corner-all hashAdded']"));
		
		builder.scrollToElement(sourceRight).perform();
		builder.dragAndDrop(sourceRight, targetLeft).perform();
		
		Thread.sleep(2000);
		WebElement fromAmt = driverChrome.findElement(By.xpath("//input[@name='fromVal']"));
		fromAmt.clear();
		fromAmt.sendKeys("400");
		WebElement toAmt = driverChrome.findElement(By.xpath("//input[@name='toVal']"));
		toAmt.clear();
		toAmt.sendKeys("975");
		Thread.sleep(2000);
		driverChrome.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		//Filter with color Navy 
		Thread.sleep(2000);
		WebElement selColor = driverChrome.findElement(By.xpath("//label[@for='Color_s-Navy']"));
		builder.scrollToElement(selColor).perform();
		selColor.click();
		
		//verify the all applied filters 
		System.out.println("Selected Filters are: ");
		
		Thread.sleep(2000);
		
		  List<WebElement> listFilters = driverChrome.findElements(By.xpath("//div[@class='navFiltersPill']"));//div[@class='navFiltersPill']
		  for (WebElement filters : listFilters) {
		  String text = filters.getText();
		  System.out.println(text);
		  }
		
		// Mouse Hover on first resulting Training shoes
		//click QuickView button
		Thread.sleep(2000);
		WebElement firstProd = driverChrome.findElement(By.xpath("//div[@class='col-xs-6  favDp product-tuple-listing js-tuple ']")); //div[contains(text(),'Quick')]
		builder.moveToElement(firstProd).perform();
		driverChrome.findElement(By.xpath("(//div[contains(text(),'Quick')])[1]")).click();
		
		
		//Print the cost and the discount percentage
		Thread.sleep(2000);
		
		WebElement printCP = driverChrome.findElement(By.xpath("//div[@class=' pdp-e-i-PAY clearfix']"));
		System.out.println(printCP.getText());
		
		// Take the snapshot of the shoes
		File screenshotAs = driverChrome.getScreenshotAs(OutputType.FILE);
		File target = new File("./snapit/snapdeal.png");
		FileUtils.copyFile(screenshotAs, target);
		
		//Close the current window
		driverChrome.findElement(By.xpath("//div[@class='close close1 marR10']")).click();
		
		//Close the main window
		Thread.sleep(5000);
		driverChrome.quit();
		
	}

}
