package assignmentSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateOppSteps extends ParentClass {

	Actions act = new Actions(driver);

	@Given("Enter the username as {string} and password as {string}")
	public void enter_the_username_as_and_password_as(String username, String password) {

		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);

	}

	@When("Click on Login button")
	public void click_on_login_button() {

		WebElement logIn2 = driver.findElement(By.id("Login"));
		logIn2.click();

	}

	@Then("Homepage should be displayed")
	public void homepage_should_be_displayed() {

		System.out.println(driver.getTitle());

	}

	@Given("Click on toggle menu button from the left corner")
	public void click_on_toggle_menu_button_from_the_left_corner() {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	}

	@Given("Click View All link")
	public void click_on_View_All_link() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'View All')]")).click();

	}

	@Given("Click Sales link")
	public void clicl_on_Sales_linl() {
		WebElement searchTask = driver.findElement(By.xpath("//input[@class='slds-input']"));
		searchTask.sendKeys("Sales");

		WebElement tasks = driver.findElement(By.xpath("(//p[@class='slds-truncate'])[3]"));
		tasks.click();
	}

	@Then("Click Opportunities")
	public void click_opportunities() {
		WebElement oppEle = driver.findElement(By.xpath("(//span[@class='slds-truncate'])[3]"));

		act.moveToElement(oppEle).click().perform();

	}

	@Then("Click New")
	public void click_new() {// div[@title='New']
		driver.findElement(By.xpath("//div[@title='New']")).click();

	}

	@Then("Enter Opportunity name as {string}")
	public void enter_opportunity_name_as(String name) {

		driver.findElement(By.xpath("//input[@name=\"Name\"]")).sendKeys("Salesforce Automation by " + name);

	}

	@Then("Choose close date as Today")
	public void choose_close_date_as_today() {
		driver.findElement(By.xpath("//input[@name=\"CloseDate\"]")).click();
		driver.findElement(By.xpath("//button[text()='Today']")).click();
	}

	@Then("Select {string} as Need Analysis and Save")
	public void select_as_need_analysis_and_Save(String stageOption) {

		WebElement stage = driver.findElement(By.xpath("(//button[@role='combobox'])[1]"));
		stage.click();

		driver.findElement(By.xpath("(//button[@role='combobox'])[1]/following::span[@title='" + stageOption + "']"))
				.click();

		driver.findElement(By.xpath("(//button[contains(text(),'Save')])[2]")).click();

	}

	@Then("Verify opportunity Name")
	public void verify_opportunity_name() {
		WebElement saveMessage = driver.findElement(By.xpath("//div[@role='alertdialog']"));
		act.moveToElement(saveMessage).perform();
		// Thread.sleep(3000);
		WebElement displayed = driver
				.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']"));
		act.moveToElement(displayed).perform();
		boolean indVerify = displayed.isDisplayed();
		if (indVerify) {
			String verifyDboard = displayed.getText();
			System.out.println(verifyDboard);
		} else {

			System.out.println("Opportunity \"Syed\" was created.");
		}
	}

	// span[contains(text(),'Opportunities')]
}
