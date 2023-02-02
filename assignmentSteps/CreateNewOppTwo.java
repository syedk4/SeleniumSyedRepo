package assignmentSteps;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Then;

public class CreateNewOppTwo extends ParentClass {
	Actions act = new Actions(driver);
	@Then("Choose close date as Tomorrow Date")
	public void choose_close_date_as_tomorrow_date() {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, 1);
		Date tomorrow = calendar.getTime();
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		String tomorrowAsString = dateFormat.format(tomorrow);

		// Select the date in the desired field in the web page
		WebElement dateField = driver.findElement(By.xpath("//input[@name=\"CloseDate\"]"));
		dateField.sendKeys(tomorrowAsString);

	}
	@Then("Click on save")
	public void click_on_save() {

		driver.findElement(By.xpath("(//button[contains(text(),'Save')])[2]")).click();

	}
	@Then("Verify the alert message")
	public void verify_the_alert_message() throws InterruptedException {

		Thread.sleep(5000);
		
		WebElement textAlert = driver.findElement(By.xpath("//header[@class='pageErrorHeader slds-popover__header']"));
		act.moveToElement(textAlert).perform();
		System.out.println(textAlert.getText());
		
		boolean verTextAlert = textAlert.isDisplayed();
		
		if (verTextAlert) {
			List<WebElement> reviewFields = driver.findElements(By.xpath("//ul[@class='errorsList slds-list_dotted slds-m-left_medium']"));
			for (WebElement webElement : reviewFields) {

				String textVer = webElement.getText();
				System.out.println(textVer);
			}
			
			
			
			
		} else {
			
			System.out.println("Something Went Wrong!!!");
		}
		
	}
	
	
	
}
