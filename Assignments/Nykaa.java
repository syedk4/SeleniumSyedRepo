package week4.day2.Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driverChrome = new ChromeDriver(options);
		driverChrome.manage().window().maximize();
		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driverChrome.get("https://www.nykaa.com/");
		
		//Creating a WebElement	
		WebElement Brands = driverChrome.findElement(By.xpath("(//a[@class='css-1mavm7h'])[2]"));
		//Creating Actions to mouse hover on a element 
		Actions builder = new Actions(driverChrome);
		builder.moveToElement(Brands).perform();
		//Selecting the Brand
		Brands.findElement(By.xpath("(//div[@class='css-ov2o3v']/a)[6]")).click();
		//Printing the Title
		System.out.println(driverChrome.getTitle());
		
		//Clicking sort by and selecting customer top rated filter	
		driverChrome.findElement(By.xpath("//span[@class='sort-name']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driverChrome;
		js.executeScript("window.scrollBy(0,500)");
		driverChrome.findElement(By.xpath("(//div[@class='control-indicator radio '])[3]")).click();
		
		//Click Category and click Hair->Click haircare->Shampoo
		driverChrome.findElement(By.xpath("//*[name()='div' and@id='first-filter']//*[local-name()='svg']")).click();
		Thread.sleep(5000);
		driverChrome.findElement(By.xpath("(//*[name()='span' and@class='side-count']//*[local-name()='svg'])[2]")).click();
		Thread.sleep(5000);
		driverChrome.findElement(By.xpath("(//*[name()='ul' and@class='scroll css-1e7z8zv']//*[local-name()='svg'])[1]")).click();
		Thread.sleep(5000);
		driverChrome.findElement(By.xpath("(//*[name()='div' and@class='control-indicator checkbox '])")).click();
		
		//Click->Concern->Color Protection
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(3000);
		driverChrome.findElement(By.xpath("(//*[name()='div' and@class='css-xdicx1']//*[local-name()='svg'])[6]")).click();
		Thread.sleep(3000);
		driverChrome.findElement(By.xpath("(//*[name()='div' and@class='control-indicator checkbox '])[9]")).click();
		
		//check whether the Filter is applied with Shampoo
		String checkFilter = driverChrome.findElement(By.xpath("//*[name()='span' and@class='filter-value']")).getText();
		Assert.assertEquals(checkFilter, "Shampoo");
		System.out.println(checkFilter);
		
		//Click on L'Oreal Paris Colour Protect Shampoo
		Thread.sleep(3000);
		driverChrome.findElement(By.xpath("//*[name()='div' and@class='css-43m2vm']")).click();
		
		//GO to the new window and select size as 175ml
		Set<String> allWindowsHande = driverChrome.getWindowHandles();
		List<String> handleWindows = new ArrayList<String>(allWindowsHande);
		driverChrome.switchTo().window(handleWindows.get(1));
		System.out.println(driverChrome.getTitle());
		WebElement selectSize = driverChrome.findElement(By.xpath("//*[name()='select' and@class='css-2t5nwu']"));
		Thread.sleep(3000);
		Select dd1 = new Select(selectSize);
		dd1.selectByVisibleText("175ml");
		
		//Print the MRP of the product //*[name()='span' and@class='css-1jczs19']
		WebElement printMRP = driverChrome.findElement(By.xpath("//*[name()='span' and@class='css-1jczs19']"));
		System.out.println(printMRP.getText());
		
		// Click on ADD to BAG
		driverChrome.findElement(By.xpath("//*[name()='span' and@class='btn-text']")).click();
					
		//Go to Shopping Bag 
		driverChrome.findElement(By.xpath("//*[name()='button' and@class='css-g4vs13']//*[local-name()='svg']")).click();
		
		//Print the Grand Total amount
		driverChrome.switchTo().frame(driverChrome.findElement(By.xpath("//*[name()='iframe' and@class='css-acpm4k']")));
		Thread.sleep(3000);
		String printGrandTotal = driverChrome.findElement(By.xpath("//*[name()='span' and@class='css-1um1mkq e171rb9k3']")).getText();
		System.out.println("Grand Total = "+printGrandTotal);
		
		//Click Proceed //*[name()='div' and @class='css-15vhhhd e25lf6d4']
		
		driverChrome.findElement(By.xpath("//*[name()='div' and @class='css-15vhhhd e25lf6d4']")).click();
		
		//Click on Continue as Guest
		Thread.sleep(3000);
		driverChrome.switchTo().window(handleWindows.get(1));
		System.out.println(driverChrome.getTitle());
		driverChrome.findElement(By.xpath("(//*[name()='button'and @class = 'css-110s749 e8tshxd1'])[2]")).click();
		
		//Check if this grand total is the same in step 14
		driverChrome.findElement(By.xpath("//*[name()='span' and@class='css-175whwo ehes2bo0']")).click();
		//*[name()='span' and@class='css-9rfiyb ehes2bo3']
		
		driverChrome.findElement(By.xpath("//*[name()='span' and@class='css-9rfiyb ehes2bo3']")).click();
		
		String verifyGtotal = driverChrome.findElement(By.xpath("(//*[name()='div' and@class='css-vlqrtx e1d9ugpt3'])[3]")).getText();
		Assert.assertEquals(printGrandTotal, verifyGtotal);
		System.out.println("Verify the Grant Total"+printGrandTotal+ " = "+verifyGtotal);
		
		//Close all windows
		driverChrome.quit();
		
	}

}
