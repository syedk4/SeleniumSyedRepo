package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnToHandleAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.manage().window().maximize();
		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driverChrome.get("https://leafground.com/alert.xhtml");
		
		driverChrome.findElement(By.xpath("//span[text()='Show']")).click();
		//Step1: Switch the control to the alert
		
		//to read the alert message
		Alert alert = driverChrome.switchTo().alert();
		
		  String text = alert.getText(); 
		  
		  System.out.println(text);
		 
		driverChrome.findElement(By.xpath("//h5[contains(text(),'Confirm Dialog')]/following::span[text()='Show']")).click();
		// to accept the message
		//alert.accept();
		
		/*
		 * Alert alert2 = driverChrome.switchTo().alert(); alert2.dismiss();
		 */
		
		driverChrome.switchTo().alert().dismiss();
		
		driverChrome.findElement(By.xpath("//h5[contains(text(),'Prompt Dialog')]/following::span[text()='Show']")).click();
		
		Alert alert2 = driverChrome.switchTo().alert(); 
		alert2.sendKeys("Hari");
		alert2.accept();
		
		
		driverChrome.findElement(By.xpath("//span[text()='Delete']")).click();
		driverChrome.findElement(By.xpath("//span[text()='Yes']")).click();
		//String text = alert.getText(); System.out.println(text);
	}

}
