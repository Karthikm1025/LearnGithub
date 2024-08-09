package selenium_Practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicTable {

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.gecko.driver", "C:\\Users\\karthikmo\\executable file\\geckodriver.exe");

		WebDriver Driver = new FirefoxDriver();

		Driver.get("https://www.leafground.com/grid.xhtml");
				
		//Find number of columns
		
		List<WebElement> CountofColumns = Driver.findElements(By.tagName("th"));
		
		System.out.println(CountofColumns.size());
		
		//Find number of rows
		
		List <WebElement> countofRows = Driver.findElements(By.tagName("tr"));
		
		System.out.println(countofRows.size());
		
		//td[normalize-space()='Bamboo Watch']//following::td[1]
		
		//Retrieve the text 
		
		WebElement fetchtext = Driver.findElement(By.xpath("//td[text()='Bamboo Watch']//following::td[2]"));
		
		//td[text()='Bamboo Watch']//following::td[1]
		
		//*[@id="form:dt-products_data"]/tr[1]/td[3]
		
		String fetch=fetchtext.getText();
		System.out.println(fetch);
	
		//find the least value and click the checkbox
		
		ArrayList<Float> ClickCheckbox = new ArrayList <Float>();
		
		
		List<WebElement> checkboxClick=Driver.findElements(By.xpath("//td[5]"));
		
		for (WebElement webElement : checkboxClick) {
			
			String individualValues = webElement.getText().replace("$", "");
			ClickCheckbox.add(Float.parseFloat(individualValues));
				
			
		}
		System.out.println(ClickCheckbox);
		
		//Collections.sort(ClickCheckbox);
		float minvalue=Collections.min(ClickCheckbox);		
		
		System.out.println(minvalue);
		
		String $plusminvalue="$"+Float.toString(minvalue); 
		
		//String Finalxpath = //td[text()='$15.00']//
		//td[@role='gridcell']//span[text()='$15.00']//preceding::div[@id="form:dt-products_1004_checkbox"]
		//td[@role='gridcell']//span[text()='$plusminvalue']//preceding::div[@id="form:dt-products_1004_checkbox"]
		String Finalxpath="//td[@role='gridcell']//span[text()="+"\""+$plusminvalue+"\""+"]"+"//preceding::div[@id='form:dt-products_1004_checkbox']";
		
		Driver.findElement(By.xpath(Finalxpath)).click();
		//Driver.findElement(By.xpath("//td[@role='gridcell']//span[text()='$15.00']//preceding::div[@id='form:dt-products_1004_checkbox']")).click();
		
		
	}

}
