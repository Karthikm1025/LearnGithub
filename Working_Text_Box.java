package selenium_Practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Working_Text_Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\karthikmo\\executable file\\New folder\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		WebElement NameTextbox = driver.findElement(By.id("j_idt88:name"));
		NameTextbox.sendKeys("karthik");
		
		WebElement countrybox= driver.findElement(By.id("j_idt88:j_idt91"));
		countrybox.sendKeys(" India");
		
		
		WebElement disablecheck=driver.findElement(By.id("j_idt88:j_idt93"));
		boolean check=	disablecheck.isEnabled();
		System.out.println(check);
		
		WebElement clearbox=driver.findElement(By.id("j_idt88:j_idt95"));
		
		clearbox.clear();
		
		WebElement retrievetext=driver.findElement(By.id("j_idt88:j_idt97"));
		String Value = retrievetext.getAttribute("value");
		System.out.println(Value);
		
	}

}
