package selenium_Practise;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown {

	public static void multipleDropdown(WebElement obj, String value) {
		
		Select select = new Select(obj);
		
		List <WebElement> alloption = select.getOptions();
		
		
		for (WebElement drop1 : alloption) {
			
			if (drop1.getText().equals(value)) {
				drop1.click();
				break;
			}
			
		}
		
		
	}
	
	public static void preferCountryDropdown(WebDriver driver, String value ) {
		
	List<WebElement> preferCNTRY =	driver.findElements(By.xpath("//ul[@id='j_idt87:country_items']/li"));
		
	for(WebElement drop2:preferCNTRY) {
		
		if (drop2.getText().equals(value)) {
			
			drop2.click();
		}
		}
		
	
	}
	
	
	public static void CityDropdown (WebDriver Driver, String value) {
		
		//List <WebElement> Cityoptions = name.findElements(By.id("j_idt87:city_items/li"));
		List <WebElement> Cityoptions = Driver.findElements(By.xpath("//ul[@id='j_idt87:city_items']/li"));
		
		//div[@class="ui-selectonemenu-items-wrapper"]//ul[@id="j_idt87:country_items/]/li
		
		for (WebElement cityDropdown:Cityoptions) {
			
			if(cityDropdown.getText().equals(value)) {
				
				cityDropdown.click();
				
			}
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.gecko.driver", "C:\\Users\\karthikmo\\executable file\\geckodriver.exe");

		WebDriver Driver = new FirefoxDriver();

		Driver.get("https://www.leafground.com/select.xhtml");
		
				
		
//		WebElement favouriteUI = Driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[1]/div/div/select"));
//		multipleDropdown(favouriteUI,"Playwright");
		//select[@class='ui-selectonemenu']
		WebElement favouriteUI = Driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		multipleDropdown(favouriteUI,"Cypress");
				
		WebElement preferedCNTRY = Driver.findElement(By.xpath("//label[@id='j_idt87:country_label']"));
		preferedCNTRY.click();
		preferCountryDropdown(Driver, "India");
		
		
		WebElement City = Driver.findElement(By.id("j_idt87:city_label"));
		
		City.click();
		
		CityDropdown(Driver,"Delhi");
		
		
		
		
//		WebElement confirmcity = Driver.findElement(By.xpath("//label[@id=\"j_idt87:city_label\"]"));
//		
//      
//		multipleDropdown(confirmcity,"New York");
//		
		
		
	}

}
