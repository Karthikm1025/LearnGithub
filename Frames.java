package seleniumTopics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Frames {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "C:\\Users\\karthikmo\\edgedriver_win64\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement alertFrames = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true)", alertFrames);

		alertFrames.click();

		Robot ro = new Robot();

		ro.keyPress(KeyEvent.VK_CONTROL);

		for(int i=0; i<4; i++) {
			ro.keyPress(KeyEvent.VK_MINUS);
			ro.keyRelease(KeyEvent.VK_MINUS);


		}

		//		driver.findElement(By.xpath("//span[text()='Frames']")).click();
		//
		//		driver.switchTo().frame("frame1");
		//
		//		WebElement frame1 = driver.findElement(By.id("sampleHeading"));
		//
		//		System.out.println(frame1.getText());
		//
		//		driver.switchTo().defaultContent();
		//
		//		driver.switchTo().frame("frame2");
		//		String text2 = driver.findElement(By.id("sampleHeading")).getText();
		//
		//		System.out.println("Second frame --->"+ text2);
		//
		//		driver.switchTo().defaultContent();

		driver.findElement(By.xpath("//span[text()='Nested Frames']")).click();
		WebElement nested1 = driver.findElement(By.xpath("//div/iframe[@id='frame1']"));
		driver.switchTo().frame(nested1);
		WebElement nestedf = driver.findElement(By.xpath("//body[text()='Parent frame']"));


		System.out.println(nestedf.getText());
//		
//		
//		driver.switchTo().frame(insidef);
		
		driver.switchTo().frame(0);
		WebElement insidef = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
		
		System.out.println(insidef.getText());
     
		driver.switchTo().parentFrame();
		
		System.out.println(nestedf.getText());


	}

}


