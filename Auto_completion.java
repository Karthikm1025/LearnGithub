package selenium_Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Auto_completion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("Webdriver.gecko.driver", "C:\\Users\\karthikmo\\executable file\\geckodriver.exe");

		WebDriver Driver = new FirefoxDriver();

		Driver.get("https://www.leafground.com/select.xhtml");

		Driver.findElement(By.xpath("//*[@id=\"j_idt87:auto-complete\"]/button/span[1]")).click();

		WebElement option = Driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/div/ul/li/input"));
		option.sendKeys("S");


		List<WebElement> listoptions=Driver.findElements(By.xpath("//*[@id=\"j_idt87:auto-complete_panel\"]/ul/li"));

		System.out.println(listoptions.size());

		for(WebElement webelement:listoptions) {

			if (webelement.getText().equals("Selenium WebDriver")) {

				webelement.click();
				break;
			}
		}

	}

}
