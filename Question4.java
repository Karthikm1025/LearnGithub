package seleniumAssessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.w3c.dom.Text;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.gecko.driver", "C:\\Users\\karthikmo\\executable file\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://demoqa.com/frames");

		driver.switchTo().frame("frame1");

		WebElement	Text =	driver.findElement(By.id("sampleHeading"));

		String text =   Text.getText();
		System.out.println("Frame1 " + text);
		
		
		driver.switchTo().defaultContent();

		driver.switchTo().frame("frame2");
		WebElement findElement2 = driver.findElement(By.id("sampleHeading"));

		String text2 = findElement2.getText();
		System.out.println("Frame 2  " + text2);


	}

}
