package seleniumAssessment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.edge.driver", "C:\\Users\\karthikmo\\OneDrive - Maveric Systems Limited\\eclipse-workspace\\maveric\\Test-data\\edge driver\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/alerts");

	WebElement clickmElement =	driver.findElement(By.id("confirmButton"));
		clickmElement.click();
		
	Alert alert = driver.switchTo().alert();
		
	alert.accept();
	}

}
