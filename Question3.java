package seleniumAssessment;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Question3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		

		System.setProperty("Webdriver.gecko.driver", "C:\\Users\\karthikmo\\executable file\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demoqa.com/browser-windows");
	String  parentwindow =	driver.getWindowHandle();
		driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		
	Set<String> eachwindow = 	driver.getWindowHandles();
		
	for(String newtab:eachwindow) {

		if (!newtab.equals(parentwindow)) {
			//System.out.println("this is not parent window");
			driver.switchTo().window(newtab);
		
			//System.out.println("this is  parent window");
		
		}
	}
	File snap = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest1= new File("C:\\Users\\karthikmo\\Screenshot\\img2.png");
	FileUtils.copyFile(snap, dest1);
	}

}
