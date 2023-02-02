package assignmentSteps;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class ParentClass extends AbstractTestNGCucumberTests {

public static ChromeDriver driver;
public static JavascriptExecutor js; 	
	
	@BeforeMethod
	public void preCondition() {
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		js = (JavascriptExecutor) driver;
		driver.get("https://qeagle-dev-ed.my.salesforce.com/");
		
	}
	
	@AfterMethod
	public void posCondition() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
	
	
	
}
