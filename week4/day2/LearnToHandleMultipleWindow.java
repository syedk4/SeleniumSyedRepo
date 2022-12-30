package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnToHandleMultipleWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.manage().window().maximize();
		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driverChrome.get("https://leafground.com/window.xhtml");
		
		driverChrome.findElement(By.xpath("//span[text()='Open']")).click();
		
		System.out.println(driverChrome.getTitle());
		
		String firstwindowHandle = driverChrome.getWindowHandle();
		System.out.println(firstwindowHandle);
		System.out.println("*****************************");
		
		//TO get all the refrences of all the opened window
		Set<String> allwindowHandles = driverChrome.getWindowHandles();//unoque handles; it maintains the order LinkedHashSet
		
		for (String eachHandle : allwindowHandles) {
			
			System.out.println(eachHandle);
			
		}
		System.out.println("*****************************");
		//Copy the set into List
		List<String> listOfHandles = new ArrayList<String>(allwindowHandles);
	
		String secondWindow = listOfHandles.get(1);
		
		//to switch control to the second window
		driverChrome.switchTo().window(secondWindow);
		System.out.println(driverChrome.getTitle());
		
		driverChrome.close();
		
		driverChrome.switchTo().window(listOfHandles.get(0));
		System.out.println(driverChrome.getTitle());
		
	}

}
