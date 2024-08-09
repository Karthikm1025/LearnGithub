package selenium_Practise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.gecko.driver", "C:\\Users\\karthikmo\\executable file\\geckodriver.exe");

		WebDriver Driver = new FirefoxDriver();
		
		

		Driver.get("https://www.leafground.com/select.xhtml");
		// To capture screenshot of whole screen
		File snap = ((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);


		File dest = new File("C:\\Users\\karthikmo\\Screenshot\\img1.png");
		File dest1= new File("C:\\Users\\karthikmo\\Screenshot\\img2.png");
		FileHandler.copy(snap, dest);

		// To capture sceenshot of specific element
		WebElement Logo = Driver.findElement(By.id("j_idt13"));

		File logo =Logo.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(snap, dest1);
		//FileHandler.copy(logo, dest1);

		


	}


}
