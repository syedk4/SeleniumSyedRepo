package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearToHandleWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.manage().window().maximize();
		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driverChrome.get("https://leafground.com/table.xhtml");
		
		List<WebElement> allrows = driverChrome.findElements(By.xpath("(//span[text()='Customer Analytics Table']/following::table)[2]/tbody/tr"));
		
		
		
		//(//span[text()='Customer Analytics Table']/following::table)[2]
		//want to find how many rows are available.
		
		for (int i = 1; i <= allrows.size(); i++) {
			//if we dont know the td
			List<WebElement> allTd = driverChrome.findElements(By.xpath("(//span[text()='Customer Analytics Table']/following::table)[2]/tbody/tr["+i+"]/td"));
			
			for (int j = 1; j <= allTd.size(); j++) {
				
				
				String text = driverChrome.findElement(By.xpath("(//span[text()='Customer Analytics Table']/following::table)[2]/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(text);
				
			}
			
			
			
			
		}
		
		
		//System.out.println(allrows.size());
		
	}

}
