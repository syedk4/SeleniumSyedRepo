package Marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driverChrome = new ChromeDriver(options);
		driverChrome.manage().window().maximize();
		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driverChrome.get("https://login.salesforce.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driverChrome;
		js.executeScript("window.scrollBy(0,500)");
		
		//Login
		driverChrome.findElement(By.xpath("//*[name()='input' and@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		driverChrome.findElement(By.xpath("//*[name()='input' and@id='password']")).sendKeys("Testleaf$321");
		driverChrome.findElement(By.xpath("//*[name()='input' and@id='Login']")).click();
		
		Thread.sleep(3000);
		driverChrome.findElement(By.xpath("(//*[name()='span' and@class=' label bBody'])[2]")).click();
		
		Set<String> windows = driverChrome.getWindowHandles();
		List<String> allWindows = new ArrayList<String>(windows);
		driverChrome.switchTo().window(allWindows.get(1));
		driverChrome.findElement(By.xpath("//*[name()='button' and@class='slds-button slds-button_brand']")).click();
		
		
		
		Shadow shadow = new Shadow(driverChrome);
		shadow.setImplicitWait(10);
		WebElement Learning = shadow.findElementByXPath("//span[text()='Learning']");
		Learning.click();
		
		WebElement Learning2 = shadow.findElementByXPath("//span[text()='Learning on Trailhead']");
		Actions builder = new Actions(driverChrome);
		builder.moveToElement(Learning2).perform();
		builder.scrollToElement(Learning2).perform();
		WebElement certification = shadow.findElementByXPath("//h4/a[text()='Salesforce Certification']");
		builder.scrollToElement(certification).perform();
		certification.click();
		
		driverChrome.switchTo().window(allWindows.get(1));
		String verify = driverChrome.getTitle();
		System.out.println(verify);
		
		driverChrome.findElement(By.xpath("//*[name()='div' and@class='roleMenu-item ']")).click();
		
		WebElement summary = driverChrome.findElement(By.xpath("//*[name()='h1' and@class='cert-site_title slds-p-vertical--large']"));
		System.out.println(summary.getText());
		builder.scrollToElement(summary).perform();
		
		
		WebElement salesArcCert = driverChrome.findElement(By.xpath("//h1[contains(text(),'Salesforce Architect Credentials')]"));
		builder.scrollToElement(salesArcCert).perform();
		System.out.println(salesArcCert.getText());
		
		List<WebElement> listOfCertifications = driverChrome.findElements(By.xpath("//*[name()='div' and@class='credentials-card_title']"));
		//builder.scrollToElement(certification).perform();
		
		//System.out.println(listOfCertifications.size());
		
		for (WebElement webElement : listOfCertifications) {
			String text = webElement.getText();
			//System.out.println(text);
		}
		
		
		WebElement AppArch = driverChrome.findElement(By.xpath("//a[contains(text(),'Application Architect')]"));
		builder.scrollToElement(AppArch);
		AppArch.click();
		
		
		List<WebElement> listOfArchCertifications = driverChrome.findElements(By.xpath("//*[name()='div' and@class='credentials-card_title']"));
		//builder.scrollToElement(certification).perform();
		
		//System.out.println(listOfArchCertifications.size());
		
		for (WebElement webElement : listOfArchCertifications) {
			String text2 = webElement.getText();
			//System.out.println(text2);
		}
		
		
		
		List<WebElement> listOfappArchCertifications = driverChrome.findElements(By.xpath("//*[name()='div' and@class='credentials-card_title']"));
		//builder.scrollToElement(certification).perform();
		
		System.out.println(listOfappArchCertifications.size());
		
		for (WebElement webElement : listOfappArchCertifications) {
			String appArch = webElement.getText();
			System.out.println(appArch);
		}
		
		
		
		File screenshotAs = driverChrome.getScreenshotAs(OutputType.FILE);
		File target = new File("./snapit/servicenow2.png");
		FileUtils.copyFile(screenshotAs, target);
		
		
		
	}

}
