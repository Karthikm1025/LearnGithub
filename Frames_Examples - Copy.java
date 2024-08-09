package selenium_Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames_Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.gecko.driver", "C:\\Users\\karthikmo\\executable file\\geckodriver.exe");

		WebDriver Driver = new FirefoxDriver();

		Driver.get("https://www.leafground.com/frame.xhtml");

		Driver.switchTo().frame(0);

		//First button:
		WebElement firstbutton = Driver.findElement(By.id("Click"));

		firstbutton.click();

		String Text=firstbutton.getText();

		System.out.println(Text);

		//second nested button

		Driver.switchTo().defaultContent();
		Driver.switchTo().frame(2);
		Driver.switchTo().frame("frame2");

		WebElement secondbutton = Driver.findElement(By.id("Click"));
		secondbutton.click();

		//finding how many frames
		Driver.switchTo().defaultContent();
		List<WebElement> totalframes=Driver.findElements(By.tagName("iframe"));

		int total=totalframes.size();

		System.out.println(total);

	}

}
