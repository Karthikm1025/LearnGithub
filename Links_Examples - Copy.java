package selenium_Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links_Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.gecko.driver", "C:\\Users\\karthikmo\\executable file\\geckodriver.exe");

		WebDriver Driver = new FirefoxDriver();

		Driver.get("https://www.leafground.com/link.xhtml");
		
		//Go to Homepage link
		
		WebElement firstlink = Driver.findElement(By.linkText("Go to Dashboard"));
		
		firstlink.click();
		
		Driver.navigate().back();
		
		//Find the URL without Clicking me
		
		WebElement findwhere = Driver.findElement(By.partialLinkText("Find the URL"));
		
	String result =findwhere.getAttribute("Href");
	System.out.println(result);
	
	//Find the link is broken
	
	WebElement brokenlink = Driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[3]/div/div/a"));
	brokenlink.click();
	String result2=Driver.getTitle();
	if (result2.contains("404")) {
		
		System.out.println("Link is broken");
	}
	Driver.navigate().back();
	
	
	
	//Clicking the same link(first link) again
	WebElement firstlink1 = Driver.findElement(By.linkText("Go to Dashboard"));
	firstlink1.click();
	
	Driver.navigate().back();
	
	
	//find number of link
	
	List <WebElement> numberoflink = Driver.findElements(By.tagName("a"));
	int totallink = numberoflink.size();
	System.out.println(totallink);
		
	}

}
