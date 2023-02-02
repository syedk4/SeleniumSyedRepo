package assignmentSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateIndividuals extends ParentClass {

	@Then("Click on New Individual")
	public void click_on_new_individual() {
	   
		WebElement searchTask = driver.findElement(By.xpath("//input[@class='slds-input']"));
		searchTask.sendKeys("Individuals");
		driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();
		driver.findElement(By.xpath("//div[@title='New']")).click();
	}
	@Then("Enter the Last Name as {string}")
	public void enter_the_last_name_as(String name) {
	    WebElement lastName = driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
	    lastName.sendKeys(name);
	   
	}
	@When("Click save")
	public void click_save() {
	   
		driver.findElement(By.xpath("(//span[contains(text(),'Save')])[3]")).click();
		
	}
	@Then("Verify Individuals Name")
	public void verify_individuals_name() {
	    
Actions act = new Actions(driver);
		
		WebElement saveMessage = driver.findElement(By.xpath("//div[@role='alertdialog']"));
		act.moveToElement(saveMessage).perform();
	    //Thread.sleep(3000);
		WebElement displayed = driver.findElement(By.xpath("//span[text()='Individual']"));
		act.moveToElement(displayed).perform();
		
		boolean indVerify = displayed.isDisplayed();
		if(indVerify) {
			String verifyDboard = displayed.getText();
			System.out.println(verifyDboard);
		}else {
			
			System.out.println("Message Not Displayed");
		}
		
	   
		
		
	}
	
	
	
}
