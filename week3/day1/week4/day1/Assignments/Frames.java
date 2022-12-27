package week4.day1.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.manage().window().maximize();
		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driverChrome.get("https://chercher.tech/practice/frames-example-selenium-webdriver");

		driverChrome.switchTo().frame("frame1");

		String text = driverChrome.findElement(By.id("topic")).getText();
		System.out.println(text);

		driverChrome.findElement(By.xpath("/html/body/input")).sendKeys("TEST FRAME1");

		driverChrome.switchTo().frame("frame3");
		String text2 = driverChrome.findElement(By.xpath("/html/body/b")).getText();
		System.out.println(text2);
		driverChrome.findElement(By.id("a")).click();

		driverChrome.switchTo().defaultContent();

		driverChrome.switchTo().frame("frame2");
		String text3 = driverChrome.findElement(By.xpath("/html/body/b")).getText();
		System.out.println(text3);
		WebElement dd = driverChrome.findElement(By.id("animals"));

		Select drop = new Select(dd);
		drop.selectByVisibleText("Baby Cat");

	}

}
