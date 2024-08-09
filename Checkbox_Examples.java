package selenium_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox_Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("Webdriver.gecko.driver", "C:\\Users\\karthikmo\\executable file\\geckodriver.exe");

		WebDriver Driver = new FirefoxDriver();

		Driver.get("https://www.leafground.com/checkbox.xhtml");
		
		WebElement checkbox1=Driver.findElement(By.xpath("//*[@id=\'j_idt87:basic\']/tbody/tr/td[2]/div/div[2]/span"));
		
		checkbox1.click();
		
		WebElement checkbox2=Driver.findElement(By.xpath(" //*[@id=\"j_idt87:basic\"]/tbody/tr/td[1]/div/div[2]"));
		checkbox2.click();
		

	}

}
