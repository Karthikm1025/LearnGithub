package selenium_Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable_Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("Webdriver.gecko.driver", "C:\\Users\\karthikmo\\executable file\\geckodriver.exe");

		WebDriver Driver = new FirefoxDriver();

		Driver.get("https://www.leafground.com/list.xhtml");

		List<WebElement> selectable = Driver.findElements(By.xpath("//*[@id=\'pickList\']/div[2]/ul/li"));

		int totalsize =	selectable.size();

		JavascriptExecutor js = (JavascriptExecutor) Driver;

		WebElement scroll =	Driver.findElement(By.xpath("//h5[text()='Pick List']"));


		js.executeScript("arguments[0].scrollIntoView();", scroll);



		Actions action = new Actions(Driver);

		//	//action.clickAndHold(selectable.get(0)).perform();
		//	action.clickAndHold(selectable.get(1));
		//	action.clickAndHold(selectable.get(2));

		action.keyDown(Keys.CONTROL).click(selectable.get(0)).click(selectable.get(1)).click(selectable.get(2)).perform();


		//	action.build().perform();


	}

}
