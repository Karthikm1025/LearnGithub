package selenium_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop_Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.gecko.driver", "C:\\Users\\karthikmo\\executable file\\geckodriver.exe");

		WebDriver Driver = new FirefoxDriver();

		Driver.get("https://www.leafground.com/drag.xhtml");

		WebElement from = Driver.findElement(By.xpath("//*[@id=\"form:drag_content\"]/p"));

		WebElement to = Driver.findElement(By.xpath("//*[@id=\"form:drop_content\"]/p"));

		Actions act = new Actions(Driver);

		//act.dragAndDrop(from, to).build().perform();
		act.clickAndHold(from).moveToElement(to).release(to).build().perform();


	}

}
