package selenium_Practise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class File_download {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.gecko.driver", "C:\\Users\\karthikmo\\executable file\\geckodriver.exe");
		//FirefoxProfile profile = new FirefoxProfile();
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/xml");  // MIME 
		profile.setPreference("browser.download.panel.shown", false);
		//
		//		DesiredCapabilities capabilities = DesiredCapabilities.
		//		capabilities.setCapability(FirefoxDriver.PROFILE, profile);
		FirefoxOptions browseroption = new FirefoxOptions();
		browseroption.setProfile(profile);
		WebDriver Driver = new FirefoxDriver(browseroption);
		Driver.get("https://www.leafground.com/file.xhtml");

		WebElement download = Driver.findElement(By.xpath("//*[@id=\"j_idt93:j_idt95\"]/span[2]"));

		download.click();
		Thread.sleep(2000);

		Robot robot = new Robot();

		//robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);



		File files = new File("C:\\Users\\karthikmo\\Downloads");

		File[] checkdownloades=	files.listFiles();

		for (File file : checkdownloades) {

			if (file.getName().equals("TestLeaf Logo"))

				System.out.println("found the file");

		}

	}

}
