package week4.day2.Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingWindowLeafGround {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driverChrome = new ChromeDriver(options);
		driverChrome.manage().window().maximize();
		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driverChrome.get("https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");

		String Open = driverChrome.findElement(By.xpath("//h5[contains(text(),'Click and ')]")).getText();
		System.out.println(Open);
		driverChrome.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		System.out.println("Opened new tab");
		System.out.println(driverChrome.getTitle());

		Set<String> allWindowsHande = driverChrome.getWindowHandles();
		List<String> handleWindows = new ArrayList<String>(allWindowsHande);
		driverChrome.switchTo().window(handleWindows.get(1));
		System.out.println(driverChrome.getTitle());
		driverChrome.close();
		driverChrome.switchTo().window(handleWindows.get(0));
		System.out.println("Navigate back to Main window");
		System.out.println(driverChrome.getTitle());

		driverChrome.findElement(By.xpath("//div[@class='card']/following::button[1]")).click();
		Set<String> allWindowsHande2 = driverChrome.getWindowHandles();
		List<String> handleWindows2 = new ArrayList<String>(allWindowsHande2);
		driverChrome.switchTo().window(handleWindows2.get(2));
		System.out.println(driverChrome.getTitle());
		driverChrome.close();
		driverChrome.switchTo().window(handleWindows2.get(1));
		System.out.println(driverChrome.getTitle());
		driverChrome.close();
		driverChrome.switchTo().window(handleWindows.get(0));
		System.out.println(driverChrome.getTitle());

	

	}

}
