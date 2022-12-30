package week4.day2.Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandlingUsingMergeContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "http://leaftaps.com/opentaps/control/main";
		String UserName = "//input[@id='username']";
		String PassWord = "//input[@id='password']";
		String LoginButton = "//input[@class='decorativeSubmit']";
		String CRMSFA = "//a[contains(text(),'CRM/SFA')]";
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driverChrome = new ChromeDriver(options);
		driverChrome.manage().window().maximize();
		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driverChrome.get(url);
		//Enter UserName and Password
		driverChrome.findElement(By.xpath(UserName)).sendKeys("democsr");
		driverChrome.findElement(By.xpath(PassWord)).sendKeys("crmsfa");
		//Click on Login Button using
		driverChrome.findElement(By.xpath(LoginButton)).click();
		//Click on CRM/SFA Link
		driverChrome.findElement(By.xpath(CRMSFA)).click();
		//Click on Contacts
		driverChrome.findElement(By.xpath("//ul[@class='sectionTabBar']/li[3]")).click();
		//Click on Merge Contacts
		driverChrome.findElement(By.xpath("//ul[@class='shortcuts']/li[4]")).click();
		//Click on Widget From
		driverChrome.findElement(By.xpath("//img[@src='/images/fieldlookup.gif']")).click();
		//Handle the new window
		driverChrome.getWindowHandle();
		
		Set<String> allwindowHandles = driverChrome.getWindowHandles();
		List<String> listOfHandles = new ArrayList<String>(allwindowHandles);
		driverChrome.switchTo().window(listOfHandles.get(1));
		
		String getTittle = driverChrome.findElement(By.xpath("//span[@class='subSectionTitle']")).getText();
		System.out.println(getTittle);
		
		driverChrome.findElement(By.xpath("(//table[@class='x-grid3-row-table']/following::td)[1]")).click();
		
		driverChrome.switchTo().window(listOfHandles.get(0));
		
		
		driverChrome.findElement(By.xpath("//input[@id='ComboBox_partyIdFrom']/following::a[2]")).click();
		
		//
		
		Set<String> allwindowHandles1 = driverChrome.getWindowHandles();
		List<String> listOfHandles1 = new ArrayList<String>(allwindowHandles1);
		driverChrome.switchTo().window(listOfHandles1.get(1));
				  
		  driverChrome.findElement(By.xpath("//span[text()='Contact List']/following::table[2]/../following-sibling::div[2]/table/tbody/tr/td/div/a")).click();
		 
		  driverChrome.switchTo().window(listOfHandles1.get(0));
		  driverChrome.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		  
		  Alert alert =driverChrome.switchTo().alert();
		
		  System.out.println(alert.getText());
		  
		  alert.accept();
		  
		 String Title=driverChrome.getTitle();
		 
		 if (Title.equals("View Contact | opentaps CRM")) {
			 System.out.println(Title);
		}else {
			
			System.out.println("Title verification failed");
		}
		 
		
		 
		 
	}

}
