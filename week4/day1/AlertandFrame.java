package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertandFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.manage().window().maximize();
		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driverChrome.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		
		driverChrome.switchTo().frame("iframeResult");
		driverChrome.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		
		
		Alert alert = driverChrome.switchTo().alert();
		alert.sendKeys("Syed");
		alert.accept();
		
		//String text = driverChrome.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		String text = driverChrome.findElement(By.id("demo")).getText();
		System.out.println(text);
		
		
	}

}
