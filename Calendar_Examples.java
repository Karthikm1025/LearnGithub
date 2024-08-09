package selenium_Practise;

import java.sql.Driver;

import javax.swing.border.TitledBorder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calendar_Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		System.setProperty("Webdriver.gecko.driver", "C:\\Users\\karthikmo\\executable file\\geckodriver.exe");
		//
		//		WebDriver Driver = new FirefoxDriver();

		System.setProperty("webdriver.edge.driver", "C:\\Users\\karthikmo\\executable file\\New folder\\msedgedriver.exe");

		WebDriver Driver = new EdgeDriver();
		Driver.get("https://www.leafground.com/calendar.xhtml");

		//*[@id="j_idt87:schedule"]/div[1]/div[1]/div/button[2]

		Driver.findElement(By.xpath("//div//button[text()=\"Next\"]")).click();

		//*[@id="j_idt87:schedule"]/div[2]/div/table/tbody/tr/td/div/div/div/table/tbody/tr[4]/td[5]/div
		Driver.findElement(By.xpath("//td[@data-date=\"2024-03-06\"]//a[text()='6']")).click();

		//WebElement Textbox = Driver.findElement(By.xpath("//input[@id='j_idt87:title']"));
		//Textbox.click();s
		//Textbox.sendKeys("Testing");
		WebElement	Title = Driver.findElement(By.xpath("//input[@id='j_idt87:title']"));
		Title.click();
		Title.sendKeys("karthik");


		WebElement savebutton=Driver.findElement(By.xpath("//span[text()='Save']"));

		savebutton.click();


	}

}
