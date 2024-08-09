package selenium_Practise;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown_examples {

	//public static void main(String[] args) {
	// TODO Auto-generated method stub
	@Test(enabled=true)
	public void dropdown() {
		System.setProperty("Webdriver.gecko.driver", "C:\\Users\\karthikmo\\executable file\\geckodriver.exe");

		WebDriver Driver = new FirefoxDriver();

		Driver.get("https://www.leafground.com/select.xhtml");

		WebElement dropdown = Driver.findElement(By.xpath("//*[@id=\'j_idt87\']/div/div[1]/div[1]/div/div/select"));

		Select select = new Select(dropdown);

		select.selectByIndex(4);
		select.selectByVisibleText("Selenium");
		//select.selectByvalue();
		//dropdown.sendKeys("Cypress");

		//WebElement multidropdown = Driver.findElement(By.xpath("/html/body/span/ul"));

		//Select select2 = new Select(multidropdown);
 
	ArrayList<String> listop = new ArrayList<String>();
	listop.add("AWS");
	listop.add("Appium");
	listop.add("Playwright");
	
	for(String dropdownoptions:listop) {
		
		Driver.findElement(By.xpath("//button[@type='button']")).click();

		List<WebElement> listofoption = Driver.findElements(By.xpath("//span[@role='listbox']/ul/li"));

		int size = listofoption.size();
		//System.out.println(size);
		for (int i=0; i<=size-1; i++) {
			if (listofoption.get(i).getText().contains(dropdownoptions)) {

				listofoption.get(i).click();
              break;
			}
	
	}
	
		




		}


	}


}