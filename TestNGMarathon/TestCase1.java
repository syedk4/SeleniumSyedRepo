package TestNGMarathon;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testcase.ReadXLData;

public class TestCase1 extends ParentClass {
  @Test(dataProvider = "fetchData")
  public void salesForce(String Question, String Question2, String Quest1x, String Quest2x) {
	  	Actions action = new Actions(driver);
		

		WebElement chatter = driver.findElement(By.xpath("//span[text()='Chatter']"));
		action.moveToElement(chatter).click().perform();
		//chatter.click();
		String title = driver.getTitle();
		System.out.println("Title of the page is: "+title);
		driver.findElement(By.xpath("(//a[@class='tabHeader'])[3]")).click();
		WebElement enterQuestion = driver.findElement(By.xpath("//textarea[@class='cuf-questionTitleField textarea']"));
		enterQuestion.sendKeys(Question);
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand cuf-publisherShareButton qe-questionPostDesktop MEDIUM']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'What would you like to know?')]")).click();
		enterQuestion.sendKeys(Question2);
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand cuf-publisherShareButton qe-questionPostDesktop MEDIUM']")).click();
		
		WebElement findElement1 = driver.findElement(By.xpath(Quest1x));
		System.out.println(findElement1.getText());
		String quest1 = findElement1.getText();
		
		assertEquals(Question, quest1);
		
		WebElement findElement2 = driver.findElement(By.xpath(Quest2x));
		System.out.println(findElement2.getText());
		String quest2 = findElement2.getText();
		
		assertEquals(Question2, quest2);
		
  }
  
   
  @DataProvider(name = "fetchData")
	public String[][] sendData() throws IOException {

		return ReadSFXLData.readData();

	}
  
  
}
