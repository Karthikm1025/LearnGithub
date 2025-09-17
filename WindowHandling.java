package seleniumTopics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandling {

	public static void main(String[] args) throws AWTException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "C:\\Users\\karthikmo\\edgedriver_win64\\msedgedriver.exe");

		EdgeDriver driver2 = new EdgeDriver();

		driver2.get("https://demoqa.com/");

		driver2.manage().window().maximize();
		driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Robot R = new Robot();
		R.keyPress(KeyEvent.VK_CONTROL);

		for (int i = 0; i < 5; i++) {

			R.keyPress(KeyEvent.VK_MINUS);
			R.keyRelease(KeyEvent.VK_MINUS);

		}

		R.keyRelease(KeyEvent.VK_CONTROL);
		//
		driver2.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']")).click();

		driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		JavascriptExecutor js1 = (JavascriptExecutor) driver2;
		WebElement modeld = driver2.findElement(By.xpath("//span[text()='Modal Dialogs']"));

		js1.executeScript("arguments[0].scrollIntoView(true)", modeld);

		driver2.findElement(By.xpath("//span[text()='Browser Windows']")).click();

		String ParentW = driver2.getWindowHandle();

		driver2.findElement(By.id("tabButton")).click();
		driver2.findElement(By.id("windowButton")).click();
		driver2.findElement(By.id("messageWindowButton")).click();

		LinkedHashSet <String> windowHandles = new LinkedHashSet<> (driver2.getWindowHandles());


		System.out.println(windowHandles.size());

		for (String iterate : windowHandles) {

			if (!ParentW.equals(iterate)) {
				//
				//				// System.out.println(iterate);
				//
				driver2.switchTo().window(iterate);
				//System.out.println(driver2.getCurrentUrl());

			}




		}
		String message = (String) ((JavascriptExecutor)driver2).executeScript("return document.body.textContent;");
		System.out.println(message);


		//		File src = ((TakesScreenshot)driver2).getScreenshotAs(OutputType.FILE);
		//
		//		File sharepath = new File("C:\\Users\\karthikmo\\OneDrive - Maveric Systems Limited\\Documents\\SeleniumScreenshots\\screenshot.png");
		//		
		//		FileUtils.copyFile(src, sharepath);
		//		
		//		System.out.println("program completed");
		//		


		File src2 = ((TakesScreenshot)driver2).getScreenshotAs(OutputType.FILE);

		File path = new File("C:\\Users\\karthikmo\\OneDrive - Maveric Systems Limited\\Documents\\SeleniumScreenshots");

		FileUtils.copyDirectory(src2, path);
























	}

}
