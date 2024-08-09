package selenium_Practise;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Intro_selenium {
	
		
public static void main(String[] args) {
  
	System.setProperty("webdriver.edge.driver", "C:\\Users\\karthikmo\\executable file\\New folder\\msedgedriver.exe");
	
	WebDriver driver = new EdgeDriver();
	
//	driver.get("https://www.leafground.com/link.xhtml");
//	//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("motorola"+Keys.ENTER);
//	driver.findElement(By.partialLinkText("Find the URL")).click();
	
	driver.get("https://www.leafground.com/input.xhtml");
	driver.manage().window().maximize();
	WebElement NameTextbox = driver.findElement(By.id("j_idt88:name"));
	NameTextbox.sendKeys("karthik");
	
	WebElement countrybox= driver.findElement(By.id("j_idt88:j_idt91"));
	countrybox.sendKeys(" India");
	
	
	WebElement disablecheck=driver.findElement(By.id("j_idt88:j_idt93"));
	boolean check=	disablecheck.isEnabled();
	////input[@id="j_idt88:j_idt93"]
	System.out.println(check);
	WebElement clearbox=driver.findElement(By.id("j_idt88:j_idt95"));
	
	clearbox.clear();
	
	WebElement retrievetext=driver.findElement(By.id("j_idt88:j_idt97"));
	String Value = retrievetext.getAttribute("value");
	System.out.println(Value);
	
	
	
	//driver.quit();
	
}
}
