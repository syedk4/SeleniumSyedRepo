package week4.day1.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BuyTheValue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driverChrome = new ChromeDriver(options);
		driverChrome.manage().window().maximize();
		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driverChrome.get("https://buythevalue.in/");
		//driverChrome.findElement(By.id("com-hextom-smartpushmarketing-modal-close-modal")).click();
		
		driverChrome.findElement(By.xpath("(//div[@class='grid-item product-item'])[1]")).click();
		
		
		WebElement frameChat = driverChrome.findElement(By.xpath("//iframe[@title='chat widget']"));
		driverChrome.switchTo().frame(frameChat);
		driverChrome.findElement(By.xpath("//button[@aria-label='Dismiss']")).click();		
		driverChrome.switchTo().defaultContent();
		
		
		WebElement check = driverChrome.findElement(By.xpath("//input[@name='wk_zipcode']"));
		check.sendKeys("600002");
		
		driverChrome.findElement(By.xpath("//input[@value='Check']")).click();
		
		driverChrome.findElement(By.id("product-add-to-cart")).click();
		Thread.sleep(10000);
		driverChrome.findElement(By.xpath("//span[@data-hover='View Cart']")).click();
		
		driverChrome.findElement(By.id("checkout")).click();
		driverChrome.switchTo().alert().accept();
		driverChrome.findElement(By.id("agree")).click();
		
		
	}

}
