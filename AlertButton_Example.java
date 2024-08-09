package selenium_Practise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertButton_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("Webdriver.gecko.driver", "C:\\Users\\karthikmo\\executable file\\geckodriver.exe");
		
		WebDriver Driver = new FirefoxDriver();
		
		Driver.get("https://www.leafground.com/alert.xhtml");
		
		//Alert button
		WebElement Alertbutton = Driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt91\']/span[2]"));
		
		Alertbutton.click();
		
		Alert alertbutton = Driver.switchTo().alert();
		Thread.sleep(2000);
		alertbutton.accept();
		
		//Confirm button
		
		WebElement Confirmbutton = Driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[2]"));
		Confirmbutton.click();
		
		Alert confirmbutton = Driver.switchTo().alert();
		Thread.sleep(2000);
		confirmbutton.dismiss();
		
		//prompt button
		
		WebElement promptbutton = Driver.findElement(By.xpath(" //*[@id=\"j_idt88:j_idt104\"]/span[2]"));
		
		promptbutton.click();
		
		Alert prompt = Driver.switchTo().alert();
		
		prompt.sendKeys("Karthik");
		Thread.sleep(2000);
		prompt.accept();
		
		
		
		
		
				
		
		
	}

}
