package week4.day1.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ServiceNow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driverChrome = new ChromeDriver(options);
		driverChrome.manage().window().maximize();
		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driverChrome.get("https://dev110326.service-now.com/");
		
		WebElement firstFrame = driverChrome.findElement(By.xpath("//iframe[@id='gsft_main']"));
		driverChrome.switchTo().frame(firstFrame);
		
		String userName = driverChrome.findElement(By.xpath("//label[@class='control-label']")).getText();
		System.out.println("Enter"+userName);
		
		driverChrome.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		driverChrome.findElement(By.xpath("//input[@id='user_password']")).sendKeys("India@123");
		driverChrome.findElement(By.xpath("//button[@id='sysverb_login']")).click();
		
		
		
	}

}
