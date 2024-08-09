package selenium_Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Radiobutton_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
    System.setProperty("Webdriver.gecko.driver", "C:\\Users\\karthikmo\\executable file\\geckodriver.exe");
		
		WebDriver Driver = new FirefoxDriver();
		
		Driver.get("https://www.leafground.com/radio.xhtml");

		WebElement unchecked = Driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/div/div/table/tbody/tr/td[2]/div/div[2]/span"));
		
		WebElement checked = Driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/div/div/table/tbody/tr/td[3]/div/div[2]/span"));
		
		boolean result1=unchecked.isSelected();
		boolean result2=checked.isSelected();
		System.out.println(result1);
		System.out.println(result2);
		
		WebElement radiobutton = Driver.findElement(By.xpath("//*[@id=\"j_idt87:console1\"]/tbody/tr/td[2]/div/div[2]/span"));
		radiobutton.click();
		
		
	}

}
