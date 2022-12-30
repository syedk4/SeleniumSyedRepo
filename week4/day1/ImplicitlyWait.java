package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.manage().window().maximize();
		driverChrome.get("https://login.salesforce.com/");
		
		
		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement UserName = driverChrome.findElement(By.id("username"));
		UserName.sendKeys("hari.radhakrishnan@qeagle.com");
		WebElement PassWord = driverChrome.findElement(By.id("password"));
		PassWord.sendKeys("Testleaf$321");
		
		WebElement LogIn = driverChrome.findElement(By.id("Login"));
		LogIn.click();
		
		
		driverChrome.findElement(By.className("slds-icon-waffle")).click();
		
		driverChrome.findElement(By.xpath("//button[text()='View All']")).click();
		
		
		
	}

}
