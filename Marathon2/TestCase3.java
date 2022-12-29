package Marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;



public class TestCase3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driverChrome = new ChromeDriver(options);
		driverChrome.manage().window().maximize();
		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driverChrome.get("https://dev125530.service-now.com");
		
		driverChrome.findElement(By.id("user_name")).sendKeys("admin");
		driverChrome.findElement(By.id("user_password")).sendKeys("UH=UNe@3dzl9");
		driverChrome.findElement(By.id("sysverb_login")).click();
		
		  //Alert alert = driverChrome.switchTo().alert(); alert.dismiss();
		 		
		Shadow s = new Shadow(driverChrome);
		s.setImplicitWait(10);
		s.findElementByXPath("//div[text()='All']").click();
		s.setImplicitWait(10);
		s.findElementByXPath("//span[(contains(text(),'Service Catalog'))]").click();
		WebElement findframe = s.findElementByXPath("//iframe[@id='gsft_main']");
		
		driverChrome.switchTo().frame(findframe);
		driverChrome.findElement(By.xpath("(//td[@class='homepage_category_only_image_cell'])[8]")).click();
		
		s.findElementByXPath("//strong[text()='Apple iPhone 13']").click();
		driverChrome.findElement(By.xpath("(//label[@class='radio-label'])[2]")).click();
		
		WebElement data = driverChrome.findElement(By.xpath("//select[@class='form-control cat_item_option ']"));
		Actions builder = new Actions(driverChrome);
		
		builder.scrollToElement(data).perform();
		
		//WebElement data = driverChrome.findElement(By.xpath("//select[@class='form-control cat_item_option ']"));
		Select seldata = new Select(data);
		seldata.selectByVisibleText("500MB");
		
		driverChrome.findElement(By.id("oi_order_now_button")).click();
		WebElement orderReq = driverChrome.findElement(By.id("requesturl"));
		System.out.println("Order Number: "+ orderReq.getText());
		
		
		
		File screenshotAs = driverChrome.getScreenshotAs(OutputType.FILE);
		File target = new File("./snapit/servicenoworder.png");
		FileUtils.copyFile(screenshotAs, target);
		
		
	}

}
