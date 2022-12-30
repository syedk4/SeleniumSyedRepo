package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.manage().window().maximize();
		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driverChrome.get("https://leafground.com/alert.xhtml");
		
		driverChrome.findElement(By.xpath("(//h5[contains(text(),'Confirm Dialog')]/following::span[text()='Show'])[1]")).click();
		
		Alert alert = driverChrome.switchTo().alert();
		
		  String text = alert.getText(); 
		  
		  System.out.println(text);
		  
		  alert.accept();
		
	}
	//h2[contains(text(),'Try it')]/following::span[text()='Show'])[1]
}
