package selenium_Practise;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. static wait (Thread.sleep)
		//2. Dynamic wait 
		//   a) Implicit wait - used whenever new window or webpage is loading 
		//   b) Explicit Wait - used - when any one element in webpage takes time to load means we can use this
		//   c) Fluent Wait - used - when any one element in webpage takes time to load means we can use this(memory saving)
		
		
		System.setProperty("Webdriver.gecko.driver", "C:\\Users\\karthikmo\\executable file\\geckodriver.exe");

		WebDriver Driver = new FirefoxDriver();

		Driver.get("https://www.leafground.com/list.xhtml");
	//   a) Implicit wait
		Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Driver.findElement(By.xpath("//span//a[3]"));
		
		// b) Explicit Wait
		
		WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.visibilityOf(Driver.findElement(By.xpath("//span[@class=\"ui-button-icon-left ui-icon ui-c pi pi-th-large\"]"))));
		
		
		
	}

}
