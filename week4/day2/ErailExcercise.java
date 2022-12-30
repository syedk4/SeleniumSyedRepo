package week4.day2;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ErailExcercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notification--");
		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.manage().window().maximize();
		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driverChrome.get("https://www.erail.in");
		
		
		
		driverChrome.findElement(By.id("txtStationFrom")).clear();
		driverChrome.findElement(By.id("txtStationFrom")).sendKeys("ms", Keys.TAB);
		driverChrome.findElement(By.id("txtStationTo")).clear();
		driverChrome.findElement(By.id("txtStationTo")).sendKeys("mdu", Keys.TAB);
		
		driverChrome.findElement(By.id("chkSelectDateOnly")).click();
		
	List<WebElement> allrows = driverChrome.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr"));
		
	Set<String> setOfTrainNames = new LinkedHashSet<String>();
	
		for (int i = 0; i < allrows.size(); i++) {
			
			String trains = driverChrome.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr["+i+"]/td[2]")).getText();
			System.out.println(trains);
			setOfTrainNames.add(trains);
			
			if (!setOfTrainNames.add(trains)) {
				System.out.println(trains);
			}
			
		}
		
		
		if (allrows.size() - 1 == setOfTrainNames.size() ) {
			System.out.println("No duplicates");
		} else {
			System.out.println("Duplcates train name");
		}
		
		
	}

}
