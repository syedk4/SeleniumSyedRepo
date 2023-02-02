package assignmentSteps;

import javax.annotation.processing.SupportedSourceVersion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateNewDashboard extends ParentClass {

	@Given("Click on Dashboard")
	public void clickDashboard() {
		WebElement searchTask = driver.findElement(By.xpath("//input[@class='slds-input']"));
		searchTask.sendKeys("Dashboards");
		driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();
		
	}
	
	@Then("Verify the dashboard title")
	public void verify_the_dashboard_title() {
		
	   System.out.println(driver.getTitle());
	}
	@When("New Dashboard is clicked")
	public void new_dashboard_is_clicked() {
		driver.findElement(By.xpath("//div[@title='New Dashboard']")).click();
		
	}
	@Then("Enter the Name and click on the Create")
	public void enter_the_name_and_click_on_the_create() throws InterruptedException {
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@title='dashboard']"));
		
		
		driver.switchTo().frame(frame);
		Thread.sleep(3000);
		 driver.findElement(By.id("dashboardNameInput")).sendKeys("Salesforce Automation by Syed");
		    driver.findElement(By.id("submitBtn")).click();
		    Thread.sleep(3000);
		   driver.switchTo().defaultContent();
	   
	}
	@When("Click on Save")
	public void click_on_save() throws InterruptedException {
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@title='dashboard']"));
	    driver.switchTo().frame(frame2);
	    Thread.sleep(3000);
	 
	    driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
	    driver.switchTo().defaultContent();
	}
	@Then("Verify the Dashboard name")
	public void verify_the_dashboard_name() throws InterruptedException {
		Actions act = new Actions(driver);
		
		WebElement saveMessage = driver.findElement(By.xpath("//div[@role='alertdialog']"));
		act.moveToElement(saveMessage).perform();
	    Thread.sleep(3000);
		WebElement displayed = driver.findElement(By.xpath("//span[text()='Dashboard saved']"));
		act.moveToElement(displayed).perform();
		String verifyDboard = displayed.getText();
		
		Assert.assertTrue(verifyDboard.contains("Dashboard saved"));
		
	   System.out.println(verifyDboard);
		
	
	
	}

	
	
}
