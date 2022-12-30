package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IRCTCExcericise {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notification--");
		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.manage().window().maximize();
		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driverChrome.get("https://www.irctc.co.in/");
		
		/*
		 * Alert alert = driverChrome.switchTo().alert(); alert.accept();
		 */
		driverChrome.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[5]/a")).click();
		driverChrome.getWindowHandle();
		
		Set<String> allwindowHandles = driverChrome.getWindowHandles();//unoque handles; it maintains the order LinkedHashSet
		List<String> listOfHandles = new ArrayList<String>(allwindowHandles);
		driverChrome.switchTo().window(listOfHandles.get(1));
		File screenshotAs = driverChrome.getScreenshotAs(OutputType.FILE);
		File target = new File("./snapit/flgihts.png");
		FileUtils.copyFile(screenshotAs, target);
		driverChrome.close();
		driverChrome.switchTo().window(listOfHandles.get(0));
		System.out.println(driverChrome.getTitle());
		
	}

}
