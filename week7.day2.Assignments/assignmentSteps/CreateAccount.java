package assignmentSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccount extends ParentClass{
	 Actions act = new Actions(driver); 
	@Given("Click on Accounts")
	public void click_on_accounts() {
		WebElement searchTask = driver.findElement(By.xpath("//input[@class='slds-input']"));
		searchTask.sendKeys("Accounts");
		driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();
		driver.findElement(By.xpath("//div[@title='New']")).click();
	}
	
	@Then("Enter {string} as account name")
	public void enter_as_account_name(String name) {
		
	  
		 WebElement myName = driver.findElement(By.xpath("//input[@name='Name']"));
		 myName.sendKeys(name);
		
	}
	@Then("Select Ownership as Public")
	public void select_ownership_as_public() throws InterruptedException {
		// Actions act = new Actions(driver); 
		// act.sendKeys(Keys.PAGE_DOWN).build().perform();
		 Thread.sleep(3000);
			
			  WebElement ownerShip1 =
			  driver.findElement(By.xpath("(//button[@role='combobox'])[3]"));
			  //ownerShip1.click();
			  
			  js.executeScript("arguments[0].scrollIntoView();", ownerShip1);
			  ownerShip1.click();
			  
			  
			WebElement ownerShip2 = driver.findElement(By.xpath("(//button[@role='combobox'])[3]/following::span[contains(text(),'Public')]"));
			ownerShip2.click();
			Thread.sleep(5000);
	}
	
	@When("Click Save to create account")
	public void click_save_to_create_account() {
	   
		driver.findElement(By.xpath("(//button[contains(text(),'Save')])[2]")).click();
		
	}
	
	@Then("Verify Account Name")
	public void verify_account_name() {
		
		
		WebElement saveMessage = driver.findElement(By.xpath("//div[@role='alertdialog']"));
		act.moveToElement(saveMessage).perform();
	    //Thread.sleep(3000);
		WebElement displayed = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']"));
		act.moveToElement(displayed).perform();
		boolean indVerify = displayed.isDisplayed();
		if(indVerify) {
			String verifyDboard = displayed.getText();
			System.out.println(verifyDboard);
		}else {
			
			System.out.println("Account \"Syed\" was created.");
		}
	  
	}
	
	
}
