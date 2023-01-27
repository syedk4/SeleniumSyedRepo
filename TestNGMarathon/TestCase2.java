package TestNGMarathon;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase2 extends ParentClass {
	@Test(dataProvider = "fetchdata2")
	public void newOpprtunity(String OpName, String Amount) throws InterruptedException {
		Actions action = new Actions(driver);

		driver.findElement(By.xpath("//span[contains(text(),'View All Key Deals')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[name()='svg'and@data-key='chevrondown'])[1]")).click();
		driver.findElement(By.xpath("(//*[name()='svg'and@data-key='add'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(OpName);
		WebElement typeOp = driver
				.findElement(By.xpath("(//button[contains(@class,'slds-combobox__input slds-input_faux')])[2]"));
		typeOp.click();
		action.moveToElement(typeOp).sendKeys("New Customer", Keys.ENTER).perform();
		driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys(Amount);
		driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("2/20/2023");
		driver.findElement(By.xpath("//label[text()='Stage']/following::button")).click();
		driver.findElement(By.xpath("//label[text()='Stage']/following::span[text()='Needs Analysis']")).click();
		WebElement primary = driver.findElement(By.xpath("//label[text()='Primary Campaign Source']/following::input"));
		action.scrollToElement(primary).perform();
		primary.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='slds-listbox__option-text slds-listbox__option-text_entity']"))
				.click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();

		String getOpName = driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']")).getText();

		Assert.assertEquals(getOpName, OpName);

	}

	@DataProvider(name = "fetchdata2")
	public String[][] sendOppData() throws IOException {
		return ReadSFXLData.readOpData();
	}

}
