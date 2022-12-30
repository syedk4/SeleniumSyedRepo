package week4.day1.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.manage().window().maximize();
		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driverChrome.get("https://leafground.com/select.xhtml;jsessionid=node01b6hhw7csjf211q4hnvqtdlyg710515.node0");

		WebElement select1 = driverChrome
				.findElement(By.xpath("//div[@class='col-12']//select[@class='ui-selectonemenu']"));
		Select dp1 = new Select(select1);
		dp1.selectByVisibleText("Selenium");

		driverChrome.findElement(By.xpath("//div[@id='j_idt87:country']")).click();
		driverChrome.findElement(By.xpath("//li[text()='India']")).click();
		Thread.sleep(5000);

		driverChrome.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[2]")).click();

		driverChrome.findElement(By.xpath("//li[text()='Chennai']")).click();
		Thread.sleep(5000);
		driverChrome.findElement(By.xpath(
				"//div[@id='j_idt87:auto-complete']//button[@class='ui-autocomplete-dropdown ui-button ui-widget ui-state-default ui-corner-right ui-button-icon-only']"))
				.click();
		driverChrome.findElement(By.xpath("(//span[@id='j_idt87:auto-complete_panel']//li)[3]")).click();
		Thread.sleep(5000);

		driverChrome.findElement(By.xpath("(//div[@class='ui-helper-hidden-accessible']/following-sibling::label)[3]"))
				.click();

		driverChrome
				.findElement(By
						.xpath("(//div[@class='ui-selectonemenu-items-wrapper']//ul[@id='j_idt87:lang_items']//li)[2]"))
				.click();

		Thread.sleep(5000);
		driverChrome.findElement(By.xpath("//label[@id='j_idt87:value_label']")).click();
		driverChrome
				.findElement(By.xpath(
						"(//div[@class='ui-selectonemenu-items-wrapper']//ul[@id='j_idt87:value_items']//li)[2]"))
				.click();

	}

}
