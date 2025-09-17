package seleniumTopics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert_Actions {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.edge.driver", "C:\\Users\\karthikmo\\edgedriver_win64\\msedgedriver.exe");

		EdgeDriver driver3 = new EdgeDriver();

		driver3.get("https://demoqa.com");
		driver3.manage().window().maximize();

		Robot ro2 = new Robot();

		ro2.keyPress(KeyEvent.VK_CONTROL);

		for (int i = 0; i < 4; i++) {

			ro2.keyPress(KeyEvent.VK_MINUS);
			ro2.keyRelease(KeyEvent.VK_MINUS);
		}
		ro2.keyRelease(KeyEvent.VK_CONTROL);



		driver3.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']")).click();

		driver3.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		WebElement alertFrame = driver3.findElement(By.xpath("//div[@class='header-text' and text()='Alerts, Frame & Windows']"));
		JavascriptExecutor js2 = (JavascriptExecutor)driver3;
		js2.executeScript("arguments[0].click();", alertFrame);

		WebDriverWait wait = new WebDriverWait(driver3, Duration.ofSeconds(10));


		WebElement expand = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Alerts']")));

		js2.executeScript("arguments[0].scrollIntoView(true);", expand);
		js2.executeScript("arguments[0].click();", expand);


		WebElement alertButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("timerAlertButton")));

		alertButton.click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver3.switchTo().alert();
		
		alert.accept();


	}

}
