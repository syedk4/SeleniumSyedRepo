package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnToTakeScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ChromeDriver driverChrome = new ChromeDriver();
		driverChrome.manage().window().maximize();
		driverChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
		driverChrome.get("http://leaftaps.com/opentaps/control/main");
		
		//Step 1 take the screenshot
		
		File screenshotAs = driverChrome.getScreenshotAs(OutputType.FILE);
		
		//Step 2 decide define the target
		File target = new File("./snapit/leaftaps.png");
		
		
		//Step 3 save the source to the target
		FileUtils.copyFile(screenshotAs, target);
	}

}
