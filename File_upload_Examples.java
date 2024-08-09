package selenium_Practise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class File_upload_Examples {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		//"C:\Users\karthikmo\Downloads\TestLeaf Logo";
		System.setProperty("Webdriver.gecko.driver", "C:\\Users\\karthikmo\\executable file\\geckodriver.exe");

		WebDriver Driver = new FirefoxDriver();

		Driver.get("https://www.leafground.com/file.xhtml");
		
		String file = "C:\\Users\\karthikmo\\Downloads\\TestLeaf_Logo.png";
		WebElement uploadbutton = Driver.findElement(By.name("j_idt88:j_idt89_input"));
		
		uploadbutton.sendKeys(file);
		//*[@id="j_idt88:j_idt89_input"]
		
		StringSelection selection = new StringSelection(file);
		
		Thread.sleep(2000);
		//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		Robot robot = new Robot();
		
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		robot.keyRelease(KeyEvent.VK_V);
//		Thread.sleep(2000);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		
		
		
		
		
		
	}

}
