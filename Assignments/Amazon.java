package week4.day2.Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Amazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.manage().window().maximize();
		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driverChrome.get("https://www.amazon.in/");
		Actions builder = new Actions(driverChrome);
		
		driverChrome.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
		builder.scrollByAmount(10, 0);
		String price = driverChrome.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println("Thre price of the mobile is: "+price.replaceAll("[^1-9,]", " ")); //span[@class='a-size-base s-underline-text']
		System.out.println("Number of customers reviewd:"+driverChrome.findElement(By.xpath("//span[@class='a-size-base s-underline-text']")).getText());
		
		driverChrome.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal'][1]")).click();
		
		Set<String> windowSet = driverChrome.getWindowHandles();
		List<String> newWindow = new ArrayList<String>(windowSet);
		driverChrome.switchTo().window(newWindow.get(1));
		builder.scrollByAmount(25, 0);
		
		File screenshotAs = driverChrome.getScreenshotAs(OutputType.FILE);
		File target = new File("./snapit/amazon.png");
		FileUtils.copyFile(screenshotAs, target);
		
		driverChrome.findElement(By.id("add-to-cart-button")).click();
		String cartSubtotal = driverChrome.findElement(By.id("attach-accessory-cart-subtotal")).getText();
		System.out.println(cartSubtotal.replaceAll("[^1-9,]"," "));
		
		assert price == cartSubtotal;
		
		//Assert.assertEquals(price, cartSubtotal);
		
		driverChrome.close();
		
		
	}

}
