package TestNGMarathon;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class ParentClass {
	public ChromeDriver driver;
	
	  @Parameters({"url","username","password"})
	  @BeforeMethod
	  public void beforeMethod(String url, String userName, String passWord) {
		  
		  ChromeOptions ch=new ChromeOptions();
		  ch.addArguments("--disable-notifications");

		  	driver = new ChromeDriver(ch);
			driver.manage().window().maximize();
			
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.id("username")).sendKeys(userName);
			driver.findElement(By.id("password")).sendKeys(passWord);
			WebElement logIn2 = driver.findElement(By.id("Login"));
			logIn2.click();
			
			driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
			driver.findElement(By.xpath("//button[contains(text(),'View All')]")).click();
		  
			WebElement searchTask = driver.findElement(By.xpath("//input[@class='slds-input']"));
			searchTask.sendKeys("Content");
			
			WebElement tasks = driver.findElement(By.xpath(" //mark[contains(text(),'Content')]"));
			tasks.click();
			
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  
	  Thread.sleep(5000);
	  driver.close();
  }

}
